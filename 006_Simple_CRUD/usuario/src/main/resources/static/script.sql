CREATE DATABASE db_usuario;

USE db_usuario;

CREATE TABLE usuarios (
    id int PRIMARY KEY AUTO_INCREMENT,
    nome varchar(250) NOT NULL,
    email varchar(250) NOT NULL UNIQUE
);


SELECT * FROM db_usuario.usuarios;