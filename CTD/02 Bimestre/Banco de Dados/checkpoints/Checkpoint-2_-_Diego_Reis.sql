/*
CHECKPOINT 2 - BANCO DE DADOS
ALUNO: DIEGO DA SILVA REIS
*/

/*### OBSERVAÇÕES ### 

	1. ANTES DO SCRIPT ESTÃO AS ABSERVAÇÕES, ALGUMAS TABELAS APENAS COLOQUEI UMA DESCRIÇÃO SIMPLES, JÁ EM OUTRAS 
	  INCLUÍ DETALHES SOBRE O MOTIVO DE SUA CRIAÇÃO OU DE UMA DETERMINADA CONSTRAINT 
      
    2. SÓ RODAR O SCRIPT QUE ELE CRIARÁ E POPULARÁ O BANCO*/

/*Criação do banco de dados.*/
create schema freejob; -- > Criando esquema/banco de dados

/*Usando o esquema criado*/
use freejob; -- > Indicando que estamos usando a base criada

/*Criação das tabelas com chaves primárias e estrangeiras.
Todas as PKs foram criados como auto increment exceto a da tabela UF onde a PK é a abreviação/sigla da unidade federativa
*/
/*Tabela de país*/
create table pais (
	idPais int not null auto_increment,
    nomePais varchar(120),
    primary key(idPais)
);

/*Tabela de unidade da federação*/
create table uf (
	idUF char(2) not null,
    nomeUF varchar(50) not null,
    numeroIBGE int, 
    idPais int not null,
    primary key(idUF),
    constraint FK_Pais foreign key (idPais) references pais(idPais)
);

/*Tabela de cidade*/
create table cidade (
	idCidade int not null auto_increment,
    nomeCidade varchar(120) not null,
    nrCepInicial int,
    nrCepFinal int,
    nrDDD tinyint,
    idUF char(2) not null,
    primary key(idCidade),
    constraint FK_Cidade_UF foreign key (idUF) references uf(idUF),
    constraint check_ddd check (nrDDD between 0 and 99) -- > constraint para restingir o DDD
);

/*Tabela de bairro*/
create table bairro (
	idBairro int not null auto_increment,
    nomeBairro varchar(100) not null,
    idCidade int not null,
    primary key(idBairro),
    constraint FK_Bairro_Cidade foreign key (idCidade) references cidade(idCidade)
);

/*Tabela de logradouro*/
create table logradouro (
	nrCep int not null,
    nomeLogradouro varchar(200) not null,
    complementoLogradouro varchar(200),
    idBairroInicial int not null,
    idBairroFinal int,
    primary key(nrCep),
    constraint FK_Logradouro_Bairro foreign key (idBairroInicial) references bairro(idBairro)
);

/*Tabela de pessoa*/
create table pessoa (
	idPessoa int not null auto_increment,
    nomePessoa varchar(200) not null,
    dataNascimento date,
    cpf char(11),
    identidade char(10),
    dataExpedicao date,
    orgaoEmissor varchar(20),
    ufEmissor char(2),
    nrCep int,
    primary key(idPessoa),
    constraint FK_Pessoa_OrgaoEmissor foreign key (ufEmissor) references uf(idUF),
    constraint FK_Cep foreign key (nrCep) references logradouro(nrCep)    
);

/*Tabela de profissão*/
create table profissao (
	idProfissao int not null auto_increment,
    descricao varchar(200),
    snLicenca char(1) not null, 
    constraint check_licenca check (snLicenca in ('S','N')),
    primary key(idProfissao)
);

/*Tabela de vínculo da profissão à pessoa*/
create table pessoa_profissao (
	idPessoa int not null,
    idProfissao int not null,
    dataInicio date,
    primary key(idPessoa, idProfissao),
    constraint FK_PessoaProfissao_Pessoa foreign key (idPessoa) references pessoa(idPessoa),
    constraint FK_PessoaProfissao_Profissao foreign key (idProfissao) references profissao(idProfissao)
);

/*Tabela de categoria do serviço, Ex. Saúde, Assistência Técnica, Reformas e Reparos, etc;*/
create table categoria (
	idCategoria int not null auto_increment,
    nomeCategoria varchar(120),
    descricao varchar(200),
    primary key(idCategoria)
);

/*Tabela de subcategoria do serviço, Ex categoria Saúde, Subcategrias: Dentista, Enfermeira, Cuidador, Nutricionista, etc;*/
create table subcategoria (
	idSubcategoria int not null auto_increment,
    nomeSubcategoria varchar(120) not null,
    descricao varchar(200),
    snAtivo char(1) not null, 
    constraint check_ativo check (snAtivo in ('S','N')),
    idCategoria int not null,
    primary key(idSubcategoria),
    constraint FK_Subcategoria_Categoria foreign key (idCategoria) references categoria(idCategoria)
);

/*Tabela do serviço oferecido, Ex. Nutricionsita > Plano alimentar, Cardápio diário, bioimpedância, etc;*/
create table servico (
	idServico int not null auto_increment,
    nomeServico varchar(120) not null,
    descricao varchar(200),
    snAtivo char(1) not null,
    constraint check_servico_ativo check (snAtivo in ('S','N')),
    idSubcategoria int not null,
    tipoSexo char(1), 
    constraint check_sexo check(tipoSexo in ('M','F','A')),
    primary key(idServico),
    constraint FK_Servico_Subcategoria foreign key (idSubcategoria) references subcategoria(idSubcategoria)
);

