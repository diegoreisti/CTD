/* 2 ͦ Checkpoint de programação imperativa
Olá, você foi contratado para executar este projeto. É importante que você analise, entenda o pedido do cliente e 
desenvolva conforme solicitado. Veja abaixo os requisitos do projeto:

- Precisamos desenvolver um menu para um microondas super veloz, onde teremos 5 opções de comida com seus respectivos 
tempos pré-definidos. 

      1 - Pipoca – 10 segundos (padrão);
      2 - Macarrão – 8 segundos (padrão);
      3 - Carne – 15 segundos (padrão);
      4 - Feijão – 12 segundos (padrão);
      5 - Brigadeiro – 8 segundos (padrão); */

      
/*- O usuário poderá alterar o tempo padrão, aumentando ou diminuindo de acordo com sua vontade. Se o tempo informado 
for maior que 2x o necessário, exibir mensagem que a comida queimou.
- Se o tempo for menor que o padrão, exibir a mensagem: "tempo insuficiente"; 
- Opções não listadas no menu, devem exibir uma mensagem de erro: "Prato inexistente";
- Se o tempo for 3x maior que o necessário para o prato, o microondas deve exibir a mensagem: “kabumm”;
- No final de cada tarefa, o microondas deverá exibir a mensagem: "Prato pronto, bom apetite!!!". */


function microondas(opcao,tempo){
    //opção inexiste
    if (opcao < 1 || opcao > 5){
        return "Prato inexistente"
    } 
      //se a opção existe e o tempo é padrão
      else if (!tempo){
        return "Prato pronto, bom apetite!!!"
        } 

        //se o tempo é diferente do padrão
        switch (opcao){
            case 1 :
                if (tempo >= 10 && tempo < 10*2){
                   return "Prato pronto, bom apetite!!!"
                } else if (tempo < 10){
                    return "tempo insuficiente";
                } else if (tempo >= 10*2 && tempo < 10*3){
                    return "comida queimou"
                } else if (tempo >= 10*3){
                    return "“kabumm”"
                } 
            break;

            case 2 :
                if (tempo >= 8 && tempo < 8*2){
                    return "Prato pronto, bom apetite!!!"
                 } else if (tempo < 8){
                     return "tempo insuficiente";
                 } else if (tempo >= 8*2 && tempo < 8*3){
                     return "comida queimou"
                 } else if (tempo >= 8*3){
                     return "“kabumm”"
                 } 
            break;

            case 3 :
                if (tempo >= 15 && tempo < 15*2){
                    return "Prato pronto, bom apetite!!!"
                 } else if (tempo < 15){
                     return "tempo insuficiente";
                 } else if (tempo >= 15*2 && tempo < 15*3){
                     return "comida queimou"
                 } else if (tempo >= 15*3){
                     return "“kabumm”"
                 } 
            break;

            case 4 :
                if (tempo >= 12 && tempo < 12*2){
                    return "Prato pronto, bom apetite!!!"
                 } else if (tempo < 12){
                     return "tempo insuficiente";
                 } else if (tempo >= 12*2 && tempo < 12*3){
                     return "comida queimou"
                 } else if (tempo >= 12*3){
                     return "“kabumm”"
                 } 
            break;

            case 5 :
                if (tempo >= 8 && tempo < 8*2){
                    return "Prato pronto, bom apetite!!!"
                 } else if (tempo < 8){
                     return "tempo insuficiente";
                 } else if (tempo >= 8*2 && tempo < 8*3){
                     return "comida queimou"
                 } else if (tempo >= 8*3){
                     return "“kabumm”"
                 } 
            break;


        }
        
    }


    console.log(microondas(4,15))