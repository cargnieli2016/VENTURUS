Algoritmo "Tabuada"

Var
contador, numero, soma:inteiro


Inicio
contador <- 1
escreva("Quer a tabuada de qual número? ")
leia(numero)

repita
soma <- contador * numero
escreval(numero, " X", contador, " =", soma)
contador <- contador + 1
até(contador > 10)


Fimalgoritmo