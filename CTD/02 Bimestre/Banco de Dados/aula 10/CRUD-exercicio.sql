-- SELECT
-- Mostre todos os registros da tabela filmes.
select * from filmes;

-- Mostre o nome, sobrenome e avaliação de todos os atores.
SELECT nome, sobrenome, avaliacao from atores;

-- Mostre o título de todas as séries.
SELECT titulo from series;

-- WHERE e ORDER BY
-- Mostre o nome e o sobrenome dos atores cuja avaliação é superior a 7,5.
SELECT nome, sobrenome, avaliacao from atores WHERE avaliacao > 7.5;

-- Mostre o título dos filmes, a avaliação e os prêmios dos filmes com avaliação superior a 7,5 e com mais de dois prêmios.
select titulo, avaliacao, premios from filmes where avaliacao > 7.5 and premios > 2;

-- Mostre o título dos filmes e a avaliação ordenado por avaliação em ordem decrescente.
select titulo, avaliacao from filmes  ORDER BY avaliacao desc;

-- BETWEEN e LIKE
-- Mostre o título e a avaliação de todos os filmes cujo título inclui Toy Story.
select titulo, avaliacao from filmes where upper(titulo) LIKE '%TOY STORY%';

-- Mostre todos os atores cujos nomes começam com Sam.
SELECT * from atores WHERE upper(nome) like 'SAM%';

-- Mostre o título dos filmes lançados entre '01-01-2004' e '31-12-2008'.
select * from filmes where data_lancamento BETWEEN '2004-01-01' and '2008-12-31'
