*** Variables ***
${SITE}             https://chicorei.com/
${NAVEGADOR}        Chrome
${BTN_POLICY}       id=confirmPolicyButton
${SEARCH}           id=header-search-input-desktop
${ESCOLHEITEM}      css=#header-search-desktop > form > div > div > div > div:nth-child(1) > div > div.search-result-thumb.flex-child-fixed > img
${CARAMELOPRICE}    css=#product-main-right > div:nth-child(1) > div.product-price.text-yanone > div > p.h2.text-accent.mx-0.my-0.mr.flex-child-fixed.text-bold
${WSCROLL}          window.scroll(0, 300)
${CARAMELOSIZE}     xpath=//*[@id="product-variations"]/div[1]/div/div[3]/nav/div[2]
${CARAMELOCOR}      xpath=//*[@id="product-variations"]/div[1]/div/div[4]/nav/div[1]/div[1]
${BTNCOMPRAR}       xpath=//*[@id="product-buy-button-container"]/button
${SACOLA}           xpath=//*[@id="header-cart-popover"]/div/div[3]/a
${TXTFIDELIDADE}    Você está acumulando 1 ponto no cartão fidelidade
${BTNFECHARPEDIDO}  css=#cart-finish > button.btn.btn-xl.btn-wide.mt.hidden-xs-down
${DESPERSIZE}       xpath=//*[@id="product-variations"]/div[1]/div/div[3]/nav/div[3]
${DESPERCOR}        xpath=//*[@id="product-variations"]/div[1]/div/div[4]/nav/div[3]/div
${TXTFUNCIONAME}    De segunda a sexta, das 8h às 18h
${TXTFORMACOMPR}    Compre parcelado com cartão ou á vista com boleto ou depósito
${TXTPRIMETROCA}    Sua primeira troca na Chico Rei é por nossa conta

*** Keywords ***
Clicar em "Concordar" no aviso sobre Cookies
    Open Browser    ${SITE}    ${NAVEGADOR}
    Maximize Browser Window
    Click Element   ${BTN_POLICY}
    Sleep           1s
Pesquisar por "Vira lata caramelo" e selecionar a primeira opção da lista de resultados
    Input Text      ${SEARCH}   Vira lata caramelo
    Sleep           1s
    Click Element   ${ESCOLHEITEM}
Validar se o valor do produto é "R$ 69,99" 1
    Execute Javascript  ${WSCROLL}
    Element Should Contain  ${CARAMELOPRICE}    74,99
    Execute Javascript  ${WSCROLL}
Selecionar um tamanho, cor e clicar em comprar
    Sleep           1s
    Click Element   ${CARAMELOSIZE}
    Click Element   ${CARAMELOCOR}
    Click Element   ${BTNCOMPRAR}
    Sleep           1s
Clicar em "Ver sacola"
    Click Element   ${SACOLA}
Validar se a mensagem do cartão fidelidade está sendo exibida
    Sleep           1s
    Page Should Contain     ${TXTFIDELIDADE}
Clicar em "Fechar pedido"
    Sleep           1s
    Click Element   ${BTNFECHARPEDIDO}
Tear Down
    Close All Browsers
Clicar em "Concordar" no aviso sobre Cookies 2
    Open Browser    ${SITE}    ${NAVEGADOR}
    Maximize Browser Window
    Click Element   ${BTN_POLICY}
    Sleep           1s
Pesquisar por "Amarelo é desespero" e selecionar a primeira opção da lista de resultados    
    Input Text      ${SEARCH}   Amarelo é desespero
    Sleep           1s
    Click Element   ${ESCOLHEITEM}
Validar se o valor do produto é "R$ 69,99" 2
    Execute Javascript  ${WSCROLL}
    Element Should Contain  ${CARAMELOPRICE}    74,99    
    Execute Javascript  ${WSCROLL}
Selecionar um tamanho, cor e clicar em comprar 2
    Sleep               1s
    Click Element       ${DESPERSIZE}
    Click Element       ${DESPERCOR}
    Click Element       ${BTNCOMPRAR}
    Sleep               1s
Clicar em "Ver sacola" 2    
    Sleep               0.5s
    Click Element       ${SACOLA}
Validar se a mensagem "Adquira o Chico Rei Prime para desfrutar de frete grátis por 1 ano em todos os pedidos, sem valor mínimo." está sendo exibida
    Sleep                   0.5s
    Page Should Contain     ${TXTFIDELIDADE}
