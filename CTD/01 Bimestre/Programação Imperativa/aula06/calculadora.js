// Calculadora - Nível I

// Crie um arquivo calculadora.js que terá as diferentes operações  para realizar.
// Crie uma função adicionar, que deverá receber dois parâmetros e retornar a soma deles.
function adicionar(x, y){
    return x + y
}

// Crie uma função de subtração, que deverá receber dois parâmetros e retornar a subtração do primeiro menos o segundo.
function subtracao(x, y){
    return x - y
}

// Crie uma função de multiplicação, que deverá receber dois parâmetros e retornar o resultado de sua multiplicação.
function multiplicacao(x, y){
    return x * y
}

// Crie uma função de divisão, que receberá dois parâmetros e retornará o resultado da divisão do primeiro sobre o segundo
function divisao(x, y){
    return x / y
}

// Calculadora - Nível II

// No seu arquivo calculadora.js,  a partir das 4 funções feitas anteriormente, crie um console.log no qual você irá colocar uma string para indicar que abaixo dela você começará a testar as funções, por exemplo:
// console.log ("-------------- Teste de Operações / Calculadora --------------")
console.log ("-------------- Teste de Operações / Calculadora --------------")

// Execute a função que soma e a função que subtrai, passando quaisquer dois números como argumentos. Mostrar resultados no console.
console.log("Soma: " + adicionar(1,1))
console.log("Subtração: " + subtracao(1,1))

// Execute a função que multiplica, passando quaisquer dois números como argumentos. Mostre o resultado no console.
console.log("Multiplicação: " + multiplicacao(2,4))

// Execute a função que faz divisão, passando quaisquer dois números como argumentos. Mostre o resultado no console.
console.log("Divisão: " + divisao(36,3))

// Execute a função que faz divisão, passando agora o número zero como um dos dois argumentos. Mostre o resultado no console.
console.log("Divisão por zero: " + divisao(36,0))

// Calculadora - Nível III - Funções Extras

// Crie uma função chamada quadradoDoNumero, que recebe um número como parâmetro e deve retornar esse número multiplicado por ele mesmo, ou seja, ao quadrado.
// Importante: quadradoDoNumero() deve usar a função multiplicação() para calcular o quadrado do parâmetro inserido em power().

function quadradoDoNumero(n){
    return multiplicacao(n , n)
}

console.log("Quadrado do nº: " + quadradoDoNumero(3))

// Crie a função mediaDeTresNumeros, ela deve calcular a média de 3 números, que serão inseridos por parâmetro.
// Importante: Em mediaDeTresNumeros() você precisará usar algumas funções criadas anteriormente em nossa calculadora.

function mediaDeTresNumeros(a, b, c){
   return (divisao( (adicionar(c, (adicionar(a,b)))), 3)).toFixed(2)

}

console.log("Média três números " + mediaDeTresNumeros(13,5,38))


// Crie a função calculaPorcentagem, que receberá dois parâmetros: o número total e a porcentagem que deseja calcular, e que deverá retornar x% de 
    //totalPorcentagem.
    // Exemplo: calculaPorcentagem(300, 15)  (deve retornar 45, pois é 15% de 300). 

    // Importante: calculaPorcentagem() você precisará usar algumas funções criadas anteriormente em nossa calculadora.

function calculaPorcentagem(n, p){
    return "Percentual: " + multiplicacao(n, divisao(p,100))
}
    
console.log(calculaPorcentagem(300,15))


// Crie uma função geradorDePorcentagem que leva dois parâmetros, e que deverá retornar a porcentagem do primeiro em relação ao segundo parâmetro.
// Exemplo: geradorDePorcentagem (2, 200) (deve retornar 1 já que 2 é 1% de 200).

function geradorDePorcentagem(a, b){
    return (a * 100) / b  //x = 2*100/200
    
}

console.log(geradorDePorcentagem(2,200) + "%")


