const aluno = require('./aluno');
const estudantes = require('./estudantes')
const curso = require('./curso')



console.log('\n01 - validando o módulo de aluno');
console.log('---------------------------------------- \n');
console.log('Resultado da criação de um novo objeto Aluno.:');
let novoAluno = new aluno('Diego', 0, [10,9,7])
console.log(novoAluno);

console.log('\nCalculando a média do aluno atráves do método calcularMedia');
console.log(novoAluno.calcularMedia());

console.log('\nAdicionando uma falta ao aluno criado e visualizando a mudança.:');
novoAluno.faltas();
console.log(novoAluno);

console.log('\n02 - Validando o módulo de curso');
console.log('---------------------------------------- \n');

console.log('\nPercorrendo o arquivo estudantes.js e criando um array');
console.log('... ver linha 25.');
let arrayEstudantes = [];
for (x of estudantes){
    arrayEstudantes.push(new aluno(x.nome, x.qtdFaltas, x.notas));
}

console.log('\nCriando um novo curso com o array de alunos gerado anteriormente');
console.log('... ver linha 32');
let novoCurso = new curso('Programação Imperativa', 7, 2, arrayEstudantes)

console.log('\nValidação do método "verificaAprovado" que recebe um aluno e verifica se o mesmo foi aprovado.:');
console.log(novoCurso.verificaAprovado('Érico Ibiapina')); //['Ivete Sangalo','Mario Sérgio Cortella','Érico Ibiapina','Ana Teixeira','Diego Reis']

console.log('\nValidação do método "situacaoTurma" que recebe uma turma e retorna um array de booleanos.:');
console.log(novoCurso.situacaoTurma())

console.log('\nApenas imprimindo o array de alunos importado do arquivo estudantes.js');
console.log(arrayEstudantes);

console.log('\nOBS: Em cada arquivo eu coloquei uma linha identificando a reposta do micro desafio caso seja necessário comparar o que se pede com o que foi codado \n Acho que é isso! :D');