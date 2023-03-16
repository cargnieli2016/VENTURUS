Algoritmo "Media Harmonica"

Var
nome_aluno: caractere
a, b, c, MH: real



Inicio

Escreva("Entre com o nome do aluno: ")
leia(nome_aluno)

Escreval("Entre com as notas das três provas")
escreva("Digite a primeira nota: ")
leia(a)

escreva("Digite a segunda nota: ")
leia(b)

escreva("Digite a terceira nota: ")
leia(c)

MH <- 3/(1/a + 1/b + 1/c)
Escreval("A media harmonica do aluno: ", nome_aluno, " é ", MH)




Fimalgoritmo