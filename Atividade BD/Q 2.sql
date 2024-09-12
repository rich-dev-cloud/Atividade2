CREATE TABLE IF NOT EXISTS mydb.Professor (
  idProfessor INT NOT NULL AUTO_INCREMENT,
  Nome VARCHAR(45) NOT NULL,
  Data_nascimento DATE NULL,
  CPF VARCHAR(11) NOT NULL COMMENT 'CPF vachar no tamanho de 11 pq quero apenas os números e sem formatação (com pontos e traços)',
  endereco VARCHAR(45) NULL,
  telefone VARCHAR(15) NULL COMMENT 'Telefone vachar(15) com formatação e código do país',
  PRIMARY KEY (idProfessor, CPF))
ENGINE = InnoDB;