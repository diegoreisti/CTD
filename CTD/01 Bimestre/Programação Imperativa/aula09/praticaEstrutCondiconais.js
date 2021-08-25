//1
function senha(psw){
    if (psw == 1234){
        return "ACESSO PERMITIDO"
    } else return "ACESSO NEGADO"
}

console.log(senha(1234))

//2
function doisInteiros(a,b){
    if (a == b){
        return "NÚMEROS IGUAIS"
    } else 
    
    if (a > b){
        return `${a} MAIOR QUE ${b}`
    } else return `${b} MAIOR QUE ${a}`
}

// console.log(doisInteiros(10,10))

//3
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

//4
function senhaOpTern(psw){
    return psw == 1234 ? "ACESSO PERMITIDO" : "ACESSO NEGADO"
}

// console.log(senhaOpTern(1234))