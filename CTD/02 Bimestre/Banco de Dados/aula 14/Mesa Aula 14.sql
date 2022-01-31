/*
Grupo Livre
Diego Reis
Lucas A Figueiredo
Rodolfo Alves
Tawan Souza
*/

-- 1 - Selecione o nome dos artistas(tabela artistas) com o nome de seus albuns (tabela albuns) ordenado por id do artista.
SELECT a.nome, ab.titulo
FROM artistas a
INNER JOIN albuns ab ON ab.id_artista = a.id
ORDER BY a.id; 

-- 2 - Selecione o nome do cliente (clientes) e suas faturas (faturas), porém somente as faturas com valor maior de 5 ordenados pelo valor da fatura decrescente.
SELECT cl.nome, f.valor_total
FROM clientes cl
INNER JOIN faturas f ON f.id_cliente = cl.id
WHERE f.valor_total > 5
ORDER BY f.valor_total DESC;

-- 3 Selecione o nome das cancoes (tabela cancoes) e o tipo de arquivo (tabela tipos_de_arquivos) e exiba o nome da canção e o tipo ordenado pelo id da canção
SELECT ca.nome, t.nome tipo
FROM cancoes ca
INNER JOIN tipos_de_arquivo t ON t.id = ca.id_tipo_de_arquivo
ORDER BY ca.id; 