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

module.exports = Aluno