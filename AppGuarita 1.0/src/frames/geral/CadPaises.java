package frames.geral;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;




public class CadPaises extends javax.swing.JFrame {

    public CadPaises() {
        initComponents();
        this.iniciaComponentes();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdPais = new javax.swing.JTextField();
        txtCodAreaTelPais = new javax.swing.JTextField();
        txtCodIBGEPais = new javax.swing.JTextField();
        txtCodBacenPais = new javax.swing.JTextField();
        txtNomePais = new javax.swing.JTextField();
        txtSiglaPais = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnDesfazer = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtIdPesquisa = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Cod Area Tel");

        jLabel4.setText("Cod IBGE");

        jLabel5.setText("Cod Bacen");

        jLabel6.setText("Sigla");

        txtCodAreaTelPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodAreaTelPaisKeyPressed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnDesfazer.setText("Desfazer");
        btnDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfazerActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        Pesquisar.setText("Pesquisar");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        btnPrimeiro.setText("<<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        AreaResultado.setEditable(false);
        AreaResultado.setColumns(20);
        AreaResultado.setRows(5);
        AreaResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jScrollPane2.setViewportView(AreaResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSiglaPais)
                            .addComponent(txtNomePais)
                            .addComponent(txtIdPais)
                            .addComponent(txtCodIBGEPais)
                            .addComponent(txtCodBacenPais)
                            .addComponent(txtCodAreaTelPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDesfazer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProximo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pesquisar)))
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDesfazer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodAreaTelPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodIBGEPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCodBacenPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSiglaPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void iniciaComponentes() {
      
        txtIdPais.setText("0");
        //txtIdPais.setEditable(false);
        txtCodAreaTelPais.setText("");
        txtCodAreaTelPais.requestFocus();
        txtCodIBGEPais.setText("");
        txtCodBacenPais.setText("");
        txtNomePais.setText("");
        txtSiglaPais.setText("");
        AreaResultado.removeAll();
        
    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated
    private void adicionaPais() throws SQLException{
        String scriptSQL = "INSERT INTO paises (cod_tel_pais, cod_ibge, cod_bacen, nome, sigla) "
                         + "VALUES (?, ?, ?, ?, ?);";
        PreparedStatement conectaSQLeExecutaScript = mysql.connector.connectMySQL.getConnection().prepareStatement(scriptSQL);
        conectaSQLeExecutaScript.setString(1, txtCodAreaTelPais.getText().toUpperCase());
        conectaSQLeExecutaScript.setString(2, txtCodIBGEPais.getText().toUpperCase());
        conectaSQLeExecutaScript.setString(3, txtCodBacenPais.getText().toUpperCase());
        conectaSQLeExecutaScript.setString(4, txtNomePais.getText().toUpperCase());
        conectaSQLeExecutaScript.setString(5, txtSiglaPais.getText().toUpperCase());
        conectaSQLeExecutaScript.execute();
    }
    private void atualizaPais() throws SQLException {
        String scriptSQL = ("UPDATE paises SET "
                + "cod_tel_pais = ?, "
                + "cod_ibge = ?, "
                + "cod_bacen = ?, "
                + "nome = ?, "
                + "sigla = ? WHERE id = ?");
        PreparedStatement pst = mysql.connector.connectMySQL.getConnection().prepareStatement(scriptSQL);
        pst.setString(1, txtCodAreaTelPais.getText().toUpperCase());
        pst.setString(2, txtCodIBGEPais.getText().toUpperCase());
        pst.setString(3, txtCodBacenPais.getText().toUpperCase());
        pst.setString(4, txtNomePais.getText().toUpperCase());
        pst.setString(5, txtSiglaPais.getText().toUpperCase());
        pst.setInt(6, Integer.parseInt(txtIdPais.getText()));
        pst.execute();
    }
 
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        this.iniciaComponentes();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesfazerActionPerformed
        // TODO add your handling code here:
        this.iniciaComponentes();
    }//GEN-LAST:event_btnDesfazerActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        //VERIFICAR ESPAÇOS VAZIOS
        if (txtCodAreaTelPais.getText().trim().equals(""))      {
            JOptionPane.showMessageDialog(null, "Favor digite o código de area de TELEFONE do país!");
            txtCodAreaTelPais.requestFocus();
            txtCodAreaTelPais.setBackground(Color.red);
            return;
       
        } else if (txtCodIBGEPais.getText().trim().equals(""))  {
            JOptionPane.showMessageDialog(null, "Favor digite o código do IBGE do país!");
            txtCodIBGEPais.requestFocus();
            txtCodIBGEPais.setBackground(Color.red);
            return;
        } else if (txtCodBacenPais.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor digite o código do BACEN do país!");
            txtCodBacenPais.requestFocus();
            txtCodBacenPais.setBackground(Color.red);
            return;
        } else if (txtNomePais.getText().trim().equals(""))     {
            JOptionPane.showMessageDialog(null, "Favor digite o NOME do país!");
            txtNomePais.requestFocus();
            txtNomePais.setBackground(Color.red);
            return;
        } else if (txtSiglaPais.getText().trim().equals(""))    {
            JOptionPane.showMessageDialog(null, "Favor digite a SIGLA do país!");
            txtSiglaPais.requestFocus();
            txtSiglaPais.setBackground(Color.red);
            return;
        }
    
