const fs = require('fs');
const path = require('path');

let caminhoArquivo = path.join('./CTD/01 Bimestre/Programação Imperativa/aula14/filmes.txt')

fs.appendFileSync(caminhoArquivo,", Mogli")