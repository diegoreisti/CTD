const btn = document.querySelector('#send')

btn.addEventListener('click',function(e){
    e.preventDefault();

    var nome = document.querySelector('#nome').value
    var sobrenome = document.querySelector('#sobrenome').value

    const concatenado = document.querySelector('#concat')
    const trim = document.querySelector('#trim')
    const uppercase = document.querySelector('#uppercase')
    const lowercase = document.querySelector('#lowercase')
    const replace = document.querySelector('#replace')

    var nomeCompleto = concatena(nome,sobrenome)
    concatenado.innerHTML += nomeCompleto
    trim.innerHTML += semEspaco(nomeCompleto)
    uppercase.innerHTML += Maiusculo(nomeCompleto)
    lowercase.innerHTML += Minusculo(nomeCompleto)
    replace.innerHTML += Replace(nomeCompleto)
   

    // trim()
})

function concatena(nome, sobrenome){
    return nome.concat(' ',sobrenome)
}

function semEspaco(nome){
    return nome.trim()
}

function Maiusculo(nome){
    return nome.toUpperCase()
}

function Minusculo(nome){
    return nome.toLowerCase()
}

function Replace(nome){
    return nome.replace(/a/g,"@").replace(/e/g,"3");
}