/*Tabela de serviços vinculados/liberados para determinada profissão*/
create table profissao_servico (
	idProfissaoServico int not null auto_increment,
    snAtivo char(1) not null, 
    constraint check_prof_serv_ativo check (snAtivo in ('S','N')),
    idServico int not null,
    primary key(idProfissaoServico),
    constraint FK_ProfissaoServico_Servico foreign key (idServico) references servico(idServico)
);

/*Tabela de valores dos serviços*/
create table valor_servico (
	idValorServico int not null auto_increment,
    idPessoa int,
    idServico int not null,
    valorServico decimal(5,2),
    primary key(idValorServico),
    constraint FK_ValorServico_PessoaProfissao foreign key (idPessoa) references pessoa_profissao(idPessoa),
    constraint FK_ValorServico_Servico foreign key (idServico) references servico(idServico)
);

/*Tabela de escala
Essa tabela é o "esqueleto" que serve de base para geração da agenda. Nela é indicado que Fulano, profissional, atende seg, ter e sex nos horários x, y
*/
create table escala (
	idEscala int not null auto_increment,
    nrDiaSemana tinyint not null,
    constraint check_diasemana check (nrDiaSemana between 2 and 8),
    horaInicio time not null,
    horaFim time not null,
    qtdSessoes int,
    intervaloSessoes time,
    idPessoa int not null,
    primary key(idEscala),
    constraint FK_Escala_Pessoa foreign key (idPessoa) references pessoa(idPessoa)
);

/*Tabela de serviços disponíveis em determinada escala*/
create table escala_servico (
	idEscala int not null,
    idServico int not null,
    primary key(idEscala, idServico),
    constraint FK_EscalaServico_Escala foreign key (idEscala) references escala(idEscala),
    constraint FK_EscalaServico_Servico foreign key (idServico) references servico(idServico)
);

/*Tabela de agenda
Essa tabela é o resultado da escala. As agendas são geradas e disponibilizadas em determinadas datas, seguindo as regras do seu espelho, ou seja, a escala
*/
create table agenda (
	idAgenda int not null auto_increment,
    intervaloSessoes time,
    dataLiberaAgenda datetime not null,
    dataAgenda date,
    horaInicio time,
    horaFim time,
    qtdSessoes int,
    idEscala int not null,
    idPessoa int not null,
    primary key(idAgenda),
    constraint FK_Agenda_Escala foreign key (idEscala) references escala(idEscala),
    constraint FK_Agenda_Pessoa foreign key (idPessoa) references pessoa(idPessoa)
);

/*Tabela de serviços disponíveis na agenda.
Nesse caso não poderia ser a mesma de serviços da escala, pois ela é "viva", ou seja, sofre atualizações. Um profissional pode deixar de fazer um serviço ou passar 
a prestar outro, logo se a tabela fosse a mesma seria "mutante" e perderíamos o histórico*/
create table agenda_servico (
	idAgenda int not null,
    idServico int not null,
    primary key(idAgenda, idServico),
    constraint FK_AgendaServico_Agenda foreign key (idAgenda) references agenda(idAgenda),
    constraint FK_AgendaServico_Servico foreign key (idServico) references servico(idServico)
);

/*Tabela de itens da agenda. São os serviços agendados pelo profissional x para o cliente y*/
create table item_agenda (
	idItemAgenda int not null auto_increment,
    dataAgendamento date,
    horaAgendamento time,
    situacao char(1),
    constraint check_situacao check (situacao in ('A','L','C','B')),
    observacao varchar(200),
    snExtra char(1),
    constraint check_extra check (snExtra in ('S','N')),
    idServicoAgendado int,
    idPessoa int,
    primary key(idItemAgenda),
    constraint FK_ItemAgenda_Servico foreign key (idServicoAgendado) references servico(idServico),
    constraint FK_ItemAgenda_Pessoa foreign key (idPessoa) references pessoa(idPessoa)
);

/*Inserção de dados em uma das tabelas.*/

INSERT INTO pais VALUES (null,'BRASIL');

INSERT INTO uf VALUES ('BA','BAHIA',NULL,1);
INSERT INTO uf VALUES ('BB','BAHIA',NULL,1); -- > inserindo um estado errado DE PROPÓSITO
INSERT INTO uf VALUES ('PE','PERNAMBUCO',NULL,1);
INSERT INTO uf VALUES ('CE','CEARA',NULL,1);

INSERT INTO cidade VALUES (null,'SALVADOR',41650195,NULL,71,'BA');

INSERT INTO bairro VALUES (null,'PIATA',1);

INSERT INTO logradouro VALUES (41650195,'RUA DA GRATIDAO','Nº 291 D',1,NULL);

INSERT INTO pessoa VALUES (null,'DIEGO REIS','1986-09-10','1','1011111111','2021-01-01','SSP-BA','BA',41650195);

/*
Atualização de dados em uma das tabelas.
*/

UPDATE pessoa SET nomePessoa = 'DIEGO DA SILVA REIS' WHERE idPessoa = 1;

/*Exclusão de dados em uma das tabelas.*/

DELETE FROM uf WHERE idUF = 'BB'; -- > excluindo o estado errado

/*
Seleção de dados de uma das tabelas.
*/

SELECT p.nomePessoa pessoa
      ,p.nrCep cep
      ,concat('Endereço.: ', l.nomeLogradouro,' ',complementoLogradouro,', Bairro.: ',b.nomeBairro) endereco
  FROM pessoa P
  JOIN logradouro L ON P.nrCep = L.nrCep
  JOIN bairro B ON b.idBairro = l.idBairroInicial

