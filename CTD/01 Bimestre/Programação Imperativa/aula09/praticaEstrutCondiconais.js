//Prática de Estruturas Condicionais

/* 1 - Escreva uma função utilizando uma estrutura básica de IF/ELSE que verifique uma senha. A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:
	- ACESSO PERMITIDO caso a senha seja válida.
	- ACESSO NEGADO caso a senha seja inválida. */

function senha(psw){
    if (psw == 1234){
        return "ACESSO PERMITIDO"
    } else return "ACESSO NEGADO"
}

console.log(senha(1234))

/* 2 - Escreva uma função utilizando a estrutura IF/ELSE-IF/ELSE que receba dois inteiros e diga qual deles é o maior, 
qual deles é menor OU se são iguais. */

function doisInteiros(a,b){
    if (a == b){
        return "NÚMEROS IGUAIS"
    } else 
    
    if (a > b){
        return `${a} MAIOR QUE ${b}`
    } else return `${b} MAIOR QUE ${a}`
}

// console.log(doisInteiros(10,10))

/* 3 - Escreva um programa utilizando a estrutura de switch que imprima o mês de acordo com o número fornecido.
	- Exemplo: quando envio o número 9, o retorno será: 'SETEMBRO'*/

function qualMes(m){
    let mes = ""
    switch (m){
        case 1 : mes = "Janeiro"
        break;
        case 2 : mes = "Fevereiro"
        break;
        case 3 : mes = "Março"
        break;
        case 4 : mes = "Abril"
        break;
        case 5 : mes = "Maio"
        break;
        case 6 : mes = "junho"
        break;
        case 7 : mes = "Julho"
        break;
        case 8 : mes = "Agosto"
        break;
        case 9 : mes = "Setembro"
        break;
        case 10 : mes = "Outubro"
        break;
        case 11: mes = "Novembro"
        break;
        case 12 : mes = "Dezembro"
        break;
    }

    return mes
}

// console.log(qualMes(9))

//4 - Reescreva função do exercício 1, utilizando o operador ternário.

function senhaOpTern(psw){
    return psw == 1234 ? "ACESSO PERMITIDO" : "ACESSO NEGADO"
}

// console.log(senhaOpTern(1234))