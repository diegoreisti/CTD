// 1. Crie um formulário com campos de input e botões de submit e reset.
function createElement(){
    const body = document.getElementById('body')

    // body.setAttribute('onload','"onLoad() ;"')
    
    const title = document.createElement('h1')
    title.innerText = 'Cadastro'
    body.appendChild(title)

    const form = document.createElement('form')
    form.setAttribute('class','form')
    form.setAttribute('id','form')
    // 2. Previna a página de ser recarregada quando houver o submit utilizando preventDefault().
    form.addEventListener("submit",(evt)=>evt.preventDefault())
    body.appendChild(form)    

    const labelName = document.createElement('label')
    labelName.setAttribute('for','name')
    labelName.innerText = 'Nome:'
    form.appendChild(labelName)

    const inputName = document.createElement('input')
    inputName.setAttribute('id','name')
    inputName.setAttribute('type','text')
    form.appendChild(inputName)

    const labelEmail = document.createElement('label')
    labelEmail.setAttribute('for','email')
    labelEmail.innerText = 'E-mail:'
    form.appendChild(labelEmail)

    const inputEmail = document.createElement('input')
    inputEmail.setAttribute('id','email')
    inputEmail.setAttribute('type','email')
    form.appendChild(inputEmail)

    const br = document.createElement('br')
    form.appendChild(br)
    form.appendChild(br)

    const btnSubmit = document.createElement('input')
    btnSubmit.setAttribute('type','submit')
    btnSubmit.setAttribute('value','Enviar')
    btnSubmit.setAttribute('id','submit')
    form.appendChild(btnSubmit)

    const btnReset = document.createElement('input')
    btnReset.setAttribute('type','reset')
    btnReset.setAttribute('value','Limpar')
    btnReset.setAttribute('id','reset')
    form.appendChild(btnReset)

    const p1 = document.createElement('p')
    p1.innerHTML = "Abaixo o nº de vezes em que o teclado foi acionado no campo 'Nome'"
    p1.setAttribute('id','pExplica')
    form.appendChild(p1)

    const p2 = document.createElement('p')
    p2.innerHTML = 0
    p2.setAttribute('id','keypress')
    form.appendChild(p2)
  
}

createElement()


//3. Mostre um alerta na página quando a tela terminar de ser carregada.
window.onload = () => alert("3. Mostre um alerta na página quando a tela terminar de ser carregada.")

// 4. Adicione uma cor a um texto quando o mouse ficar acima do mesmo e outra cor quando ele sair do mesmo.
const paragrafo = document.querySelector('#pExplica')

paragrafo.onmouseover = function(){ paragrafo.classList.add('labelOnHover')}
paragrafo.onmouseout = function(){ paragrafo.classList.remove('labelOnHover')}

// 5. Faça um trecho de código que utilize algum evento de teclado, esse evento irá escrever o conteúdo do input em uma tag <p> e logo abaixo o número de vezes que esse evento foi chamado. Exemplo: <p>futebol</p> <p>7</p> .
const p = document.getElementById('keypress')
const input = document.getElementById('name')

input.onkeyup = function(){
    p.innerText = (parseInt(p.innerText) + 1)
}