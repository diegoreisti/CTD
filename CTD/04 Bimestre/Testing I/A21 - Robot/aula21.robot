*** Settings ***

Library     SeleniumLibrary
Resource    ./aula21.resource

*** Test Case ***
Processo de Compra
    Abrir o site da loja
    Fazer login
    Selecionar um produto e adicionar no carrinho
    Abrir o carrinho e clicar em checkout
    Preencher informações de checkout e continuar
    Finalizar compra