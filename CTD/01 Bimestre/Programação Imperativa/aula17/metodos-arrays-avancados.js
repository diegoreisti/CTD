
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

