-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 11-Abr-2017 às 22:25
-- Versão do servidor: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `controle_mov_veiculos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `motorista`
--

CREATE TABLE `motorista` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `cpf` char(14) NOT NULL,
  `cnh` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `paises`
--

CREATE TABLE `paises` (
  `id` int(11) NOT NULL,
  `cod_tel_pais` char(3) NOT NULL,
  `cod_ibge` varchar(10) DEFAULT NULL,
  `cod_bacen` varchar(10) DEFAULT NULL,
  `nome` varchar(50) NOT NULL,
  `sigla` char(3) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `paises`
--

INSERT INTO `paises` (`id`, `cod_tel_pais`, `cod_ibge`, `cod_bacen`, `nome`, `sigla`) VALUES
(3, '+1', '840', '2496', 'ESTADOS UNIDOS', 'USA'),
(1, '+55', '076', '1058', 'BRASIL', 'BRA');

-- --------------------------------------------------------

--
-- Estrutura da tabela `proprietario_veiculo`
--

CREATE TABLE `proprietario_veiculo` (
  `id` int(11) NOT NULL,
  `tipo` char(1) NOT NULL,
  `cpf` char(14) DEFAULT NULL,
  `cnfpj` char(18) DEFAULT NULL,
  `num_rntrc` decimal(65,0) DEFAULT NULL,
  `nome_pess` varchar(100) NOT NULL,
  `uf` char(2) NOT NULL,
  `tip_prop` char(1) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `reg_mov_veiculos`
--

CREATE TABLE `reg_mov_veiculos` (
  `id` int(11) NOT NULL,
  `tipo` char(2) NOT NULL,
  `placa` varchar(20) NOT NULL,
  `nome` varchar(100) DEFAULT 'Minha Empresa',
  `id_motorista` int(11) NOT NULL,
  `nome_ajudante` varchar(100) DEFAULT NULL,
  `km` int(11) DEFAULT NULL,
  `data_mov` date NOT NULL,
  `hora_mov` time NOT NULL,
  `entrada_ou_saida` char(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `uf`
--

CREATE TABLE `uf` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `sigla` char(2) NOT NULL,
  `fuso_horario` char(3) DEFAULT NULL,
  `cod_ibge` varchar(3) DEFAULT NULL,
  `pais_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `uf`
--

