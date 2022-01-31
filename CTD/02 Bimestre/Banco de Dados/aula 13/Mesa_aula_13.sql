/*Grupo 1
Diego Reis
Matheus Rodrigues De Almeida
Marcos Pereira Pires
Samir Libos
Vanessa Resende Bressan
Rafael Camargo*/

use musimundos;

-- Na tabela faturas:
-- 1 - O valor da fatura mais alta cujo a cidade de cobrança é “Oslo”. (MAX)
select max(valor_total) from faturas where Cidade_cobranca = 'Oslo'; 

-- 2 - O valor da fatura mais baixa de todas. (MIN)
select min(valor_total) from faturas ; 

-- 3 - O valor médio das faturas que o país de cobrança é “Canada”. (AVG)
select avg(valor_total) from faturas where pais_cobranca = 'Canada'; 

-- 4 - A quantidade de faturas que o país de cobrança é “Canada”. (COUNT)
select count(valor_total) from faturas where pais_cobranca = 'Canada'; 

-- 5 - O valor total somado de todas as faturas. (SUM)
select sum(valor_total) from faturas ;

-- 6 - Selecione o id, a data e valor das faturas com valor abaixo da média. (Subqueries e AVG)
select id, data_fatura, valor_total from faturas where valor_total < (select avg(valor_total) from faturas);

-- Na tabela empregados:
-- 7 - A data de nascimento do funcionário mais jovem da empresa (MAX)
select max(Data_Nascimento) from empregados;

-- 8 - A data de nascimento do funcionário mais velho da empresa (MIN)
select min(Data_Nascimento) from empregados;

-- 9 - Formate a data do nascimento dos funcionários no formato ex: "02 May 2020". (DATE_FORMAT)
select id, sobrenome, nome, titulo, date_format(Data_Nascimento, "%d %M %Y") data_nascimento, data_contratacao, endereco, cidade, estado, pais, cep, telefone, email from empregados;

-- Na tabela cancoes:
-- 10 - O numero de cancoes que tem como compositor “AC/DC”. (COUNT)
select count(*) qtd , compositor from cancoes where compositor = 'AC/DC';

-- 11 - A duração média das músicas em milisegundos (AVG)
select  AVG(duracao_milisegundos) duracao_media from cancoes ;

-- 12 - O tamanho médio em bytes das músicas que como compositor “AC/DC”. (AVG)
select  AVG(bytes) tamanho_medio from cancoes ;

-- Na tabela clientes:
-- 13 - Quantidade de clientes que moram na cidade de “São Paulo”. (COUNT)
select count(*) qtd, cidade from clientes where cidade = 'São Paulo';

-- 14 - Quantidade de clientes que moram na cidade “Paris”. (COUNT)
select count(*) qtd, cidade from clientes where cidade = 'Paris';

-- 15 - Quantidade de clientes que tenham email do “yahoo”. (COUNT e LIKE)
select count(*) qtd_email_yahoo from clientes where email like '%yahoo%';
