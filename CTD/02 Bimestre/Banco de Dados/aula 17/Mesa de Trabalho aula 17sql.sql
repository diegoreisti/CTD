-- VIEW - Parte I
-- Clientes

/*1. Crie uma View com os seguintes dados do cliente: Id, contato, Fax e o telefone.*/
CREATE VIEW ContatosCliente AS
SELECT ClienteID 
	  ,Contato
      ,Fax
      ,Telefone
  FROM clientes ;

/*2. Liste os números de telefone dos clientes que não possuem fax.
Faça isso de duas maneiras diferentes:
a. Consultando a tabela clientes
b. Consultando a view do cliente*/

SELECT * FROM clientes WHERE Fax = '';
SELECT * FROM ContatosCliente WHERE Fax = '';


/*Fornecedores

1. Crie uma view com os seguintes dados do fornecedor: Id, contato,
empresa e endereço. Para o endereço, pegue o endereço, cidade, código
postal e país.
*/
CREATE VIEW DadosFornecedor AS
SELECT ProvedorID
      ,Contato
      ,Empresa
      ,concat('Endereço.: ',Endereco,', Cidade.: ',Cidade,', CEP.:',CodigoPostal,', País.: ',Pais) Endereco
  FROM provedores ;


/*2. Liste os fornecedores que moram na Avenida das Americanas, no Brasil. Faça de duas formas diferentes:
a. Consultando a tabela de fornecedores
b. Consultando a view do fornecedor*/
SELECT * FROM provedores WHERE Endereco like '%Av%Americanas%' ;
SELECT * FROM DadosFornecedor WHERE Endereco like '%Av%Americanas%' ;


/*VIEW - Parte II - Desafio
1. Crie uma view dos produtos que será usada ​​para controle de estoque. Inclua o id e nome do produto, preço unitário arredondado sem decimais, unidades
em estoque e as unidades encomendadas. Inclua também uma nova coluna PRIORIDADE, com os seguintes valores:
BAIXA se as unidades encomendadas forem zero
MÉDIA se as unidades pedidas forem menores do que as unidades em estoque
URGENTE se as unidades pedidas não dobrarem o número de unidades em estoque
PRIORITÁRIO caso contrário
*/

CREATE VIEW ControleEstoque AS
SELECT p.ProdutoID ID
      ,p.ProdutoNome Produto
      ,ROUND(p.PrecoUnitario) Preco
      ,p.UnidadesEstoque
      ,p.UnidadesPedidas
      ,CASE
        WHEN p.UnidadesPedidas = 0 THEN 'BAIXA' 
        WHEN p.UnidadesPedidas < p.UnidadesEstoque THEN 'MEDIA' 
        WHEN p.UnidadesPedidas < (p.UnidadesEstoque * 2) THEN 'URGENTE' 
        ELSE 'PRIORITARIO'
       END prioridade 
 FROM produtos p ;

/*2.  É necessário um relatório para identificar problemas de estoque. Utilizando a view criada no exercício anterior, indique, para cada prioridade, 
quantos produtos existem e seu preço médio. Não inclua prioridades para as que possuem menos de 5 produtos.
*/
SELECT prioridade
      ,COUNT(produto) QtdProdutos
      ,Round(avg(preco),2) PrecoMedio
 FROM ControleEstoque 
 GROUP BY prioridade
 HAVING COUNT(produto) > 5  ;
