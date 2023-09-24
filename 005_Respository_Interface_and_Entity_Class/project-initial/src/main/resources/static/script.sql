CREATE DATABASE db_test;

CREATE TABLE `usuario`(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    email varchar(255) NOT NULL UNIQUE,
    cpf varchar(14) NOT NULL UNIQUE
)