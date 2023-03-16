Algoritmo "Positivo_Ou_Negativo"

Var
   numero : inteiro


Inicio

   escreva("Entre com um número: ")
   repita
   leia(numero)
   se(numero = 0) entao
   escreval("Digite um número diferente de zero")
   senao
   se(numero > 0) e (numero mod 2 = 0) entao
   escreval("O numero ", numero, " é positivo e par")
   senao
   se(numero > 0) e (numero mod 2 <> 0) entao
   escreval("O número ", numero, " é positivo e impar")
   senao
   escreval("O número não é positivo")
   fimse
   fimse
   fimse
   ate numero > 0





Fimalgoritmo