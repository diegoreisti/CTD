
let scoreUsuario = 0;
let scoreMaquina = 0;
let empates = 0;

for (let i = 0; i < 3; i++) {

    let maoUsuario = parseInt(prompt('1 - pedra, 2 - papel ou 3 - tesoura?'));
    let maoMaquina = parseInt(Math.round(Math.random() * 3 +1)); 
  
        
switch(maoUsuario){
    case 1: 
        if (maoMaquina == 1){
            empates++;
            alert('Empatou');
        }
        if (maoMaquina == 2){
            scoreMaquina++;
            alert('Máquina ganhou');
        }
        if (maoMaquina == 3){
            scoreUsuario++;
            alert('Usuário ganhou');
        }
        break;

    case 2:
        if (maoMaquina == 1){
            scoreUsuario++;
            alert('Usuário ganhou');
        }
        if (maoMaquina == 2){
            empates++;
            alert('Empatou');
        }
        if (maoMaquina == 3){
            scoreMaquina++;
            alert('Máquina ganhou');
        }
        break;
    case 3:
        if (maoMaquina == 1){
            scoreMaquina++;
            alert('Máquina ganhou');
        }
        if (maoMaquina == 2){
            scoreUsuario++;
            alert('Usuário ganhou');
        }
        if (maoMaquina == 3){
            empates++;
            alert('Empatou');
        }
        break;
    default: alert('Burrão hein...');  i--;
}

}

alert(`## SCORE ##\n Usuário: ${scoreUsuario}\n Máquina: ${scoreMaquina}\n Empates: ${empates}`);