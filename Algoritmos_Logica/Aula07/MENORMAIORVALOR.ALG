Algoritmo "MenorMaiorValor"

Var
i, menor, maior: inteiro
valorProduto: vetor[0..4] de inteiro

Inicio
para i de 0 ate 4 faca
escreva("O valor do produto: ")
leia(valorProduto[i])
se valorProduto[i] > valorProduto[maior] entao
maior <- i
fimse
se valorProduto[i] < valorProduto[menor] entao
menor <- i
fimse
fimpara
escreval("O produto de maior valor é: ", valorProduto[maior])
escreval("O valor de menor valor é: ", valorproduto[menor])



Fimalgoritmo