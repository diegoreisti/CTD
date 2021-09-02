/**
 * PLANILHA DE DICAS - OPERADORES LÓGICOS
 * 
 * [ ! ] NEGADO
 * [ tudo FALSO ] false, zero/0, vazios: '' ou "", null, undefined, NaN
 * [ tudo VERDADEIRO ] true, '0', 'false', vazios: [], {}, function(){}
 * [ == ] VALOR
 * [ === ] OBJETO
 */


// console.log("Diego Reis".toLowerCase())


let nome = '4556364607935616'

// return masked string
function maskify(cc) {
  return "#".repeat(cc.length-4) + cc.slice(-4)
}

console.log(maskify(nome))

