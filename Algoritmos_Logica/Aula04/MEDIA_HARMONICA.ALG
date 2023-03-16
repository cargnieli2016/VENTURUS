Algoritmo "Media_Harmonica"

Var

 a, b, c, mh, i:real
 nome: caractere

Inicio

i <- 1

repita

escreva("Entre com o nome do aluno: ")
leia(nome)

escreval("Entre com as notas das três provas")

escreva("Digite a primeira nota: ")
leia(a)

escreva("Digite a segunda nota: ")
leia(b)

escreva("Digite a terceira nora: ")
leia(c)

mh <- 3/ (1/a + 1/b + 1/c)

escreval("A média harmônica de: ", nome, " é ", mh:3:20)

i <- i + 1

ate i > 3






Fimalgoritmo