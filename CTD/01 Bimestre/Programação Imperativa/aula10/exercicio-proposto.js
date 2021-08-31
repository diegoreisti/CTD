// O exercício a seguir é proposto:
// Usando apenas .pop() e .push()
// crie uma função que receba uma matriz de 4 elementos por parâmetro
// retorne uma matriz com os elementos invertidos em sua ordem:
// Então [1,2,3,4]
// retorna [4,3,2,1]

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