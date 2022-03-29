function getEBI(el) {
    return document.getElementById(el)
}

function entrar() {



    const email = getEBI("inputEmail").value;

    const emailNormalizado = email.toLowerCase();

    email.innerHTML = emailNormalizado;

    const senha = getEBI("inputPassword").value;

    if (senha.length >= 8 && senha.length < 12 && /.com$/.test(email)) {

        localStorage.setItem("login", email)



        alert("Login efetuado com sucesso!")

        window.location.href = "tarefas.html"
    }else{
        alert("login não efetuado.")
    }


}