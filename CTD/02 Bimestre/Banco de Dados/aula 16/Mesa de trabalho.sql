/*
Equipe 04
Diego Reis
Guilherme Brasil Tourinho
Tiago Guerreiro
Manuel Jose Pinero
Izabella De Paula Leite
Lucas Fontenele
*/

-- Relatórios II parte I - Revisando INNER JOIN

SELECT f.FaturaId "ID da fatura"
     , date_format(f.DataFatura,'%d/%m/%Y') "Data da fatura"
	, c.Empresa
	, cl.Contato
	, cat.CategoriaNome "Categoria Produto"
	, p.ProdutoNome Produto
	, df.PrecoUnitario "Preço Unitário"
	, df.Quantidade
  FROM faturas f
  JOIN correios c ON f.FormaEnvio = c.CorreioID
  JOIN clientes cl ON f.ClienteID = cl.ClienteID
  JOIN detalhefatura df ON df.FaturaId = f.FaturaId
  JOIN produtos p ON p.ProdutoID = df.ProdutoID
  JOIN categorias cat ON cat.CategoriaID = p.CategoriaID ;



-- Relatórios II parte II - INNER, LEFT e RIGHT JOIN
-- 
-- Liste todas as categorias junto com informações sobre seus produtos. Incluir todas as categorias, mesmo que não tenham produtos.
SELECT cat.Descricao, p.ProdutoNome Produto
  FROM categorias cat
  LEFT JOIN produtos p ON cat.CategoriaID = p.CategoriaID ;

-- Liste as informações de contato de clientes que nunca compraram no emarket.
SELECT c.ClienteID, c.Contato
  FROM faturas f
  RIGHT JOIN clientes c ON f.ClienteID = c.ClienteID
 WHERE isnull(f.ClienteID)
  ;

-- Faça uma lista de produtos. Para cada um, indique seu nome, categoria e as informações de contato de seu fornecedor. 
-- Lembre-se que podem existir produtos para os quais o fornecedor não foi indicado.
SELECT p.ProdutoNome Produto
	  ,cat.Descricao
      ,f.Empresa
  FROM categorias cat
  JOIN produtos p ON cat.CategoriaID = p.CategoriaID
  LEFT JOIN provedores f ON f.ProvedorID = p.ProvedorID
  ;
  
-- Para cada categoria, liste o preço unitário médio de seus produtos.
SELECT cat.Descricao, avg(p.PrecoUnitario) "Preço Unitário Médio"
  FROM categorias cat
  JOIN produtos p ON cat.CategoriaID = p.CategoriaID 
 GROUP BY cat.Descricao ;
  
-- Para cada cliente, indique a última nota fiscal de compra. Inclua clientes que nunca compraram no e-market.
SELECT c.ClienteID, c.Contato, max(f.FaturaId) "Última NF"
  FROM faturas f
  RIGHT JOIN clientes c ON f.ClienteID = c.ClienteID
 GROUP BY c.ClienteID
 ORDER BY 2 ;

-- Todas as faturas têm uma empresa de correio associada (envio). Gere uma lista com todas as empresas de correio e o 
-- número de faturas correspondentes. Execute a consulta usando RIGHT JOIN.
SELECT c.Empresa, count(f.FaturaId) "Quantidade de Faturas"
  FROM faturas f
  RIGHT JOIN correios c ON c.CorreioID = f.FormaEnvio
 GROUP BY c.Empresa ;

