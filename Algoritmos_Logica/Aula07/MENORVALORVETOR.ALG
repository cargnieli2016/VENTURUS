Algoritmo "MenorValorVetor"

Var
i, menor: inteiro
valorProduto: vetor[0..4] de inteiro

Inicio
para i de 0 ate 4 faca
escreva("O valor do produto: ")
leia(valorProduto[i])
se valorProduto[i] < valorProduto[menor] entao
menor <- i
fimse
fimpara
escreval("O produto de menor valor é: ", valorProduto[menor])



Fimalgoritmo