//EQUIPE 3
//Marcelo Garofalo
//Michel Picozzi
//Erick Pereira Araujo
//Atef Chelaghma
//Rhuam Bello Carneiro
//João Sousa

document.body.innerHTML += `
    <form action="">
        <div>
            <input type="" name="" id="inputTask" placeholder="Nova Tarefa">
            <button type="submit">Submit</button>
            <button type="reset">Reset</button>
        </div>
    </form>
    <div>
        <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Adipisci, accusantium!</p>
    </div>  
    `

//acessando campos de entrada e o método preventDefatul
const form = document.querySelector("form");
const inputTask = document.getElementById("inputTask");
const container = document.querySelector("div");

form.addEventListener('submit', executaEvento);

function criaParagrafo(e){
    container.innerHTML +=`
    <p>${e.target.value}</p>
    <p>${e.target.value.length}</p>
    `
    e.preventDefault();
}

inputTask.addEventListener('keydown', criaParagrafo);

//Manipulador de eventos
function executaEvento(e) {
    console.log(`Tipo do Evento: ${e.type}`);
    console.log(inputTask.value);
    e.preventDefault();
    console.log(e.target.value);
}

const mudaCor = document.querySelector("p");

mudaCor.addEventListener('mouseover', mudaCorIn);
function mudaCorIn(event) {
    event.target.style.color = "Yellow"
}

mudaCor.addEventListener('mouseout', tiraCorIn);
function tiraCorIn(event) {
    event.target.style.color = "Black"
}

window.onload = () => alert ('A página foi carregada');

