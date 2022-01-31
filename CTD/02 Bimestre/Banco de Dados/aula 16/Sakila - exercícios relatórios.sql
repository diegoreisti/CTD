-- Relatórios parte 1:
-- 
-- Obtenha o nome e o sobrenome dos primeiros 5 atores disponíveis, use Alias para exibir os nomes das colunas com a primeira letra maiúscula.
SELECT actor_id AS 'Actor Id', first_name AS 'First Name', last_name As 'Last Name', last_update as 'Last Update'
 FROM actor LIMIT 5;
-- 
-- Obtenha uma lista que inclua nome, sobrenome e e-mail dos clientes inativos. Use Alias para exibir os nomes das colunas com a primeira letra maiúscula.
SELECT first_name 'Nome', last_name 'Sobrenome', email 'E-mail'
  FROM customer c
 WHERE active = 0 ;
-- 
-- Obtenha uma lista de filmes, incluindo título, ano e descrição dos filmes que têm uma duracao_locacao maior que cinco. Classificar por duracao_locacao descendente e use Alias para exibir os nomes das colunas com a primeira letra maiúscula.
SELECT title 'Título', release_year 'Ano', description 'Descrição'
  FROM film 
 WHERE rental_duration > 5
 ORDER BY rental_duration DESC;
-- 
-- Obtenha uma lista de aluguéis que foram feitos durante o mês de Maio de 2005. Inclua todas as colunas disponíveis no resultado.
SELECT * FROM rental WHERE month(rental_date) = '05' AND year(rental_date) = '2005';
-- 
-- Relatórios parte 2: Adicionar complexidade
-- 
-- Se chegarmos até aqui, é porque já sabemos claramente qual é a estrutura básica de um SELECT. Nos relatórios a seguir, adicionaremos complexidade.
-- Vamos  testar?
-- 
-- Obtenha o valor TOTAL de locações, use um Alias para mostrá-lo em uma coluna chamada "Quantidade";
SELECT * FROM payment;
SELECT sum(amount) Quantidade FROM payment;
-- 
-- Obtenha a soma TOTAL de todos os pagamentos, use um Alias para mostrá-lo em uma coluna chamada "TOTAL", uma coluna com a quantidade de locações com o alias "Quantidade" e uma coluna indicando o "Valor Médio ”por locação";
SELECT sum(amount) Valor, count(*) Quantidade, avg(amount) 'Valor Médio'  FROM payment;
-- 
-- Gere um relatório que responda à pergunta: quais são os dez clientes que mais dinheiro gastam e quantas locações fizeram?
SELECT c.first_name Nome, c.last_name Sobrenome, sum(p.amount) Valor, count(p.rental_id) qtd_locacoes 
  FROM payment p
  JOIN customer c ON p.customer_id = c.customer_id
 GROUP BY c.first_name
 ORDER BY 3 DESC
 LIMIT 10 ;
-- 
-- Gere um relatório que mostre: identificação do cliente, quantidade  de locações e valor total de todos os clientes que gastaram mais de $ 150 em locações.
SELECT c.first_name Nome, c.last_name Sobrenome, sum(p.amount) Valor, count(p.rental_id) qtd_locacoes 
  FROM payment p
  JOIN customer c ON p.customer_id = c.customer_id
 GROUP BY c.first_name
 HAVING sum(p.amount) > 150
 ORDER BY 3 DESC;
-- 
-- Gere um relatório que mostre por mês o valor das locações e a quantidade de locações para o ano de 2005.
SELECT month(r.rental_date) 'Mês', sum(p.amount) Valor, count(p.rental_id) Qtd_locacoes 
  FROM payment p
  JOIN rental r ON r.rental_id = p.rental_id
 WHERE year(r.rental_date) = '2005'
 GROUP BY month(r.rental_date);

