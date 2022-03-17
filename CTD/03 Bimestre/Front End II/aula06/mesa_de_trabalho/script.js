
const listaFelinos = [

    {
        titulo: "Tigre",
        descricao: `O tigre (Panthera tigris) é uma das espécies da subfamília Pantherinae (família Felidae)
        pertencente ao gênero Panthera. É encontrado de forma nativa apenas no continente asiático; é um predador
        carnívoro e
        é a maior espécie de felino do mundo junto com o leão.`,
        imgURL: "./imagens/tiger.jpg"
    },
    {
        titulo: "O Leão",
        descricao: `O leão (Panthera leo) é um mamífero carnívoro da família dos felinos é uma das cinco espécies do gênero
        gênero Panthera. Os leões selvagens vivem em populações cada vez mais dispersas e fragmentadas na África
        subsahariana
        (com exceção das regiões florestais e das regiões de selva da Bacia do Congo) e uma pequena área do noroeste da
        Índia.`,
        imgURL: "./imagens/leon.jpg"
    },
    {
        titulo: "O leopardo",
        descricao: `O leopardo (Panthera pardus) é um mamífero carnívoro da família dos felinos. Como três dos outros
        felinos do gênero Panthera: o leão, o tigre e a onça-pintada, são caracterizados por uma modificação do osso
        hióide que lhes permite rugir.
        É também conhecido como pantera marrom e, quando tem a pelagem completamente escura, como pantera negra
        (melanista).`,
        imgURL: "./imagens/leopardo.jpg"
    },
    {
        titulo: "A Pantera Negra",
        descricao: `A pantera negra é uma variação escura (melanismo) de várias espécies de felinos grandes, especialmente o
        leopardo (Panthera pardus) e a onça-pintada (Panthera onca).
        Mas deve-se ressaltar que não se trata de uma espécie nova, nem mesmo de uma subespécie, é simplesmente uma
        variação negra destes animais.`,
        imgURL: "./imagens/pantera-negra.jpg"
    },
    {
        titulo: "O Jaguar",
        descricao: `O jaguar, ou jaguarete (Panthera onca) é um carnívoro felídeo da sub-família Panthera e do
        gênero Panthera. É a única das cinco espécies existentes deste gênero encontradas nas Américas. Também
        é o maior felino das Américas e o terceiro maior do mundo, depois do tigre (Panthera tigris) e do leão (Panthera
        leo).`,
        imgURL: "./imagens/jaguar.jpg"
    },
    {
        titulo: "A Chita",
        descricao: `O guepardo, ou chita (Acinonyx jubatus) é um membro atípico da família felina. É o único
        representante vivo do gênero Acinonyx. Ele caça graças à sua visão e grande velocidade. É o animal terrestre
        mais rápido
        do mundo, atingindo uma velocidade máxima de 115 km/h em corridas de até quinhentos metros.`,
        imgURL: "./imagens/chita.jpg"
    }

]


let div = document.getElementById('container')

window.onload = function(){
    feedContent();
}

function feedContent(){    
    
    for (let felino of listaFelinos){

        let card = 
        `<div class="item">
            <img src="${felino.imgURL}">
            <h2>${felino.titulo}</h2>
            <p>${felino.descricao}</p>
        </div>
        `
        let novoNo = document.createElement('div')

        novoNo.innerHTML = card;

        div.appendChild(novoNo)

    }    
   
}

function darkMode() {
    let body = document.querySelector('body');
    body.classList.toggle('backgroundDarkMode');

    let h1 = document.querySelector('h1');
    h1.classList.toggle('h1DarkMode');

    let div = document.querySelectorAll('div');
    div.forEach(element => {element.classList.toggle('itemDarkMode')});

    let h2 = document.querySelectorAll('h2');
    h2.forEach(element => {element.classList.toggle('textDarkMode')});

    let p = document.querySelectorAll('p');
    p.forEach(element => {element.classList.toggle('textDarkMode')});

}