*** Variables ***
#Acessar a loja da Jouse 
${SITE}             https://www.jouse.com.br/ 
${NAVEGADOR}        Chrome
#Clicar em Compre agora
${COMPRE_AGORA}     css=.jss43 > div:nth-child(2) > a:nth-child(1)
#Selecionar uma cor e acabamento
${COR}              xpath=//*[@id="__next"]/main/div/div[1]/div[2]/div[1]/div[2]/div  
${ACABAMENTO}       xpath=//*[@id="__next"]/main/div/div[1]/div[2]/div[2]/div[4]/div
#Escolher um modelo, clicar em Selecionar e Confirmar o pedido
${MODELO}
${SELECIONAR}       css=.jss79 > button > span
${CONFIRMAR}        xpath=//*[@id="__next"]/main/div/div/div[3]/div/div[1]/a
#Preencher os dados para entrega e clicar em Continuar
${NOME}             id=component-outlined-Nome 
${NOMEVALUE}        Diego
${SOBRENOME}        id=component-outlined-Sobrenome
${SOBRENOMEVALUE}   Reis    
${CPF}              id=component-outlined-CPF
${CPFVALUE}         01801969523
${EMAIL}            id=component-outlined-E-mail
${EMAILVALUE}       emaildodiego@gmail.com
${TEL}              id=component-outlined-Telefone
${TELVALUE}         71988880000
${CEP}              id=component-outlined-CEP
${CEPVALUE}         41650195
${CIDADE}           id=component-outlined-Cidade
${CIDADEVALUE}      SALVADOR
${ESTADO}           id=component-outlined-Estado
${ESTADOVALUE}      5
${ENDERECO}         id=component-outlined-Endereço
${ENDERECOVALUE}    ENDERECO DO DIEGO   
${NUMERO}           id=component-outlined-Número
${NUMEROVALUE}      0001
${COMPLEMENTO}      id=component-outlined-Complemento
${COMPLEMENTOVALUE}     CASA DO DIEGO
${CONTINUAR}        xpath=//*[@id="__next"]/main/div/div/section[2]/form/div[12]/button/span
#Selecionar uma forma de envio e clicar em Continuar
${ENVIO}  //*[@id="__next"]/main/div/div/section[3]/div[2]/div[2]/div[1]/div 
${CONTINUAR_2}  //*[@id="__next"]/main/div/div/section[3]/div[3]/button
#Selecionar a opção de Cartão de Crédito e preencher os dados
${CARTAO_CREDITO}   //*[@id="__next"]/main/div/div/section[4]/form/div[1]/div[1]/div/div
${CAMPO_NUMERO_CARTAO}  id=component-outlined-Número do cartão
${NUMERO_CARTAO}    5170107530030077
${CAMPO_VALIDADE_CARTAO}    id=component-outlined-Validade
${NUMERO_VALIDADE}      12/2023
${CAMPO_CVV_CARTAO}     id=component-outlined-CVV
${NUMERO_CVV}       548
${CAMPO_NOME_CARTAO}        id=component-outlined-Nome no cartão
${NOME_CARTAO}      Ricardo G Brito
${SETA_PARCELAS_CARTAO}     id=component-outlined-Parcelas
${VALOR_PARCELAS_CARTAO}    2
#Finalizar a compra clicando em Confirmar
${BOTAO_CONFIRMAR}  //*[@id="__next"]/main/div/div/section[4]/div[3]/button


                    
*** Keywords ***
Acessar a loja da Jouse   
    Open Browser    ${SITE}     ${NAVEGADOR}
    Maximize Browser Window

Clicar em Compre agora
    Click Element   ${COMPRE_AGORA}

Selecionar uma cor e acabamento
    Click Element   ${COR}
    Click Element   ${ACABAMENTO}  
    Sleep           2s  

Escolher um modelo, clicar em Selecionar e Confirmar o pedido
    Click Element   ${SELECIONAR} 
    Wait Until Element is Visible   ${CONFIRMAR} 
    Click Element   ${CONFIRMAR} 

Preencher os dados para entrega e clicar em Continuar
    Input Text      ${NOME}         ${NOMEVALUE}
    Input Text      ${SOBRENOME}    ${SOBRENOMEVALUE}
    Input Text      ${CPF}          ${CPFVALUE}
    Input Text      ${EMAIL}        ${EMAILVALUE}
    Input Text      ${TEL}          ${TELVALUE}
    Input Text      ${CEP}          ${CEPVALUE}
    Input Text      ${CIDADE}       ${CIDADEVALUE}
    Select from list by index      ${ESTADO}       ${ESTADOVALUE}
    Input Text      ${ENDERECO}     ${ENDERECOVALUE}
    Input Text      ${NUMERO}       ${NUMEROVALUE}
    Input Text      ${COMPLEMENTO}  ${COMPLEMENTOVALUE}
    Click Element   ${CONTINUAR}

Selecionar uma forma de envio e clicar em Continuar
    Sleep              5s
    Click Element      ${ENVIO}
    Click Element      ${CONTINUAR_2}


Selecionar a opção de Cartão de Crédito e preencher os dados
    Sleep            5s
    Click Element   ${CARTAO_CREDITO}
    Sleep            5s
    Input Text      ${CAMPO_NUMERO_CARTAO}   ${NUMERO_CARTAO}
    Input Text      ${CAMPO_VALIDADE_CARTAO}   ${NUMERO_VALIDADE}
    Input Text      ${CAMPO_CVV_CARTAO}   ${NUMERO_CVV}
    Input Text      ${CAMPO_NOME_CARTAO}   ${NOME_CARTAO}
    Select from list by index   ${SETA_PARCELAS_CARTAO}  ${VALOR_PARCELAS_CARTAO}   
    Sleep           5s

Finalizar a compra clicando em Confirmar
    Click Element   ${BOTAO_CONFIRMAR}
    Sleep           5s
    Close Browser

