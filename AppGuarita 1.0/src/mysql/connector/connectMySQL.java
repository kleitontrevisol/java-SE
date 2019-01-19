
package mysql.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectMySQL {
    private static Connection connection = null;
    
    public connectMySQL(){
   
    }
    
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/controle_mov_veiculos","root","");
        }
        return connection;
    }
}
