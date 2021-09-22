//Crie um array de números pares, e utilizando a função .map() nesse array, crie um novo array com apenas números ímpares.

let pares = [2, 8, 16, 20, 4, 10, 30, 50, 62, 84]

let impares = pares.map(function(add){
    return add + 1
})

console.log(impares);

//Crie um array de nomes, que possua dois índices com o nome Maria. Utilize o .filter() para obter apenas esses dois índices com o nome Maria.

let nomes = ['Diego','Maria','Carla','Fatima','Manu','Antonio','Maria','Roberto','Duda']

let marias = nomes.filter(function(procuro){
    return procuro === 'Maria'
})

console.log(marias);

//Crie um array de números e utilize a função .reduce() para devolver uma string com os números formatados.

let numeros = [1,5,9,3,7] 

let numeroString = numeros.reduce(function(n1, n2){
    return n1 + ' - ' + n2
})

console.log(numeroString);


let aleatorio = ['D','i','e','g','o']

let juntaLetra = aleatorio.reduce(function(n1, n2){
    return n1 + n2
})

console.log(juntaLetra);

// Crie um array de animais, após isso passe por cada índice utilizando o .forEach() e imprima a frase “O animal é NOME_DO_ANIMAL”.

let animais = ['Vaca','Carneiro','Ovelha','Touro','Cobra','Rato']

let escreve = animais.forEach(function(nome){
    console.log(`O animal é ${nome}`);
})


console.log(escreve);

