const urlImagens = []

const imagens = document.querySelectorAll("img")

imagens.forEach((_, index) => {

    const url = prompt(`Adicione o url para a imagem ${index + 1}`)

    urlImagens.push(url)

})

urlImagens.forEach((url,index) => {

    const imagem = document.querySelector(`#imagem-${index + 1}`)

    const link = document.querySelector(`#link-${index + 1}`)

    imagem.setAttribute("src", url)

    link.setAttribute("href", url)

    link.setAttribute("target", "_blank")

})

/* pegar a tag A pela class
criar variavel pra seleção
setattribute(src
setattribute(href
(href,url)
(src,url)

target, blank
 */