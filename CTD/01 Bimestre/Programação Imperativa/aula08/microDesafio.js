/* Micro desafio

Com este exercício, vamos construir um if simples.

Declare uma variável com o nome status. Atribua a ela um valor booleano: (true ou false).

Em seguida, faça um if que avalie o valor contido nesta variável. Se o valor armazenado for true, imprima a seguinte mensagem no console: 
    O valor é true - verdadeiro. Caso contrário, imprima a mensagem: O valor é false - falso. */

    function escreve(x){
        return console.log(x)
    }

     let status = true

    status ? escreve("Verdadeiro") : escreve("Falso")

    /*     
    if (status == true){
        escreve("Verdadeiro")
    } else {
        escreve("falso")
    } */



    /*Crie uma variável chamada linguagem, que terá uma string atribuída a ela. 
    Em seguida, construa uma condicional if/else para que, se a variável estiver armazenando o valor "javascript", 
    ela deve imprimir no console, o texto: "Estou aprendendo". Contudo, caso a variável esteja armazenando qualquer outra linguagem
    , imprima "Aprenderei mais tarde".*/

    let linguagem = "JavaScript"

    if (linguagem.toLowerCase() === "javascript"){
        escreve("Estou aprendendo")
    } else {
        cescreve("Aprenderei mais tarde")
    }

 /*    Em um parque de diversões nos pedem um programa para verificar se os
passageiros da montanha-russa podem entrar no brinquedo.
1) Crie uma função podeSubir() que receba dois parâmetros:
- altura da pessoa;
- se está acompanhada.

Deve retornar um valor booleano (TRUE, FALSE) que indique se a pessoa pode
subir ou não, baseado nas seguintes condições:

a) A pessoa deve medir mais de 1.40m e menos de 2 metros.
b) Se a pessoa medir menos de 1.40m, deverá ir acompanhada.
c) Se a pessoa medir menos de 1.20m, não poderá subir, nem
acompanhada.

2) Modifique a função podeSubir(), de modo que ela exiba uma mensagem
de autorização ou de impedimento no acesso ao brinquedo dependendo

se a pessoa se enquadra ou não nas condições do exercício anterior. Por
exemplo:

a) Em caso de autorização, exiba a mensagem: “Acesso
autorizado” ou “Acesso autorizado somente com
acompanhante”;
b) Em caso de impedimento, exiba a mensagem: “Acesso
negado.” */

function podeSubir(altura, acompanhada){
    
    if (altura <= 1.20){
        return "Acesso negado."
    } else if  (altura >= 1.40 && altura < 2.00) {
        return "Acesso autorizado"
    } else if (altura < 1.40 && acompanhada){
        return "Acesso autorizado com acompanhante"
    } else return "Acesso negado."
    
}

escreve(podeSubir(1.30,false))
