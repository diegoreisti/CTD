*** Variables ***
${SITE}             https://www.saucedemo.com/
${NAVEGADOR}        Chrome
${CAMPO_USUARIO}    id=user-name
${CAMPO_SENHA}      id=password
${USUARIO}          standard_user  
${SENHA}            secret_sauce
${BOTAO_LOGIN}      id=login-button
${PRODUTO}          css=#item_4_title_link > div
${ADICIONAR}        css=#add-to-cart-sauce-labs-backpack
${CARRINHO}         css=#shopping_cart_container > a
${CHECKOUT}         css=#checkout
${FIRSTNAME}        id=first-name
${LASTNAME}         id=last-name
${ZIPCODE}          id=postal-code
${VNAME}            Diego
${VLNAME}           Reis
${VZIPCODE}         41650195
${BTNCONTINUE}      id=continue
${BTNFINISH}        id=finish


*** Keywords ***

Abrir o site da loja    
    Open Browser    ${SITE}     ${NAVEGADOR}
    Maximize Browser Window

Fazer login
    Input Text      ${CAMPO_USUARIO}    ${USUARIO}
    Input Text      ${CAMPO_SENHA}      ${SENHA}
    Click Element   ${BOTAO_LOGIN}      
    Page Should Contain     Products

Selecionar um produto e adicionar no carrinho
    Click Element   ${PRODUTO}  
    Click Element   ${ADICIONAR}

Abrir o carrinho e clicar em checkout    
    Click Element   ${CARRINHO}  
    Click Element   ${CHECKOUT}

Preencher informações de checkout e continuar   
    Input Text      ${FIRSTNAME}        ${VNAME}
    Input Text      ${LASTNAME}         ${VLNAME} 
    Input Text      ${ZIPCODE}          ${VZIPCODE}
    Click Element   ${BTNCONTINUE}

Finalizar compra
    Click Element   ${BTNFINISH}