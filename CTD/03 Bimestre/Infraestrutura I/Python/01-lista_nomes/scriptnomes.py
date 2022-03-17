import fileinput
a = 0
for nome in fileinput.input("D://dev//Digital-House//CTD//03 Bimestre//Infraestrutura I//Python//lista_nomes//lista_nomes.txt"):
    if nome.strip() == "Marcel":
        print ("Encontrei o Marcel")
    else:
        a += 1

print ("Encontrei outros ", a, "nomes")