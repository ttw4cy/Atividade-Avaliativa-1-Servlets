DROP DATABASE IF EXISTS Sistema;

CREATE DATABASE Sistema;

USE Sistema;

CREATE TABLE Usuario(
    id BIGINT NOT NULL auto_increment, 
    username VARCHAR(64) NOT NULL UNIQUE, 
    password VARCHAR(64) NOT NULL, 
    cpf VARCHAR(15), 
    nome VARCHAR(64), 
    telefone VARCHAR(11), 
    sexo VARCHAR(1), 
    datanasc VARCHAR(20),
    role VARCHAR(20) NOT NULL, 
    PRIMARY KEY (id)
);

CREATE TABLE Agencia{
    id BIGINT NOT NULL auto_increment,
    email VARCHAR(64) NOT NULL UNIQUE,
    senha VARCHAR(64) NOT NULL,
    cnpj VARCHAR(15) NOT NULL UNIQUE,
    nome VARCHAR(64) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL, 
    PRIMARY KEY (id)
};

CREATE TABLE Pacote {
    Codigo int(55) NOT NULL AUTO_INCREMENT,
    CNPJ int(15) NOT NULL,
    destino varchar(255) NOT NULL,
    dataPartida int(10) NOT NULL,
    Duracao int (20) NOT NULL,
    valor int (10) NOT NULL,
    foto varchar(255),
    PRIMARY KEY (codigo)
};
