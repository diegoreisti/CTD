const body = document.querySelector('body')

const onSubmit = document.querySelector('.form')
onSubmit.addEventListener('submit',function submitCard(event){
   
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

    event.preventDefault()

})

function limparFormulario(){
    document.querySelector('#imageUrl').value = ''
    document.querySelector('#title').value = ''
    document.querySelector('#description').value = ''
}