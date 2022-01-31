
-- PROCEDURES E-MARKETING MESA

/*1) Empregados

Crie uma SP que liste os sobrenomes e nomes dos empregados, ordenados alfabeticamente.
Invoque a SP para verificar o resultado.*/
DELIMITER $$
CREATE PROCEDURE prc_get_nome_alfabetico()
BEGIN
SELECT concat(Nome,' ',Sobrenome) NomeCompleto
  FROM empregados 
 ORDER BY 1 ASC ;
END $$

CALL prc_get_nome_alfabetico();

/*2) Empregados por cidade

Crie uma SP que leva o nome de uma cidade e lista os funcionários dessa cidade
Invoque a SP para listar os empregados de Seattle.*/
DELIMITER $$
CREATE PROCEDURE prc_get_funcionarios_cidade(IN v_cidade VARCHAR(30))
BEGIN 
 SELECT * 
   FROM empregados
  WHERE Cidade = v_cidade;
END $$

CALL prc_get_funcionarios_cidade('Seattle');

/*3) Clientes por país

Crie uma SP que recebe o nome de um país e retorne o número de clientes naquele país.
Invoque a SP para consultar a quantidade de clientes de Portugal.*/
DELIMITER $$
CREATE PROCEDURE prc_get_clientes_pais(IN v_pais VARCHAR(30), OUT v_qtd INT)
BEGIN
 SELECT COUNT(*) INTO v_qtd
   FROM clientes
  WHERE pais = v_pais ; 
  SELECT v_pais; -- > POSSO JÁ FAZER O RETORNO DENTRO DA PRC
END $$

SET @saida = 0;
CALL prc_get_clientes_pais('Portugal', @saida); 
-- SELECT @saida; 

/*4) Produtos sem estoque

Crie uma SP que receba um número e liste os produtos cujo estoque está abaixo desse número. O resultado deve mostrar o nome do produto, 
o Estoque atual e o nome da categoria à qual o produto pertence.
Liste os produtos com menos de 10 unidades no estoque;
Liste os produtos sem estoque.*/
DELIMITER $$
CREATE PROCEDURE prc_get_estoque_num(IN v_numero INT)
BEGIN
SELECT p.produtoid, p.produtonome, c.CategoriaNome categoria, p.unidadesestoque
  FROM produtos p
  JOIN categorias c ON p.categoriaid = c.categoriaid
 WHERE p.UnidadesEstoque <= v_numero;
END $$

CALL prc_get_estoque_num(10);
CALL prc_get_estoque_num(0);

/*5) Vendas com desconto

Crie uma SP que receba uma porcentagem e lista os nomes dos produtos que foram vendidos com desconto igual ou superior ao valor indicado, 
indicando, também,  o nome do cliente a quem foi vendido.
Liste as informações dos produtos que foram vendidos com um desconto superior a 10%.*/
DELIMITER $$
CREATE PROCEDURE prc_lista_desconto(IN v_percentual INT)
BEGIN
 SELECT cl.Contato Cliente
       ,p.ProdutoNome Produto
       ,c.CategoriaNome Categoria
	   ,df.PrecoUnitario PrecoVenda
       ,p.PrecoUnitario PrecoProduto
   FROM faturas f
   JOIN detalhefatura df ON f.FaturaId = df.FaturaId
   JOIN produtos p ON df.ProdutoID = p.ProdutoID
   JOIN categorias c ON c.CategoriaID = p.CategoriaID
   JOIN clientes cl ON f.ClienteID = cl.ClienteID
  WHERE df.PrecoUnitario <= (p.PrecoUnitario - (p.PrecoUnitario * (v_percentual/100))); 
END $$

CALL prc_lista_desconto(30);