        //ADICIONANDO
        try {
            if (txtIdPais.getText().equals("0")) { //INSERT
                adicionaPais();
                AreaResultado.append("Registro inserido com sucesso!"+"\n");
            } else { //UPDATE
                atualizaPais();
                AreaResultado.append("Registro atualizado com sucesso!"+"\n");
            }
            this.iniciaComponentes();
        } catch (SQLException mensagem) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+mensagem.getMessage());
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCodAreaTelPaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodAreaTelPaisKeyPressed
        // TODO add your handling code here:
        txtCodAreaTelPais.setBackground(Color.white);
    }//GEN-LAST:event_txtCodAreaTelPaisKeyPressed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
       
        try{
            String scriptSQL = ("SELECT * FROM paises ORDER BY id ASC");
            Statement stmt = mysql.connector.connectMySQL.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(scriptSQL);
               AreaResultado.removeAll();
               
               while(rs.next()){
                    AreaResultado.append("******************************"           +"\n"
                                        +"ID........: "+rs.getInt("id")             +"\n"
                                        +"COD TEL...: "+rs.getString("cod_tel_pais")+"\n"
                                        +"COD IBGE..: "+rs.getString("cod_ibge")    +"\n"
                                        +"COD BACEN.: "+rs.getString("cod_bacen")   +"\n"
                                        +"NOME......: "+rs.getString("nome")        +"\n"
                                        +"SIGLA.....: "+rs.getString("sigla")       +"\n"                              
                                        );
                                    }
              
            
        }catch(SQLException ex){
            System.out.println("ERRO:"+ex.getMessage());
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        // TODO add your handling code here:
         try{
            String scriptSQL = ("SELECT * FROM paises WHERE id = "+Integer.parseInt(txtIdPesquisa.getText()));
            Statement stmt = mysql.connector.connectMySQL.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(scriptSQL);
            if (txtIdPesquisa.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Digite um código para ser pesquisado!");
            }
            if (rs.next()){
                txtIdPais.setText(rs.getString("id"));
                txtCodAreaTelPais.setText(rs.getString("cod_tel_pais"));
                txtCodIBGEPais.setText(rs.getString("cod_ibge"));
                txtCodBacenPais.setText(rs.getString("cod_bacen"));
                txtNomePais.setText(rs.getString("nome"));
                txtSiglaPais.setText(rs.getString("sigla"));
            } else {
                JOptionPane.showMessageDialog(null, "Código não localizado !");
                txtIdPesquisa.requestFocus();
            }
               
        }catch(SQLException ex){
            System.out.println("ERRO:"+ex.getMessage());
        }
    }//GEN-LAST:event_PesquisarActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        // TODO add your handling code here:
        try{
            String scriptSQL = ("SELECT * FROM paises ORDER BY id ASC");
            Statement stmt = mysql.connector.connectMySQL.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(scriptSQL);

            if (rs.first()){
                txtIdPais.setText(rs.getString("id"));
                txtCodAreaTelPais.setText(rs.getString("cod_tel_pais"));
                txtCodIBGEPais.setText(rs.getString("cod_ibge"));
                txtCodBacenPais.setText(rs.getString("cod_bacen"));
                txtNomePais.setText(rs.getString("nome"));
                txtSiglaPais.setText(rs.getString("sigla"));
            } 
               
        }catch(SQLException ex){
            System.out.println("ERRO:"+ex.getMessage());
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        try{
            String scriptSQL = ("SELECT * FROM paises ORDER BY id ASC");
            Statement stmt = mysql.connector.connectMySQL.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(scriptSQL);

            if (rs.previous()){
                txtIdPais.setText(rs.getString("id"));
                txtCodAreaTelPais.setText(rs.getString("cod_tel_pais"));
                txtCodIBGEPais.setText(rs.getString("cod_ibge"));
                txtCodBacenPais.setText(rs.getString("cod_bacen"));
                txtNomePais.setText(rs.getString("nome"));
                txtSiglaPais.setText(rs.getString("sigla"));
            } 
               
        }catch(SQLException ex){
            System.out.println("ERRO:"+ex.getMessage());
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here
        try{
            String scriptSQL = ("SELECT * FROM paises ORDER BY id ASC");
            Statement stmt = mysql.connector.connectMySQL.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(scriptSQL);

            if (rs.next()){
                txtIdPais.setText(rs.getString("id"));
                txtCodAreaTelPais.setText(rs.getString("cod_tel_pais"));
                txtCodIBGEPais.setText(rs.getString("cod_ibge"));
                txtCodBacenPais.setText(rs.getString("cod_bacen"));
                txtNomePais.setText(rs.getString("nome"));
                txtSiglaPais.setText(rs.getString("sigla"));
            }
               
        }catch(SQLException ex){
            System.out.println("ERRO:"+ex.getMessage());
        }    
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:

        try{
            String scriptSQL = ("SELECT * FROM paises ORDER BY id ASC");
            Statement stmt = mysql.connector.connectMySQL.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(scriptSQL);

            if (rs.last()){
                txtIdPais.setText(rs.getString("id"));
                txtCodAreaTelPais.setText(rs.getString("cod_tel_pais"));
                txtCodIBGEPais.setText(rs.getString("cod_ibge"));
                txtCodBacenPais.setText(rs.getString("cod_bacen"));
                txtNomePais.setText(rs.getString("nome"));
                txtSiglaPais.setText(rs.getString("sigla"));
            } 
               
        }catch(SQLException ex){
            System.out.println("ERRO:"+ex.getMessage());
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
         if (txtIdPais.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Selecione um Registro");
            return;
        }
        if (JOptionPane.showConfirmDialog(null, "Remover?")!=0){
            return;
        }
            try {
                String SQL = "DELETE FROM paises WHERE id = ?";
                PreparedStatement pst = mysql.connector.connectMySQL.getConnection().prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(txtIdPais.getText()));
                if (pst.executeUpdate()!=0){
                    JOptionPane.showMessageDialog(null, "Removido");
                }else{
                    JOptionPane.showMessageDialog(null, " Não Removido");
                }
                this.iniciaComponentes();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        
    
    }//GEN-LAST:event_btnRemoverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPaises().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaResultado;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCodAreaTelPais;
    private javax.swing.JTextField txtCodBacenPais;
    private javax.swing.JTextField txtCodIBGEPais;
    private javax.swing.JTextField txtIdPais;
    private javax.swing.JTextField txtIdPesquisa;
    private javax.swing.JTextField txtNomePais;
    private javax.swing.JTextField txtSiglaPais;
    // End of variables declaration//GEN-END:variables
    
}
