const body = document.querySelector('body')

const btnSubmit = document.querySelector('.submit')
btnSubmit.addEventListener('click',function submitCard(){
   
let imageUrl = document.querySelector('#imageUrl').value
let title = document.querySelector('#title').value
let description = document.querySelector('#description').value

    let card =  `<img src="${imageUrl}" id="imageUrl">
                <p>${title}</p>
                <p>${description}</p>
                `
    let div = document.createElement('div') 
    div.setAttribute('class','item')
    div.innerHTML = card
    body.appendChild(div)

    limparFormulario()
})

function limparFormulario(){
    document.querySelector('#imageUrl').value = ''
    document.querySelector('#title').value = ''
    document.querySelector('#description').value = ''
}