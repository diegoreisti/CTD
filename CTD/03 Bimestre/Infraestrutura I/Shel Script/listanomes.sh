#!/bin/bash
echo "Digite um nome"
read nome
for x in $(cat lista_nomes)
do
 if [ $x = $nome ];
 then
  echo "Achei $nome"
 else
  let a=($a + 1)
 fi

done

curl -s https://api.genderize.io/?name=$nome | jq '.gender' | { read -r gen; echo "Sexo de $nome é: $gen"; } 

curl -s https://api.nationalize.io/?name=$nome | jq '.country[0].country_id' | { read -r cn; echo "País do $nome é: $cn"; }
