Algoritmo "Calcula_Media_Aluno"


Var
nome_aluno: caractere
idade: inteiro
nota1, nota2, nota3, nota4, media: real


Inicio
Escreval("Entre com o nome do aluno: ")
leia(nome_aluno)

Escreval("Entre com a idade do aluno: ")
leia(idade)

Escreval("Entre com a nota do primeiro bimestre: ")
leia(nota1)

Escreval("Entre com a nota do segundo bimestre: ")
leia(nota2)

Escreval("Entre com a notra do terceiro bimestre: ")
leia(nota3)

Escreval("Entre com a nota do quarto bimestre: ")
leia(nota4)

media <- (nota1+nota2+nota3+nota4) /4

Escreval("Aluno: ", nome_aluno)
Escreval("Idade: ", idade)
Escreval("Nota do primeiro bimestre: ", nota1)
Escreval("Nota do segundo bimestre: ", nota2)
Escreval("Nota do terceiro bimestre: ", nota3)
Escreval("Nota do quarto bimestre: ", nota4)
Escreval("A média é: ", media)









Fimalgoritmo