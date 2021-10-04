//Micro desafio 3 - Objeto Curso
const Aluno = require('./aluno');
const estudantes = require('./estudantes')

function Curso(nomeCurso, notaAprovacao, faltasMaximas, listaEstudantes){
    this.nomeCurso = nomeCurso,
    this.notaAprovacao = notaAprovacao,
    this.faltasMaximas = faltasMaximas,
    this.listaEstudantes = listaEstudantes,
    //Métodos soliicitados nos Micro desafios 4, 5 e 6
    this.adicionaAluno = adicionaAluno,
    this.verificaAprovado = verificaAprovado,
    this.situacaoTurma = situacaoTurma
}

//Micro desafio 7 - Importando array de estudandos do arquivo estudantes.js
let arrayEstudantes = [];
for (x of estudantes){
    arrayEstudantes.push(new Aluno(x.nome, x.qtdFaltas, x.notas));
}


let curso = new Curso('Programação Imperativa', 7, 2, arrayEstudantes)

//Micro desafio 4 - método adiciona aluno
function adicionaAluno(aluno){
    this.listaEstudantes.push(aluno)
}

//Micro desafio 5 - verificar se está aprovado
function verificaAprovado(nome){
    for (let value of this.listaEstudantes) {
        if (value.nome === nome){
            //
            if (value.qtdFaltas > this.faltasMaximas) {
                return 'Reprovado por falta'
            } 
             //
             else if ( value.calcularMedia() < this.notaAprovacao) { return 'Reprovado por nota' }  
             //
             else if ( value.calcularMedia() >= this.notaAprovacao
                       &&
                       value.qtdFaltas < this.faltasMaximas) { return 'Aprovado' } 
             //
             else if ( value.qtdFaltas == this.faltasMaximas ) {
                       if (value.calcularMedia() > (this.notaAprovacao * 1.1)) { 
                            return 'Aprovado + 10% da média' 
                        } else 
                            return 'Reprovado - 10% da média' 
                        }      
             }                        
    }
    return 'Aluno não encontrado'
  }

  //Micro desafio 6 - array de booleanos com os alunos aprovados e reprovados
  function situacaoTurma(){
    let situacao = [];
    for (let x of curso.listaEstudantes){
        situacao.push(curso.verificaAprovado(x.nome).startsWith('Aprovado'));
    }
    return situacao;
  }

//Inserindo alunos no curso antes da importação do arquivo estudantes.js (##teste##)
/* curso.adicionaAluno(new aluno('Diego', 0, [10,9,7]))
curso.adicionaAluno(new aluno('Duda', 0, [6,7,5]))
curso.adicionaAluno(new aluno('Manu', 2, [7,7.5,9])) */


// Apenas listando os estudantes ##teste##
// console.log(curso.listaEstudantes);
// console.log(curso.listaEstudantes[4]);

module.exports = Curso;