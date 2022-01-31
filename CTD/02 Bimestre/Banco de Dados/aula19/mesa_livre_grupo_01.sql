/*Grupo 01
Diego Reis
João Francisco Amigo Gimenes
Izabella De Paula Leite
Sankler Bergman
João Sousa
Renan Miranda*/

-- Usando Stored Procedures
CREATE SCHEMA mesa20211206;

USE mesa20211206;

-- 01)  Criar duas tabelas com suas respectivas colunas com um relacionamento de 1:N.
-- (User CREATE TABLE)
CREATE TABLE PAIS (  id_pais INT AUTO_INCREMENT
					,nome_pais VARCHAR(60) NOT NULL
                    ,CONSTRAINT pk_pais PRIMARY KEY (id_pais)
                    );
                    
CREATE TABLE ESTADO ( id_estado CHAR(2) not null
                     ,nome_estado VARCHAR(60) NOT NULL
                     ,id_pais INT NOT NULL
                     ,CONSTRAINT pk_estado PRIMARY KEY (id_estado)
                     ,CONSTRAINT fk_estado_pais FOREIGN KEY (id_pais) REFERENCES pais(id_pais));

-- 02)  Criar, para cada tabela, um procedimento para inserir os dados 
-- (Criar dois procedimentos, um para cada tabela - Usar INSERT INTO).
DELIMITER $$
CREATE PROCEDURE prc_set_pais(IN v_nome VARCHAR(60)) 
BEGIN
 INSERT INTO pais VALUES (NULL,v_nome);
END $$

DELIMITER $$
CREATE PROCEDURE prc_set_estado(IN v_uf CHAR(2), IN v_nome VARCHAR(60), IN v_id_pais INT)
BEGIN
 INSERT INTO estado VALUES (v_uf, v_nome, v_id_pais);
END $$ 

-- 03) Inserir ao menos 5 registros em cada tabela 
-- (Usar CALL).
CALL prc_set_pais('BRASIL');
CALL prc_set_pais('ESTADOS UNIDOS DA AMERICA');
CALL prc_set_pais('MEXICO');
CALL prc_set_pais('EL SALVADOR');
CALL prc_set_pais('PANAMA');

CALL prc_set_estado('BA','BAHIA',1);
CALL prc_set_estado('CE','CEARA',1);
CALL prc_set_estado('DF','DISTRITO FEDERAL',1);
CALL prc_set_estado('ES','ESPIRITO SANTO',1);
CALL prc_set_estado('AM','AMAZONAS',1);
CALL prc_set_estado('XX','AMAZONAS',1);
--
CALL prc_set_estado('AC','AGUAS CALIENTES',3);
CALL prc_set_estado('CM','CAMPEXE',3);
CALL prc_set_estado('CP','CAMPEXE',3);
--
CALL prc_set_estado('AL','ALABAMA',2);
CALL prc_set_estado('AK','ALASKA',2);
--
CALL prc_set_estado('LS','LOS SANTOS',5);
CALL prc_set_estado('LT','LAS TABLAS',5);


-- 04) Criar um procedimento para atualizar um dos valores inseridos 
-- (Usar UPDATE   SET).
DELIMITER $$
CREATE PROCEDURE prc_upd_pais_estado(IN v_id_pais INT, IN v_id_pais_ref INT)
BEGIN
 UPDATE estado SET id_pais = v_id_pais WHERE id_pais = v_id_pais_ref;
END $$

CALL prc_upd_pais_estado (1,2);

-- 05) Criar um procedimento para DELETAR um dos registros inseridos pelo ID do registro 
-- (Usar DELETE e WHERE).
DELIMITER $$
CREATE PROCEDURE prc_del_estado_byID(vID CHAR(2))
BEGIN
 DELETE FROM estado WHERE id_estado = vID;
END $$

CALL prc_del_estado_byID('XX');

-- 06) Criar um procedimento para para visualização dos três últimos registros das informações contidas nas duas tabelas 
-- (Usar INNER JOIN, GROUP BY, LIMIT).
DELIMITER $$
CREATE PROCEDURE prc_get_pais_estados()
BEGIN
  SELECT nome_pais
        ,COUNT(id_estado) qtd_estados
        -- ,nome_estado
    FROM pais p
    JOIN estado e ON p.id_pais = e.id_pais
   GROUP BY nome_pais 
   LIMIT 3
    ;
END $$

CALL prc_get_pais_estados;

