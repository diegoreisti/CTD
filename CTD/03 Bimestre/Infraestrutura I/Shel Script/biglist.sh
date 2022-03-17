#!/bin/bash

#A partir do arquivo que contém os 500 nomes, selecione aleatoriamente 5 nomes diferentes que começam com “A”, 5 nomes diferentes que começam com “L” e 5 nomes diferentes que nem comecem com “A .” ”, nem com “L”.

req=`curl https://raw.githubusercontent.com/nidiodolfini/digitalhouse/main/nomes-proprios.txt | shuf`

countA=0
countL=0
countnoAL=0

for name in $req
do
    if [[ $name == A* ]] && [ $countA -le 4 ] ;
    then
        echo $name
        let "countA++"
    elif  
    	[[ $name == L* ]] && [ $countL -le 4 ] ;
    then
        echo $name
        let "countL++"    
    elif
    	[[ $name != L* && $name != A* ]] && [ $countnoAL -le 4 ] ;
    then
        echo $name
        let "countnoAL++"
    fi

done


#for name in $req
#do
#    if [[ $name == A* ]] && [ $countA -le 4 ] ;
#    then
#        echo $name
#        let "countA++"
#    fi
#
#    if [[ $name == L* ]] && [ $countL -le 4 ] ;
#    then
#        echo $name
#        let "countL++"
#    fi
#
#    if [[ $name != L* && $name != A* ]] && [ $countnoAL -le 4 ] ;
#    then
#        echo $name
#        let "countnoAL++"
#    fi
#
#done