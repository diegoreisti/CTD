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
