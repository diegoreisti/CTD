// Micro desafio 1 - Objeto Aluno
function Aluno(nome, qtdFaltas, notas) {
this.nome = nome,
this.qtdFaltas = qtdFaltas,
this.notas = notas,
// Micro desafio 2 - métodos
this.calcularMedia = calcularMedia, 
this.faltas = faltas
}

function calcularMedia(){
    let media = 0;
    for (let i = 0; i < this.notas.length; i++) {
        media += this.notas[i];        
    }
 return (media/this.notas.length).toFixed(1)
}


function faltas(){
    this.qtdFaltas += 1
}


// ****  RETIRAR COMENTÁRIO DO BLOCO ABAIXO PARA VALIDAR ****
/* console.log('Resultado da criação de um novo objeto Aluno.:');
let aluno = new Aluno('Diego', 0, [10,9,7])
console.log(aluno);

console.log('Calculando a média do aluno atráves do método calcularMedia');
console.log(aluno.calcularMedia());

console.log('Adicionando uma falta ao aluno criado e visualizando a mudança.:');
aluno.faltas();
console.log(aluno); */

module.exports = Aluno