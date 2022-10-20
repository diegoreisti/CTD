# DIEGO DA SILVA REIS (diego.silva.reis@gmail.com)
*** Settings ***

Library     SeleniumLibrary
Resource    ./chico.resource

*** Test Case ***
TesteCase1 - Processo de compra de uma camiseta "Vira lata caramelo" no site do Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies
    Pesquisar por "Vira lata caramelo" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 69,99" 1
    Selecionar um tamanho, cor e clicar em comprar
    Clicar em "Ver sacola"
    Validar se a mensagem do cartão fidelidade está sendo exibida
    Clicar em "Fechar pedido"
    Tear Down
TesteCase2 - Processo de compra de uma camiseta " Amarelo é Desespero" no site do Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies 2
    Pesquisar por "Amarelo é desespero" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 69,99" 2
    Selecionar um tamanho, cor e clicar em comprar 2
    Clicar em "Ver sacola" 2
    Validar se a mensagem "Adquira o Chico Rei Prime para desfrutar de frete grátis por 1 ano em todos os pedidos, sem valor mínimo." está sendo exibida
    Clicar em "Fechar pedido" 2
    Tear Down 2
TesteCase3 - Processo de compra de uma camiseta "Erarr é humano" no site do Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies 3
    Pesquisar por "Erarr" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 79,99"
    Selecionar um tamanho, cor e clicar em comprar 3
    Clicar em "Ver sacola" 3
    Validar se a mensagem "De segunda a sexta, das 8h às 20h." está sendo exibida
    Clicar em "Fechar pedido" 3
    Tear Down 3
TesteCase4 - Processo de compra de uma camiseta "Nem Te Vi" no site do Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies 4
    Pesquisar por "Nem Te Vi" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 74,99"
    Selecionar um tamanho, cor e clicar em comprar 4
    Clicar em "Ver sacola" 4
    Validar se a mensagem "Compre parcelado com cartão ou á vista com boleto ou depósito" está sendo exibida
    Clicar em "Fechar pedido" 4
TesteCase5 - Processo de compra de uma camiseta "Alceu Dispor" no site do Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies 5
    Pesquisar por "Alceu Dispor" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 79,99" 5
    Selecionar um tamanho, cor e clicar em comprar 5
    Clicar em "Ver sacola" 5
    Validar se a mensagem "Sua primeira troca na Chico Rei é por nossa conta!" está sendo exibida
    Clicar em "Fechar pedido" 5  
    Tear Down 5