Clicar em "Fechar pedido" 2    
    Sleep           0.5s
    Click Element   ${BTNFECHARPEDIDO}
Tear Down 2
    Close All Browsers
Clicar em "Concordar" no aviso sobre Cookies 3
    Open Browser    ${SITE}    ${NAVEGADOR}
    Maximize Browser Window
    Click Element   ${BTN_POLICY}
    Sleep           1s
Pesquisar por "Erarr" e selecionar a primeira opção da lista de resultados    
    Input Text      ${SEARCH}   Erarr
    Sleep           1s
    Click Element   ${ESCOLHEITEM}
    Sleep           1s
Validar se o valor do produto é "R$ 79,99"
    Execute Javascript  ${WSCROLL}
    Element Should Contain  ${CARAMELOPRICE}    79,99    
Selecionar um tamanho, cor e clicar em comprar 3
    Sleep               1s
    Click Element       ${DESPERSIZE}
    Click Element       ${DESPERCOR}
    Click Element       ${BTNCOMPRAR}
    Sleep               1s
Clicar em "Ver sacola" 3    
    Sleep               0.5s
    Click Element       ${SACOLA}    
Validar se a mensagem "De segunda a sexta, das 8h às 20h." está sendo exibida
    Sleep                   0.5s
    Page Should Contain     ${TXTFUNCIONAME}
Clicar em "Fechar pedido" 3    
    Sleep           0.5s
    Click Element   ${BTNFECHARPEDIDO}
Tear Down 3
    Close All Browsers    
Clicar em "Concordar" no aviso sobre Cookies 4
    Open Browser    ${SITE}    ${NAVEGADOR}
    Maximize Browser Window
    Click Element   ${BTN_POLICY}
    Sleep           1s
Pesquisar por "Nem Te Vi" e selecionar a primeira opção da lista de resultados    
    Input Text      ${SEARCH}   Nem Te Vi
    Sleep           1s
    Click Element   ${ESCOLHEITEM}
    Sleep           1s
Validar se o valor do produto é "R$ 74,99"
    Execute Javascript  ${WSCROLL}
    Element Should Contain  ${CARAMELOPRICE}    74,99    
Selecionar um tamanho, cor e clicar em comprar 4
    Sleep               1s
    Click Element       ${DESPERSIZE}
    Click Element       ${DESPERCOR}
    Click Element       ${BTNCOMPRAR}
    Sleep               1s
Clicar em "Ver sacola" 4    
    Sleep               0.5s
    Click Element       ${SACOLA}
Validar se a mensagem "Compre parcelado com cartão ou á vista com boleto ou depósito" está sendo exibida
    Sleep                   0.5s
    Page Should Contain     ${TXTFORMACOMPR}
Clicar em "Fechar pedido" 4   
    Sleep           0.5s
    Click Element   ${BTNFECHARPEDIDO}
Tear Down 4
    Close All Browsers
Clicar em "Concordar" no aviso sobre Cookies 5
    Open Browser    ${SITE}    ${NAVEGADOR}
    Maximize Browser Window
    Click Element   ${BTN_POLICY}
    Sleep           1s
Pesquisar por "Alceu Dispor" e selecionar a primeira opção da lista de resultados
    Input Text      ${SEARCH}   Alceu Dispor
    Sleep           1s
    Click Element   ${ESCOLHEITEM}
    Sleep           1s
Validar se o valor do produto é "R$ 79,99" 5
    Execute Javascript  ${WSCROLL}
    Element Should Contain  ${CARAMELOPRICE}    79,99    
Selecionar um tamanho, cor e clicar em comprar 5
    Sleep               1s
    Click Element       ${DESPERSIZE}
    Click Element       ${DESPERCOR}
    Click Element       ${BTNCOMPRAR}
    Sleep               1s
Clicar em "Ver sacola" 5   
    Sleep               0.5s
    Click Element       ${SACOLA}
Validar se a mensagem "Sua primeira troca na Chico Rei é por nossa conta!" está sendo exibida    
    Sleep                   0.5s
    Page Should Contain     ${TXTPRIMETROCA}
Clicar em "Fechar pedido" 5   
    Sleep           0.5s
    Click Element   ${BTNFECHARPEDIDO}
Tear Down 5
    Close All Browsers