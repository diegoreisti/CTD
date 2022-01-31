-- Exercicio guiado

/*1. Liste os clientes que fizeram compras durante 1996.
A lista deve conter as seguintes colunas:
Nome e sobrenome. 
O título é todo maiúsculo.*/
select DISTINCT c.contato, UPPER(c.Titulo) TITULO
  from clientes c
  join faturas f on f.ClienteID = c.ClienteID
  where year(f.DataFatura) = '1996'  
 -- WHERE f.DataFatura <='1996-12-31'
 ;


/*2. Liste as faturas para as quais a remessa foi para uma cidade diferente da cidade do cliente. Considere apenas os clientes do Reino Unido.
A listagem deve incluir:
O número da fatura completando com zeros principais 8 itens. Por exemplo, 00001234
A data da fatura no formato YYYY-MM-DD. Por exemplo, 1996-12-01
Para a cidade do cliente*/
select lpad(f.FaturaId,8,0) fatura, date_format(f.datafatura, '%Y-%m-%d') datafatura, c.Cidade
  from clientes c
  join faturas f on f.ClienteID = c.ClienteID
 where f.CidadeEnvio != c.Cidade
   and c.Pais = 'UK';
   