INSERT INTO `uf` (`id`, `nome`, `sigla`, `fuso_horario`, `cod_ibge`, `pais_id`) VALUES
(1, 'SANTA CATARINA', 'SC', '-3', '42', 1),
(3, 'RONDÔNIA	', 'RO', '-4', '11', 1),
(4, 'ACRE', 'AC', '-5', '12', 1),
(5, 'AMAZONAS', 'AM', '-4', '13', 1),
(6, 'RORAIMA', 'RR', '-4', '14', 1),
(7, 'PARÁ', 'PA', '-3', '15', 1),
(8, 'AMAPÁ', 'AP', '-3', '16', 1),
(9, 'TOCANTINS', 'TO', '-3', '17', 1),
(10, 'MARANHÃO', 'MA', '-3', '21', 1),
(11, 'PIAUÍ', 'PI', '-3', '22', 1),
(12, 'CEARÁ', 'CE', '-3', '23', 1),
(13, 'RIO GRANDE DO NORTE	', 'RN', '-3', '24', 1),
(14, 'PARAÍBA', 'PB', '-3', '25', 1),
(15, 'PERNAMBUCO', 'PE', '-3', '26', 1),
(16, 'ALAGOAS', 'AL', '-3', '27', 1),
(17, 'SERGIPE', 'SE', '-3', '28', 1),
(18, 'BAHIA', 'BH', '-3', '29', 1),
(19, 'MINAS GERAIS	', 'MG', '-3', '31', 1),
(20, 'ESPÍRITO SANTO	', 'ES', '-3', '32', 1),
(24, 'ESTADO DO BRASIL', 'EB', '-3', '333', 1),
(25, 'ESTADO DOS EUA', 'ED', '-2', '444', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `sobrenome` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `cpf` char(14) NOT NULL,
  `login` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios_por_filial`
--

CREATE TABLE `usuarios_por_filial` (
  `id` int(11) NOT NULL,
  `server` varchar(100) NOT NULL,
  `filial` varchar(100) NOT NULL,
  `setor_func` varchar(100) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `usuario` varchar(200) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `last_logon` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuarios_por_filial`
--

INSERT INTO `usuarios_por_filial` (`id`, `server`, `filial`, `setor_func`, `nome`, `usuario`, `senha`, `last_logon`) VALUES
(1, 'SVR-RDS', 'AR', '', 'SILVINA RIZZUTO', 'silvina.rizzuto@icon', 'icon.123', '09/02/2017 08:40:17'),
(2, 'SVR-RDS', 'AR', '', 'LUCIANO BITTENCOURT', 'luciano.bittencourt@icon', 'icon.123', '13/02/2017 14:38:51'),
(3, 'SVR-RDS', 'AR', '', 'CONTABILIDADE', 'contabilidade@icon', 'icon.123', ''),
(4, 'SVR-RDS', 'AR', '', 'CARLOS RAMIRO', 'carlos.ramiro@icon', 'icon.123', ''),
(5, 'SVR-RDS', 'AR', '', 'BENJAMÍN SÁENZ VALIENTE', 'benjamin.valiente@icon', 'icon.123', '04/01/2017 12:13:07'),
(6, 'SVR-RDS', 'PB', '', 'SHEYLLA EVARISTO', 'sheylla.evaristo@icon', 'icon.123', '03/04/2017 14:30:17'),
(7, 'SVR-RDS', 'PB', '', 'SANDER ANDRADE DE SOUZA', 'sander.souza@icon', 'icon.123', '04/04/2017 14:06:21'),
(8, 'SVR-RDS', 'PB', '', 'NAYRA TOSCANO', 'nayra.toscano@icon', 'icon.123', '03/04/2017 14:20:29'),
(9, 'SVR-RDS', 'PB', '', 'MELQUICEDEC BORGES', 'melquicedec.borges@icon', 'icon.123', '03/04/2017 15:01:53'),
(10, 'SVR-RDS', 'PB', '', 'GENILDO LINO', 'genildo.lino@icon', 'icon.123', '09/02/2017 16:30:24'),
(11, 'SVR-RDS', 'PB', '', 'ENCARREGADOS PARAIBA', 'encarregadospb@icon', 'icon.123', '04/01/2017 12:13:16'),
(12, 'SVR-RDS', 'PB', '', 'ARAMIS ARAUJO', 'aramis.araujo@icon', 'icon.123', '03/04/2017 15:21:32'),
(13, 'SVR-RDS', 'PB', '', 'ANTONIO JOÃO DOS SANTOS', 'joao.santos@icon', 'icon.123', '04/01/2017 12:12:54'),
(14, 'SVR-RDS', 'RC', '', 'VALDEMAR NETO', 'valdemar.neto@icon', 'icon.123', '04/04/2017 14:28:56'),
(15, 'SVR-RDS', 'RC', '', 'RONALDO RAMOS DE ALCANTARA', 'ronaldo.ramos@icon', 'icon.123', '10/04/2017 10:58:53'),
(16, 'SVR-RDS', 'RC', '', 'PAULA VICTORELLI', 'paula.victorelli@icon', 'icon.123', '03/04/2017 14:35:58'),
(17, 'SVR-RDS', 'RC', '', 'NATALIA MANGINI', 'natalia.mangini@icon', 'icon.123', ''),
(18, 'SVR-RDS', 'RC', '', 'MARCELO MANCUZO', 'marcelo.mancuzo@icon', 'icon.123', '03/04/2017 14:50:09'),
(19, 'SVR-RDS', 'RC', '', 'LUCIANA ALMEIDA RAMOS', 'luciana.ramos@icon', 'icon.123', '04/01/2017 12:13:34'),
(20, 'SVR-RDS', 'RC', '', 'HENRY MARCELO MULLER', 'henry.muller@icon', 'icon.123', '04/01/2017 12:13:23'),
(21, 'SVR-RDS', 'RC', '', 'ENCARREGADOS RC', 'encarregadosrc@icon', 'icon.123', '03/04/2017 14:20:12'),
(22, 'SVR-RDS', 'RC', '', 'EDMAR SARTORI', 'edmar.sartori@icon', 'icon.123', '03/04/2017 14:20:33'),
(23, 'SVR-RDS', 'RC', '', 'CAROLINA MININI', 'carolina.minini@icon', 'icon.123', '03/04/2017 14:33:47'),
(24, 'SVR-RDS', 'RC', '', 'ASSISTENCIA RC', 'assistenciarc@icon', 'icon.123', '04/01/2017 12:12:39'),
(25, 'SVR-RDS', 'RC', '', 'ALMOXARIFADO RC', 'almoxarifadorc@icon', 'icon.123', '06/04/2017 11:30:58'),
(26, 'SVR-RDS', 'RC', '', 'ALESSANDRO CALÇAVARA', 'alessandro.calcavara@icon', 'icon.123', '11/04/2017 07:43:38'),
(27, 'SVR-RDS', 'RC', '', 'ALESSANDRO APARECIDO FRANCISCO', 'alessandro.francisco@icon', 'icon.123', '03/04/2017 14:32:41'),
(28, 'SVR-RDS', 'RC', '', 'AGUINALDO SANTOS', 'aguinaldo.santos@icon', 'icon.123', '04/01/2017 12:12:44'),
(29, 'SVR-RDS', 'MATRIZ', '', 'ADMINISTRATOR', 'administrator@icon', '*', '04/04/2017 15:30:37'),
(30, 'SVR-RDS', 'TB', 'ADMINISTRATIVO', 'RICARTE PORTON WERNKE', 'Ricarte.Wernke@icon', 'icon.123', '03/04/2017 15:28:21'),
(31, 'SVR-RDS', 'TB', 'ADMINISTRATIVO', 'GILIAN SILVIO DE SOUZA', 'Gilian.Souza@icon', 'icon.123', '11/04/2017 10:09:44'),
(32, 'SVR-RDS', 'TB', 'ALMOXARIFADO', 'ALMOXARIFADO TB', 'almoxarifadotb@icon', 'icon.123', '03/04/2017 14:20:29'),
(33, 'SVR-RDS', 'TB', 'FABRICA', 'ENCARREGADOS TB', 'encarregadostb@icon', 'icon.123', '05/04/2017 21:53:57'),
(34, 'SVR-RDS', 'TB', 'FINANCEIRO', 'CLEBER BOMBAZAR', 'cleber.bombazar@icon', 'icon.123', '07/04/2017 08:40:56'),
(35, 'SVR-RDS', 'MATRIZ', 'ASSISTENCIA', 'NÃO IDENTIFICADO', 'cleber@icon', 'icon.123', '13/03/2017 08:26:11'),
(36, 'SVR-RDS', 'MATRIZ', 'FINANCEIRO', 'CLEBER BOMBAZAR', 'cleber.bombazar@icon', 'icon.123', '07/04/2017 08:40:56'),
(52, 'SVR-RDS', 'TERCEIRO: NEOINFO', 'CPD', ' CRISTIANO', 'cristiano@icon', 'icon.123', '05/04/2017 19:47:05'),
(54, 'SVR-RDS', 'TERCEIRO: CONSYSTEC', 'DBMANAGER', 'GABRIEL HERDT', 'gabriel.herdt@icon', 'icon.123', '11/04/2017 10:20:43'),
(55, 'SVR-RDS', 'TERCEIRO: CONSYSTEC', 'CPD', 'KLEITON TREVISOL', 'kleiton.trevisol@icon', 'icon.123', '03/04/2017 14:26:59'),
(56, 'SVR-RDS', 'TERCEIRO: SYSDATA', 'SUPORT SERVIDOR', 'LUIZ', 'luiz@icon@icon', 'icon.123', '03/02/2017 07:43:31'),
(57, 'SVR-RDS', 'MATRIZ', 'QUALIDADE', 'MAICON MACARINI', 'maicon.macarini@icon', 'icon.123', '06/04/2017 12:52:10'),
(58, 'SVR-RDS', 'TERCEIRO: SYSDATA', 'SUPORT SERVIDOR', 'MARCELO', 'marcelo@icon', 'icon.123', '28/03/2017 14:55:17'),
(59, 'SVR-RDS', 'MATRIZ', 'COMPRAS: GERENTE', 'SAMUEL BRANCO', 'samuel.branco@icon', 'icon.123', '08/04/2017 21:34:42');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `id` int(11) NOT NULL,
  `descr` text NOT NULL,
  `placa` char(8) NOT NULL,
  `uf_placa` char(2) NOT NULL,
  `renavam` varchar(20) NOT NULL,
  `tara_peso_kg` decimal(10,2) DEFAULT NULL,
  `capacide_kg` decimal(10,2) DEFAULT NULL,
  `capacidade_m3` varchar(10) DEFAULT NULL,
  `tipo_veiculo` char(1) NOT NULL DEFAULT '0',
  `tipo_reboque` char(2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `motorista`
--
ALTER TABLE `motorista`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cpf` (`cpf`),
  ADD UNIQUE KEY `cnh` (`cnh`);

--
-- Indexes for table `paises`
--
ALTER TABLE `paises`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cod_tel_pais` (`cod_tel_pais`),
  ADD UNIQUE KEY `nome` (`nome`),
  ADD UNIQUE KEY `sigla` (`sigla`);

--
-- Indexes for table `proprietario_veiculo`
--
ALTER TABLE `proprietario_veiculo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reg_mov_veiculos`
--
ALTER TABLE `reg_mov_veiculos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_veiculo` (`placa`),
  ADD KEY `fk_motorista` (`id_motorista`);

--
-- Indexes for table `uf`
--
ALTER TABLE `uf`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nome` (`nome`),
  ADD UNIQUE KEY `sigla` (`sigla`),
  ADD UNIQUE KEY `cod_ibge` (`cod_ibge`),
  ADD KEY `fk_uf_pais` (`pais_id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cpf` (`cpf`),
  ADD UNIQUE KEY `login` (`login`);

--
-- Indexes for table `usuarios_por_filial`
--
ALTER TABLE `usuarios_por_filial`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `motorista`
--
ALTER TABLE `motorista`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `paises`
--
ALTER TABLE `paises`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `proprietario_veiculo`
--
ALTER TABLE `proprietario_veiculo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `reg_mov_veiculos`
--
ALTER TABLE `reg_mov_veiculos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `uf`
--
ALTER TABLE `uf`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuarios_por_filial`
--
ALTER TABLE `usuarios_por_filial`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;
--
-- AUTO_INCREMENT for table `veiculo`
--
ALTER TABLE `veiculo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
