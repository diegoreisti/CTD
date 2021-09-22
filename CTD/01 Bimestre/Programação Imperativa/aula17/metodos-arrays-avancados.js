
// map
let numeros = [2, 4, 6]

let dobro = numeros.map(function(num){
    return num * 2
})

console.log(dobro);

// filter

let idades = [22,8,17,14,30]

let maiores = idades.filter(function(idade){
    return idade > 18
})

console.log(maiores);

//reduce

let numerosSomar = [5,7,16]

let soma = numerosSomar.reduce(function(acumulador, numero){
    return acumulador + numero
})

console.log(soma);

// forEaach

var paises = ['Brasil','EUA','Argentina']

paises.forEach(function(pais){
    console.log(pais);
})

// slice

let eu = 'Diego'

let parteEu = eu.slice(0,3);
console.log(parteEu);

// splice(inicio, qtdItensRemover, itemAdicionar1, itemAdicionar2)
let numerosSlc = [3,4,5,6,7]
// @returns — An array containing the elements that were deleted.
console.log('Tirando ' + numerosSlc.splice(0,2))

console.log('Restou ' + numerosSlc);

// sort
// ordena
console.log(paises.sort());

// flat

let numerosArray = [1,2,3,[4],[[5,6]],7] 

let novoArray = numerosArray.flat()

console.log(novoArray);

novoArray = numerosArray.flat(2)

console.log(novoArray);

// includes

let nomes = ['Diego','Maria','Carla','Fatima','Manu','Antonio','Maria','Roberto','Duda']

console.log(nomes.includes('Duda'));
console.log(nomes.includes('Celso'));

// find

let moedas = [
    {nome: 'Bitcoin', simbolo: 'BTC'},
    {nome: 'Bitcoin', simbolo: 'BTC'},
    {nome: 'Ethereum', simbolo: 'ETH'},
    {nome: 'Cardano', simbolo: 'ADA'},
    {nome: 'Dega', simbolo: 'DGA'},
]

console.log(
moedas.find(function(moeda){
    return moeda.nome === 'Dega'
})
)
