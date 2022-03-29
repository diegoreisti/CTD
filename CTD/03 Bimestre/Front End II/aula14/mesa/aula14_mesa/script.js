const form = document.querySelector('form')
const name = document.querySelector("#name");
const comment = document.querySelector("#comment");
const dados = document.querySelector('#dados');

let arrayComment = [];



form.addEventListener('submit', function submit(e) {
    e.preventDefault();

    
    if(name.value != "" && comment.value != ""){
        arrayComment.push({
            name: name.value,
            comment: comment.value
        });

        let localStorageComment = localStorage.setItem('comentarios', comment.value);
        dados.innerHTML += `<p>Seu comentário - ${comment.value}</p>`
        
    }
    
});


//  window.localStorage.setItem('comentarios', comment.value);
//  var user = window.localStorage.getItem('comentarios');
