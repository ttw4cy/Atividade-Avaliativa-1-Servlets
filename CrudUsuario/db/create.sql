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