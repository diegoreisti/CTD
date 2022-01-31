CREATE DATABASE saude_dh;

USE saude_dh;

CREATE TABLE paciente ( 
	paciente_id INT NOT NULL AUTO_INCREMENT,
    paciente_idsaude INT NOT NULL,
    paciente_nome VARCHAR(50),
    paciente_sobrenome VARCHAR(50),
    PRIMARY KEY (paciente_id)
) ;

CREATE TABLE especialidade (
	especialidade_id INT NOT NULL AUTO_INCREMENT,
    especialidade_nome VARCHAR(100),
    PRIMARY KEY (especialidade_id)
    ) ;

CREATE TABLE medico (
	medico_id INT NOT NULL AUTO_INCREMENT,
    medico_nome VARCHAR(40) NOT NULL,
    medico_sobrenome VARCHAR(100) NOT NULL,
    medico_especialidade INT NOT NULL,
    PRIMARY KEY (medico_id),
    CONSTRAINT FKespecialidade FOREIGN KEY (medico_especialidade) REFERENCES especialidade(especialidade_id)
    ) ;

CREATE TABLE consulta (
	consulta_id INT NOT NULL AUTO_INCREMENT,
    paciente_id INT,
    medico_id INT,
    data_consulta DATE,
    hora_consulta TIME,
    PRIMARY KEY (consulta_id),
    CONSTRAINT FKpaciente FOREIGN KEY (paciente_id) REFERENCES paciente(paciente_id),
    CONSTRAINT FKmedico FOREIGN KEY (medico_id) REFERENCES medico(medico_id)
    ) ;

INSERT into paciente (paciente_idsaude,paciente_nome,paciente_sobrenome) values (123456, 'Diego','Reis');
INSERT into paciente (paciente_idsaude,paciente_nome,paciente_sobrenome) values (023456, 'Emanoela','Dourado');

select * from paciente;

insert into especialidade(especialidade_nome) values ('Ortopedista');
insert into especialidade(especialidade_nome) values ('Cardiologista');
insert into especialidade(especialidade_nome) values ('Cirurgião Geral');

 select * from especialidade;
 
insert into medico (medico_nome, medico_sobrenome, medico_especialidade) values ('Peter','Jacobs',3);
insert into medico (medico_nome, medico_sobrenome, medico_especialidade) values ('Mara','Silvaira',2);
insert into medico (medico_nome, medico_sobrenome, medico_especialidade) values ('Vitor','Mascarenhas',1);

select * from medico;

insert into consulta (paciente_id, medico_id, data_consulta, hora_consulta) values (1, 2, '2021-02-18','09:00:00');
insert into consulta (paciente_id, medico_id, data_consulta, hora_consulta) values (2, 1, '2021-01-25','09:00:00');

-- comandos de alteração 

alter table medico drop column medico_especialidade;
alter table medico drop constraint FKespecialidade;

drop table especialidade;

alter table consulta drop constraint FKmedico;
alter table consulta drop constraint FKpaciente;

drop table consulta;
drop table medico;
drop table paciente;

drop database saude_dh;

