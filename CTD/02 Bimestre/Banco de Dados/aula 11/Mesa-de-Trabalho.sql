/*
Grupo 3
Diego Reis
João Sousa
Manuel Jose Pinero
Tawan Silva Souza
Denis Galdino
Marcelo Garofalo
*/

-- Categorias e produtos
-- 
-- 1) Queremos ter uma lista de todas as categorias.
select * from categorias;

-- 2) Como as categorias não possuem imagens, você está interessado em obter apenas um Nome e descrição da lista de categorias.
select CategoriaNome, Descricao from categorias;

-- 3) Obtenha uma lista dos produtos.
select * from produtos;

-- 4) Existem produtos descontinuados? (Descontinuado = 1).
select * from produtos where Descontinuado = 1;
-- NÃO TEMOS 

-- 5) Na sexta-feira, você deve se reunir com o fornecedor nr. 8. Quais são os produtos que eles fornecem?
SELECT * FROM produtos WHERE provedorID = 8;

-- 6) Queremos saber todos os produtos cujo preço unitário se encontra entre 10 e 22.
SELECT * FROM produtos WHERE PrecoUnitario between 10 and 22;

-- 7) Fica definido que um produto deve ser solicitado ao fornecedor se suas unidades em estoque forem inferiores ao nível de reabastecimento. Existem produtos a solicitar?
SELECT * FROM produtos WHERE UnidadesEstoque < NivelReabastecimento;

-- EXISTEM PRODUTOS A SOLICITAR

-- 8) Você quer saber todos os produtos da lista anterior, mas que as unidades pedidas sejam iguais a zero.
SELECT * FROM produtos WHERE UnidadesEstoque < NivelReabastecimento AND UnidadesEstoque = 0;

-- 
-- Clientes
-- 1) Obtenha uma lista de todos os clientes com contato, empresa, cargo, País. Classifique a lista por país.
select Contato, Titulo, Pais from clientes order by Pais asc;

-- 2) Queremos atender todos os clientes que possuem o título de  “Proprietário". Esse título estará em inglês (Owner).
select Titulo as 'Owner', Contato, Pais from clientes where Titulo like 'Owner' order by Pais asc;

-- 3) A operadora de telefonia atendeu um cliente e não lembra o nome dele. Sabe apenas que começa com "C". Podemos ajudá-lo a obter uma lista com todos os contatos que começam com a letra C?
select Contato, Titulo, Pais from clientes where Contato like 'c%' order by Contato asc;

-- 
-- Faturas
-- 
-- 1) Obtenha uma lista de todas as faturas, ordenadas por data da fatura em ordem ascendente.
SELECT * FROM faturas ORDER BY DataFatura ASC;

-- 2) Agora é necessário uma lista de faturas com o país de envio "EUA" e que a FormaeEnvio seja diferente de 3.
SELECT * FROM faturas WHERE PaisEnvio = 'USA' AND FormaEnvio != 3;

-- 3) O cliente 'GOURL' fez um pedido?
SELECT * FROM faturas WHERE ClienteID = 'GOURL';

-- O CLIENTE GOURL FEZ PEDIDOS

-- 4) Você deseja visualizar todas as faturas dos funcionários 2, 3, 5, 8 e 9.
SELECT * FROM faturas WHERE EmpregadoID IN (2, 3, 5, 8 , 9);

-- 
-- Queries I - Parte II
-- 
-- Nesta segunda parte, vamos intensificar a prática de consultas SELECT,
-- adicionando ALIAS, LIMIT e OFFSET.
-- 
-- Produtos
-- 
-- 1) Obtenha a lista de todos os produtos em ordem decrescente por preço unitário.
SELECT * FROM produtos ORDER BY PrecoUnitario DESC;

-- 2) Obtenha a lista dos 5 melhores produtos cujo preço unitário é o mais "Caro".
SELECT * FROM produtos ORDER BY PrecoUnitario DESC LIMIT 5;

-- 3) Obtenha um top 10 dos produtos com mais unidades em estoque.
SELECT * FROM produtos ORDER BY UnidadesEstoque DESC LIMIT 10;
-- 
-- DetalheFatura
-- 
-- 1) Obtenha uma lista de FaturaId, Produto, Quantidade. 
SELECT FaturaID, ProdutoID, Quantidade FROM detalhefatura;

-- 2) Classifique a lista acima por Quantidade decrescente. 
SELECT FaturaID, ProdutoID, Quantidade FROM detalhefatura ORDER BY Quantidade DESC;

-- 3) Filtre a mesma lista apenas para os produtos cuja quantidade esteja entre 50 e 100. 
SELECT ProdutoID, Quantidade FROM detalhefatura WHERE Quantidade BETWEEN 50 AND 100;

-- 4) Em outra nova consulta, obtenha uma lista com os seguintes nomes de coluna: Número da fatura (FaturaId), Produto (ProdutoId), Total (Preço Unitário * Quantidade)
SELECT FaturaID "Número da fatura", ProdutoID "Produto", PrecoUnitario * Quantidade "Total" FROM detalhefatura;

-- 
-- Extras
-- 
-- Sobrou tempo? Você quer continuar praticando?
-- Deixamos alguns exercícios extras da mesma base:
-- 1) Obtenha uma lista de todos os clientes que moram no “Brasil” ou “México” ou que tenham um título que começa com "Vendas" (o termo estará em inglês: ‘Sales’);
SELECT * FROM clientes WHERE Pais = 'Brazil' or Pais = 'Mexico' or Titulo like 'Sales%';

-- 2) Obtenha uma lista de todos os clientes que pertencem a uma empresa que comece com a letra “A”.
SELECT * FROM clientes where Empresa like 'A%';

-- 3) Obtenha uma lista com os seguinte dados: Cidade, Contato( renomeie para Nome e Sobrenome), Título (renomeie para Cargo), de todos os clientes que são da cidade "Madrid".
SELECT Cidade, Contato "Nome e Sobrenome", Titulo "Cargo" FROM clientes WHERE Cidade = 'Madrid';

-- 4) Obtenha uma lista de todas as faturas com ID entre 10.000 e 10.500
select*from faturas where FaturaID between 10000 and 10500 order by FaturaID asc;

-- 5) Obtenha uma lista de todas as faturas com ID entre 10.000 e 10.500 ou de clientes com IDs começando com "B".
select * from faturas where FaturaId between 10000 and 10500 or ClienteID like 'B%';

-- 6) Existem notas fiscais que informam a cidade expedidora “Vancouver” ou que utilizam FormaEnvio =  3?
select * from faturas where CidadeEnvio = 'Vancouver' or FormaEnvio = 3;

-- AMBOS EXISTEM

-- 7) Qual é a identificação do funcionário de “Buchanan”?
select * from empregados where Notas like '%Buchanan%' or Sobrenome like '%Buchanan%' ;

-- EmpregadoID = 5

-- 8) Existem Notas Fiscais com o EmpregadoId do funcionário acima?
select * from faturas where EmpregadoID = 5;

-- Sim, existem!



