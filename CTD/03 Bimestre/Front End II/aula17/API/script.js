fetch('https://api.thecatapi.com/v1/images/search?category_ids=4&limit=3')
    .then(function(cats){
        return cats.json()
    })
    .then(function(cat){

        let imagens = document.getElementById('imagens')

        cat.forEach(el => {
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
