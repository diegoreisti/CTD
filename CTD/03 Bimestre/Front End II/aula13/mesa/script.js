const formulario = document.querySelector('form')
const fullname = document.getElementById('nome');
const btnSubmit = document.querySelector('button')
const hobbies = document.getElementsByName('hobbies');
const nacionalidades = document.getElementsByName('nacionalidade')

formulario.addEventListener('submit', function (e) {

    e.preventDefault();

    validaNome()
    validaNacionalidade()

});


function toggleButton(state) {
    if (state) {
        btnSubmit.removeAttribute('disabled')
    } else {
        btnSubmit.setAttribute('disabled', '')
    }
}

fullname.addEventListener('focusout', function (ev) {
    validaNome()
})



function validaNome() {
    const er = /\d/       /* /[0-9]/ */

    if (fullname.value == "") {
        alert('Nome não pode ser nulo')
    }

    else if (er.test(fullname.value)) {
        alert('Não pode existir números')
    }

    else if (fullname.value.split(" ").length < 2) {
        alert('Nome Deve conter pelo menos duas palavras.')
    }

    else if ((fullname.value.split(" ")[0].length < 2) || (fullname.value.split(" ")[1].length < 2)) {
        alert('Cada nome ou sobrenome deve ter mais de 1 letra.')
    }

    else if (fullname.value.length > 150) {
        alert(`Nome não pode ser maior que 150 caracteres. Atualmente são ${fullname.length}`)
    }

    else toggleButton(true)

}

const countHobbies = () => {
    let count = 0;

    for (let el of hobbies) {
        if (el.checked)
            count++
    }
    return count
}


hobbies.forEach(el => {
    el.addEventListener('change', function () {
        if (countHobbies() > 4) {
            alert('Selecione no máximo 4 hobbies.')
            toggleButton(false)

        }

        else toggleButton(true)

    })
})


nacionalidades.forEach(el => {
    el.addEventListener('change', function () {
        if ((el.id == 'nacionalidadeBrasileira') && (el.checked)) {
            alert('Desculpe, ainda não estamos recrutando magos no Brasil, mas chegaremos em breve');
            toggleButton(false)
        } else toggleButton(true)
    
    })
})


const countNacional = () => {
    let count = 0

    for (let el of nacionalidades) {
        if (el.checked) {
            count++
        }
    }
    return count
}



function validaNacionalidade() {
    if (countNacional() == 0) {
        alert('Selecione a sua nacionalidade!')
        toggleButton(false)
    } else toggleButton(true)
}
