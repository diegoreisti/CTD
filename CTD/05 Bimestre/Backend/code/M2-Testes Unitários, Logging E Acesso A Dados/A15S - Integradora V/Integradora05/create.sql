drop table if exists PACIENTE;
drop table if exists ENDERECO;

create table if not exists ENDERECO(ID int auto_increment primary key, RUA varchar(100), NUMERO int, CIDADE varchar(50), BAIRRO varchar(100));
create table if not exists PACIENTE(ID int auto_increment primary key,NOME varchar(100),SOBRENOME varchar(100),RG int, DATA varchar(100), ID_ENDERECO INT, foreign key (ID_ENDERECO) references ENDERECO(ID));
