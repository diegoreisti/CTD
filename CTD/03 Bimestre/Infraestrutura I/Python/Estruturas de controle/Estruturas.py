# While
contador = 1
while contador <= 5:
    print("Ola, mundo")
    contador = contador + 1

# for 

for item in [1,3,6,2,5]:
    print(item)

for item in range(5):
    print(item**2)

# if

import math
n = 4

if n<0:
    print("Desculpe, o valor é negativo")    
else:
    print(math.sqrt(n))

#
# Outro teste com if #
# 

pontuacao = 5

if pontuacao>=90:
    print('A')
else:
    if pontuacao>=80:
        print('B')
    else:
        if pontuacao>=70:
            print('C')
        else:
            if pontuacao>=60:
                print('D')
            else: print('F')

# pode ser reescrito com elif
# 

pontuacao = 70

if pontuacao>= 90:
   print('A')
elif pontuacao>= 80:
   print('B')
elif pontuacao>= 70:
   print('C')
elif pontuacao>= 60:
   print('D')
else:
   print('F')            

# Python também tem uma estrutura de seleção unidirecional, a instrução if. Com esta declaração, 
# se a condição for verdadeira, uma ação é executada. Caso a condição seja falsa, o processamento simplesmente continua 
# com a instrução que segue o if. Por exemplo, o trecho a seguir verificará primeiro se o valor de uma variável n é negativo. 
# Se for, então é modificado pela função de valor absoluto. Seja qual for o caso, a próxima ação é calcular a raiz quadrada.
# 

import math
n = -4

if n<0:
   n = abs(n)
print(math.sqrt(n))

##

listaQuadrados=[]
for x in range(1,11):
    listaQuadrados.append(x*x)
    print(listaQuadrados)

## ou

listaQuadrados=[x*x for x in range(1,11)]
print(listaQuadrados)

# ou com critérios de seleção

listaQuadrados=[x*x for x in range(1,11) if x%2!=0]
print(listaQuadrados)

print([letra.upper() for letra in 'estruturas' if letra not in 'aeiou'])


