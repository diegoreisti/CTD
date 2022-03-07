/* 1 - tesoura
2 - papel
3 - pedra */

let maoUsuario = parseInt(prompt('1 - pedra, 2 - papel ou 3 - tesoura?'));

let maoMaquina = parseInt(Math.round(Math.random() * 3 +1));

console.log(maoUsuario);
console.log(maoMaquina);

let resultado = 'Sem cálculo';

if (maoUsuario == 1){
    if (maoMaquina == 1){
        resultado = 'empate';
    }
    if (maoMaquina == 2){
        resultado = 'derrota';
    }
    if (maoMaquina == 3){
        resultado = 'vitória';
    }
}

if (maoUsuario == 2){
    if (maoMaquina == 1){
        resultado = 'vitoria';
    }
    if (maoMaquina == 2){
        resultado = 'empate';
    }
    if (maoMaquina == 3){
        resultado = 'derrota';
    }
}

if (maoUsuario == 3){
    if (maoMaquina == 1){
        resultado = 'derrota';
    }
    if (maoMaquina == 2){
        resultado = 'vitoria';
    }
    if (maoMaquina == 3){
        resultado = 'empate';
    }
}

alert(resultado);