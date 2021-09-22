const dados = require('./dados');

const totalDados = () => {
    console.log('Total', dados.length);
}

const totalHomens = () => {
    return dados.filter((dado) => {
        return dado.sexo === 'masculino';
    });
} 

const totalMulheres = () => {
    return dados.filter((dado) => {
        return dado.sexo === 'feminino';
    });
} 

const totalAlturaHomens = () => {
    return  homens.reduce((grupo, reduzido) => {
        return grupo + reduzido.altura;
    }, 0);    
}

const mediaAlturaHomens = () => {
    const totalHomens = totalHomens();
    const totalAlturaHomens = totalHomens();
    return totalAlturaHomens / totalHomens.length;
}

const mediaAlturaMulheres = () => {
    const totalMulheres = totalMulheres();
    const totalAlturaMulheres = totalMulheres();
    return totalAlturaMulheres / totalMulheres.length;
}

const testeForEach = (tipoAltura = 'maior') => {
    let altura = 0;

    dados.forEach((objeto) => {
        switch(tipoAltura) {
            case 'maior' :
                if (objeto.altura > altura) {
                    altura = objeto.altura;
                }
            break;
            case 'menor' :
                if (altura === 0) {
                    altura = objeto.altura;
                }

                if (objeto.altura < altura) {
                    altura = objeto.altura;
                }
            break;
        }
    });

    return altura;
}

console.log(testeForEach('menor'));



/* const dados = require('./dados')

const totalDados = () => {
    console.log('Total', dados.length);
}

console.log('Total', dados.length);

//da para fazer assim
const homens = dados.filter((dado) => dado.sexo === 'M')

//ou assim
const mulheres = dados.filter((dado) => {
    return dado.sexo === 'F'
}) 

console.log('Homens', homens.length);
console.log('Mulheres',mulheres.length);

const totalAlturaHomens = homens.reduce((grupo,reduzido) => {
    return grupo + reduzido.altura
}, 0) //ao invés de pegar o objeto inteiro do array ele define o parametro "grupo" como 0, mas poderia ser qualquer valor que eu queira

console.log(totalAlturaHomens / homens.length);

const mediaAlturaHomens = totalAlturaHomens / homens.length

const totalAlturaMulheres = mulheres.reduce((grupo,reduzido) => {
    return grupo + reduzido.altura
}, 0) 

console.log(totalAlturaMulheres / mulheres.length);

const mediaAlturamulheres = totalAlturaMulheres / mulheres.length

 */