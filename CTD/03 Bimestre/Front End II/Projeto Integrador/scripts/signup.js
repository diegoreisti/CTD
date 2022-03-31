
function getEBI(el) {
    return document.getElementById(el)
}

function empty(input) {
    return input.value.trim() === ''
}


function createAccount() {

    const name = getEBI('name').value
    let fullName = name.split(' ')

    if (name === '' || fullName.length < 2) {
        alert('Insira seu nome e sobrenome!')
    }

    localStorage.setItem('name', name)

    const nickname = getEBI('nickname').value

    if (/\d/.test(nickname) && nickname.length >= 4 && nickname.length <= 12) {
        alert('Apelido não pode conter números!')
    }

    localStorage.setItem('nickname', nickname)

    const email = getEBI('email').value

    if (email === '' && /.com$/.test(email)) {
        alert('Insira um e-mail válido!')
    }

    const password = getEBI('password').value

    if (password.length < 8 || password.length > 12 || password === "") {
        alert('Senha não preenche os requisitos necessários!')
    }

    const passwordConfirmation = getEBI('password-confirmation').value

    if (passwordConfirmation != password) {
        alert('Senhas não conferem!')
    }

    else {
        alert('Login efetuado com sucesso!')
      }
    
     // Armazenamento de dados no localStorage
      localStorage.setItem('name', name)
      localStorage.setItem('nickname', nickname)
      localStorage.setItem('email', email)
      localStorage.setItem('password', password)
    
    //  Redirecionamento de index.html
      window.location.href = 'index.html'
    
    }