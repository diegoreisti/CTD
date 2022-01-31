-- Relatórios - JOINS
-- Questões: 
-- Obtenha os artistas que atuaram em um ou mais filmes.
SELECT distinct a.nome, a.sobrenome
  FROM filmes f
  JOIN artista_filmes af ON af.filme_id = f.id
  JOIN artista a ON a.id = af.artista_id;
  
-- Obtenha os filmes onde mais de um artista participou de acordo com nosso banco de dados.
SELECT f.titulo, COUNT(a.id) Qtd_Artistas
  FROM filmes f
  JOIN artista_filmes af ON af.filme_id = f.id
  JOIN artista a ON a.id = af.artista_id
 HAVING COUNT(a.id) > 1 ;
  
-- Liste todos os artistas, mesmo aqueles que ainda não atuaram em nenhum filme, de acordo com nosso banco de dados.
SELECT distinct a.nome, a.sobrenome
  FROM artista a;

-- Obtenha filmes que não foram atribuídos a artistas em nosso banco de dados.
SELECT *
  FROM filmes f
  LEFT JOIN artista_filmes af ON af.filme_id = f.id
 WHERE isnull(af.artista_id) ;
 
-- Pegue aqueles artistas que não atuaram em um filme, de acordo com nosso banco de dados.
SELECT *
  FROM artista a
  LEFT JOIN artista_filmes af ON af.artista_id = a.id
 WHERE isnull(af.artista_id) ;
 
-- Obtenha os artistas que atuaram em dois ou mais filmes de acordo com nosso banco de dados.
SELECT concat(a.nome,' ', a.sobrenome) artista, count(af.artista_id) qtd
  FROM artista a
  JOIN artista_filmes af ON af.artista_id = a.id
 GROUP BY a.nome, a.sobrenome
 HAVING count(af.artista_id) > 1
  ;
 
-- Obtenha os filmes que têm um ou mais artistas atribuídos, mesmo aqueles que ainda não foram atribuídos a um artista em nosso banco de dados.
SELECT f.titulo, count(af.artista_id) Qtd_artistas
  FROM filmes f
  LEFT JOIN artista_filmes af ON af.filme_id = f.id
 GROUP BY f.titulo;