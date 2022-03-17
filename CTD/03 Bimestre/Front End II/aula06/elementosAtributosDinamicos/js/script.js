// 1- Adiciona ao cartão, o atributo "class" com o valor "cartao"
document.getElementById('cartao').classList.add('cartao')

// 2- Adicione o atributo "src" à imagem com o valor "https://www.youtube.com/img/desktop/yt_1200.png"
document.getElementById('logo').setAttribute('src','https://www.youtube.com/img/desktop/yt_1200.png')

// 3- Remova a classe "titulo-feio" do título do documento
document.querySelector('h1').classList.remove('titulo-feio')

// 4- Verifique se o link para o YouTube tem o atributo href ou não, e imprima esse resultado no console
document.getElementById('link_youtube').hasAttribute('href')

// 5- Capture o valor de href do link do Wikipedia e exiba no console
console.log(document.getElementById('link_wikipedia').getAttribute('href'))

/* 
classList.add()
classList.remove()
classList.toggle()
classList.contains()
**
createElemnt()
createTextNode()
appendChild()
**
hasAttribute()
removeAttribute()
setAttribute()

 */