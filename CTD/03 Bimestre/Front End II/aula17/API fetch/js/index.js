const main = document.querySelector('main')

const btnRandom = document.getElementById("random")


btnRandom.addEventListener('click', () => {

    fetch('https://randomuser.me/api/?results=05')
    .then(response => {
        return response.json()
    })
    .then(data => {

        let authors = data.results; 

        return authors.map(function (author){

  
            main.innerHTML += `
            <div class="card" id="card">
              <img src='${author.picture.large}'> </img>
              <p>${author.name.title} ${author.name.first} ${author.name.last}</p>
              <p>${author.email}</p>
            </div>
            
            `


        })
        
    });



})