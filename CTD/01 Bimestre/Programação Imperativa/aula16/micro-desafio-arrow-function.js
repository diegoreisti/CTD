/* Transforme as seguintes funções em arrow functions:


function print(mensagem){
  console.log(mensagem)
}
 
print("Olá, bom dia")
 
function soma(n1, n2){
  return n1 + n2
}
 
console.log(soma(10, 10)) */

let imprimeMensagem = (mensagem) => console.log(mensagem);

imprimeMensagem("funcionou?")

let soma = (a,b) => a+b

console.log(soma(10,10));