function acaoCarro (outraFuncao) {
    return outraFuncao()
}

function andar(){
    console.log("O carro está andando");
}

function parar() {
    console.log("O carro parou");
}



acaoCarro(andar);


acaoCarro(parar);