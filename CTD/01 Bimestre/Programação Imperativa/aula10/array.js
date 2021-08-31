/* Micro desafios

Crie um array que contenha nomes de produtos para compra. 

Após isso, exiba no console os resultados das funções relacionadas aos arrays, 
que são: Join, Pop, Push, Shift e Unshift. 

Também se deve escrever com suas palavras, o que cada função realiza. Seguem abaixo alguns exemplos.

console.log(“O método Join realiza tal coisa”)
console.log(RESULTADO_DO_JOIN)
 */

let groceries = ["maçã", "banana","ovos","farinha","água","carne"]

// Join, 
console.log("Array inicial.: " + groceries)
console.log("Utilizando join(' - ').: " + groceries.join(" - "))
console.log("Esse método separa os itens do array com um separador indicado, do contrário usa vírgula")

// Pop, 
console.log("Utilizando pop().: " + groceries.pop())
console.log("Resultado após o pop().: " + groceries)
console.log("Retira o último item da lista")

// Push, 
console.log("Utilizando push('chocolate').: " + groceries.push("chocolate"))
console.log("Resultado após o push().: " + groceries)
console.log("Insere um item no final da lista")

//Shift 
console.log("Utilizando shift().: " + groceries.shift())
console.log("Resultado após o shift().: " + groceries)
console.log("Retira um item no início da lista")

// Unshift
console.log("Utilizando unshift('pão').: " + groceries.unshift("pão"))
console.log("Resultado após o unshift().: " + groceries)
console.log("Insere um item no início da lista")