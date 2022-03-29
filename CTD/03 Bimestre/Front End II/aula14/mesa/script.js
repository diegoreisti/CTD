const form = queryS('form')
const comment = queryS("#comment");
const person = queryS("#name");
const dados = queryS('#dados');
const alert = queryS('.alert ul')

let arrayComment = [];

function getEBI(el) {
  return document.getElementById(el)
}

function queryS(el) {
  return document.querySelector(el)
}

function empty(input) {
  return input.value.trim() === ''
}

function errorMsg(msg) {
  alert.innerHTML += `<li>${msg}</li>`
}

person.value = sessionStorage.getItem('person')

form.addEventListener('submit', function (ev) {
  ev.preventDefault();

  alert.innerHTML = ''
  getEBI('error-list').setAttribute('hidden',true)

  if (empty(person)) {
    errorMsg('Nome não pode estar vazio')
  }

  if (empty(comment)) {
    errorMsg('Comentário não pode estar vazio')
  }

  if (alert.querySelectorAll('li').length > 0) {
    ev.preventDefault();
    getEBI('error-list').removeAttribute('hidden')
  } else {    
    
    arrayComment.push({
      name: person.value,
      comment: comment.value
    });
    
    dados.innerHTML += `<p>${comment.value}</p>`
    sessionStorage.setItem('person',person.value)
        
  }

});


//  window.localStorage.setItem('comentarios', comment.value);
// var user = window.localStorage.getItem('comentarios');
