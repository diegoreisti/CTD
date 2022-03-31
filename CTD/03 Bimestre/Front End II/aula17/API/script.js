fetch('https://api.thecatapi.com/v1/images/search?category_ids=4&limit=10')
.then(function(resultado){
        return resultado.json()
    })
    .then(function(cats){

        let imagens = document.getElementById('imagens')
        
        cats.forEach(el => {
            let img = document.createElement('img')
            let div = document.createElement('div')

            img.src = el.url
            img.width = 400
            div.style.margin = '30px'

            div.appendChild(img)
            imagens.appendChild(div)

        })      
    })
    .catch(function(erro){
        console.log(erro)
    })
