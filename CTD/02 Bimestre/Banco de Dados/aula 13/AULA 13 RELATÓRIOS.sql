-- AULA 13 RELATÓRIOS

-- Funcões, Group by y Having #1 - Clientes de Brasil: A quantidade de clientes do Brasil é:
SELECT count(*) FROM clientes WHERE PAIS = 'Brazil';

-- Canções por gênero: Faça uma consulta ao banco de dados que mostre a identificação do gênero e o número de músicas que possui. 
-- O número que você obteve como resultado do número de músicas do gênero com id = 6 foi:
select count(*) from cancoes where id_genero = 6;

-- Balanço comercial: Faça uma consulta ao nosso banco de dados que some o total de todas as notas fiscais emitidas pela empresa. O resultado encontrado foi:
select sum(valor_total) from faturas;

-- Duração dos álbuns: Obtenha uma lista de todos os álbuns e sua duração média (milissegundos). O número da média obtida para o álbum 4 foi:
select avg(duracao_milisegundos) from cancoes where id_album = 4;

--  Movendo arquivos: Faça uma consulta ao banco de dados e informe qual é o arquivo de música com o menor peso em bytes.
select min(bytes) from cancoes;

-- Desconto: Faça uma consulta ao banco de dados que nos traga por cliente_id a soma total de suas faturas. 
-- Filtre aqueles em que a soma do total é > 45. Qual é a soma total do cliente com id = 6?
select sum(valor_total) from faturas where id_cliente = 6;




