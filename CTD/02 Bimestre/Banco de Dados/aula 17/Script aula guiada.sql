-- Exercício 1
/*Crie uma view para que você possa organizar remessas de faturas.   Indicar número da  fatura,  data da fatura e data de  envio, no formato dd/mm/yy, 
valor de  transporte  formatado em dois locais decimais e informações de endereço de destino, incluindo endereço, cidade,  código postal e país, 
em uma coluna chamada Destino.
*/

CREATE VIEW DetalheEnvio AS
SELECT FaturaId
	  ,date_format(DataFatura,'%d/%m/%y') DataFatura
      ,date_format(DataEnvio,'%d/%m/%y') DataEnvio
      ,round(Transporte,2) ValorTransporte
      ,concat('Endereço.: ',EnderecoEnvio,', Cidade.: ',CidadeEnvio,', CEP.:',CodigoPostalEnvio,', País.: ',PaisEnvio) Destino
 FROM faturas f ;
 
 /*Faça uma consulta com todos os empresas de correios e os detalhes das  faturas que usaram essa empresa.  Use  a  View  criada.*/
 

-- Exercício 2
/*Crie uma view com um detalhe dos  produtos em estoque. Indicar id,  nome     do   produto, nome da categoria e preço unitário.*/
CREATE VIEW DetalheProduto AS
SELECT p.ProdutoID ID
      ,p.ProdutoNome Produto
      ,c.CategoriaNome Categoria
      ,p.PrecoUnitario Preço
 FROM produtos p
 JOIN categorias c ON p.CategoriaID = c.CategoriaID ;

/*Escreva uma consulta que liste o nome e  a categoria de todos os produtos  vendidos.  Use a  View  criada.*/ 
 SELECT produto, categoria, preço FROM DetalheProduto;

