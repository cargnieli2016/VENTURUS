Algoritmo "Media_Aluno"

Var

nota1, nota2, nota3:real
media:real

Inicio
 Escreva("Entre com a nota1: ")
 leia(nota1)
 
 Escreva("Entre com a nota2: ")
 leia(nota2)
 
 Escreva("entre com a nota3: ")
 leia(nota3)
 
  media <- (nota1 + nota2 + nota3) / 3
  
  se(media >=7)entao
  Escreval("Sua média foi de: ", media)
  Escreval("Aprovado!")
  
  senao
  se(media <=5) entao
  Escreval("A sua média foi de: ", media)
  Escreval("Reprovado")
  
  senao
  Escreval("A sua média foi de: ", media)
  Escreval("Em Recuperação!")
  
  fimse
  fimse




Fimalgoritmo