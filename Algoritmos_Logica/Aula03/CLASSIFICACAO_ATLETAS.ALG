Algoritmo "Classificacao_Atletas"

Var
nome, categoria : caractere
idade : inteiro


Inicio
Escreva("Nome do Atleta = ")
leia(nome)

Escreva("Idade do Atleta = ")
leia(idade)

escolha idade
caso 5, 6, 7, 8, 9, 10
categoria <- "Infantil"

caso 11, 12, 13, 14, 15
categoria <- "Juvenil"

caso 16, 17, 18, 19, 20
categoria <- "Junior"

caso 21, 22, 23, 24, 25
categoria <- "Profissional"

outrocaso
categoria <- "INVÁLIDO"
fimescolha

escreva("Categoria é: ", categoria)


Fimalgoritmo