Algoritmo "Tres_Lados_Quaisquer"

Var
a, b, c:inteiro
resposta:caractere


Inicio

escreval("Digite o lado A:")
leia(a)

escreval("Digte oi lado B:")
leia(b)

escreval("Digite o lado C:")
leia(c)

se (a <> b) e (b <> c) e (a <> c) entao
resposta <- "Escaleno"

senao
 se (a = b) e (b = c)entao
 resposta <- "Equilátero"
 
 senao
 resposta <- "Isósceles"
 fimse
 fimse
 escreval(resposta)





Fimalgoritmo