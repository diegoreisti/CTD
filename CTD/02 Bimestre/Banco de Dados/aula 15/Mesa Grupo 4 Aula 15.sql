/* Grupo 4
Diego Reis
Matheus Rodrigues De Almeida
Samir Libos
Vanessa Resende Bressan
Eduardo Russo
Marcelo Garofalo*/

-- MESA

/* 1. Liste o nome das empresas de correio, a quantidade de clientes e o valor total do transporte. 
Inclua todas as empresas de correio que realizaram alguma operação. */
select c.Empresa, count(distinct cl.clienteid) qtd_clientes, round(sum(ifnull(f.Transporte,0)),2) valor
  from correios c
  join faturas f on f.FormaEnvio = c.CorreioID
  join clientes cl on f.ClienteID = cl.ClienteID
 group by c.Empresa ;
 
/* 2. Liste as informações de contato (ou, endereço, etc.) dos clientes que fizeram compras. Exiba as informações no formato considerado mais adequado. 
Por exemplo: <endereço> (CP: < CEP>) . Atente para não exibir clientes repetidos e ordene os clientes de forma ascendente.. */
select distinct c.contato Cliente, concat('End.: ',c.Endereco,', Cep.: ',c.codigopostal,', Cidade.: ',c.cidade,', País.: ',pais,'. Phone.: ',c.Telefone ) contato 
  from clientes c
  join faturas f on f.ClienteID = c.ClienteID
 order by 1 ; 

/* 3. Liste todas as categorias, a descrição e a quantidade de produtos existentes de cada categoria. 
Neste relatório deve aparecer apenas categorias que possuam produtos vinculados. */
select cat.CategoriaNome, cat.Descricao, sum(p.UnidadesEstoque) qtdEstoque
  from categorias cat
  join produtos p on p.CategoriaID = cat.CategoriaID
 group by cat.CategoriaNome, cat.Descricao 
 order by 1, 2;
   