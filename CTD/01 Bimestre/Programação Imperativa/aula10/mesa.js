/* O que esses códigos retornam?
Neste exercício, você terá que pensar sobre o que esses códigos retornam sem testá-lo no console.


let numbers =[22, 33, 54, 66, 72]
console.log(numbers[numbers.length])

RESPOSTA.: -1 undefined


let grupoDeAmigos = [ ["Harry", "Ron", "Hermione"], ["Spiderman", "Hulk", "Ironman"], ["Penélope Glamour", "Pierre Nodoyuna","Patán"] ]
console.log(grupoDeAmigos[1][0])

RESPOSTA.: Spiderman

let str = “una string qualquer”
let grupoDeAmigos = [ [45, 89, 0], ["Digital", "House", true], ["string", "123","false", 54, true, str] ]
console.log(grupoDeAmigos[2][grupoDeAmigos[2].length - 1])

RESPOSTA.: una string qualquer

 */



/*
Array Invertido
Neste exercício, você terá que criar uma função que retorne um array com seus elementos invertidos, sem modificá-lo. 
Então, você deve fazer uma função que o modifique e inverta a ordem de seus elementos.
Crie a função imprimirInverso que pega um Array como um argumento e imprime cada elemento em ordem reversa no console (você não precisa inverter o Array).
Crie a função inverter que recebe um Array como argumento e retorna um novo invertido.

*/

console.log("1 - Array Invertido")
let array = [1,2,3,4]
let arrayInvertido = []

 function inverteArray(){
    arrayInvertido.push(array.pop())
    arrayInvertido.push(array.pop())
    arrayInvertido.push(array.pop())
    arrayInvertido.push(array.pop())
     return arrayInvertido
 }

 console.log(inverteArray())


/*
somarArray()
Neste exercício, você criará uma função somarArray() que aceita um array de números e retorna a soma de todos eles.
Exemplo:
somarArray([1,2,3])                // 6
somarArray([10, 3, 10, 4])     // 27
somarArray([-5,100])             // 95

*/

console.log("2 - Somar Array")
let arrayNumeros = [1,5,4]
function somarArray(x){
    let soma = arrayNumeros[0] + arrayNumeros[1] + arrayNumeros[2]
    return soma
}

console.log(somarArray(arrayNumeros))

/*
Simulação Array.join()
Neste exercício, você criará uma função chamada join que recebe um array e simula o comportamento do método Array.join().
Importante: Não poderá utilizar o método Array.join() original.
Por exemplo:
join(["o","l","á"]) deve retornar a string "olá".
join([“t”,"c","h","a,"u"]) deve retornar a string "tchau".

*/

console.log("3 - Simula Join")
let letras = ["o","l","á"]
function join(x){
    return letras[0]+letras[1]+letras[2]
}

console.log(join())

/*
Coleções de Filmes (e mais…)
O tech leader da equipe precisa conhecer a estrutura de dados do novo projeto. Para isso, devemos:
Criar a estrutura apropriada para armazenar os seguintes filmes e séries:
	"star wars", "matrix",  "mr. robot", "o preço do amanhã",  "a vida é bela". 
Importante: verifique se tudo funciona corretamente acessando qualquer um dos filmes uma vez que a estrutura correspondente tenha sido criada.

Os filmes devem estar todos em letras maiúsculas. Para isso, crie uma função que recebe um array por parâmetro e converta o conteúdo de cada elemento em letras maiúsculas.
Dica: revise o que faz o método de strings .toUpperCase().
*/

console.log("4 - UpperCase Movies")
let movies = ["star wars", "matrix",  "mr. robot", "o preço do amanhã",  "a vida é bela" ]

function upperCase(){
    let moviesUpp = []
    moviesUpp[0] = movies[0].toUpperCase() 
    moviesUpp[1] = movies[1].toUpperCase() 
    moviesUpp[2] = movies[2].toUpperCase() 
    moviesUpp[3] = movies[3].toUpperCase() 
    moviesUpp[4] = movies[4].toUpperCase() 
    return moviesUpp
}

console.log(upperCase(movies))

/*
Crie outra estrutura semelhante à primeira, mas com os seguintes filmes de animação:
	"toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"
Em seguida, crie uma função que receba dois arrays como parâmetros, para poder adicionar os elementos contidos no segundo array, dentro do primeiro, 
a fim de retornar um único array com todos os filmes como seus elementos.
*/

// let movies = ["star wars", "matrix",  "mr. robot", "o preço do amanhã",  "a vida é bela" ]

console.log("5 - Inclui Array no outro")
let movies2 = ["toy story","finding Nemo","kung-fu panda","wally","fortnite"]
let moviea2length = movies2.length
for (let i = 0; i < moviea2length; i++){
    movies.push(movies2.pop())
}

console.log(movies)

/* function arrayConcat(a1, a2){
    a1.push(a2.pop())
    a1.push(a2.pop())
    a1.push(a2.pop())
    a1.push(a2.pop())
    a1.push(a2.pop())
    return console.log(a1)
}

console.log(arrayConcat(movies,movies2)); */


/*

Durante o processo, percebemos que o último elemento na série de filmes animados é, na verdade, um game. 
Agora devemos editar nosso código e modificá-lo para que possamos remover o último elemento antes de migrar o conteúdo para o array que contém todos os filmes.
PS: por precaução, salve o elemento que você vai deletar em uma variável.
*/
console.log("6 - Retira Game")
let m1 = ["star wars","matrix","mr. robot","o preço do amanhã","a vida é bela"]
let m2 = ["toy story","finding Nemo","kung-fu panda","wally","fortnite"]
let intruso = m2.pop()
let m2lenght = m2.length

for (let i = 0; i < m2lenght; i++){
    m1.push(m2.pop())
}

/* function arrayConcatNoGame(a1, a2){
    intruso = a2.pop()
    a1.push(a2.pop())
    a1.push(a2.pop())
    a1.push(a2.pop())
    a1.push(a2.pop()) 

}*/

 console.log(m1); 

/*
Finalmente, recebemos dois arrays com classificações feitas por diferentes usuários do mundo nos filmes com o seguinte formato:
	const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
	const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];
Crie uma função que compare as notas e nos diga se elas são iguais ou diferentes.
Para verificar se tudo está bem até agora, recomendamos testar cada uma das funções, a fim de verificar seu correto funcionamento.
Se chegarmos a este ponto e tudo estiver bem, o tech leader da equipe deve estar extremamente feliz com nosso trabalho e desempenho.

*/
console.log("7 - Compara notas")
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

for (let i = 0; i < euroScores.length; i++){
    if (asiaScores[i] == euroScores[i]){
        console.log("Notas iguais!")
    } else {
        console.log("Notas diferentes!")
    }
}