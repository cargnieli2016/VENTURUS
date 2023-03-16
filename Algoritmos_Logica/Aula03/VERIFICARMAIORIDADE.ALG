Algoritmo "VerificarMaioridade"

Var

ano_atual, ano_nasc, idade: inteiro


Inicio

Escreva("Digite o ano atual: ")
leia(ano_atual)

Escreva("Digite o ano de nascimento: ")
leia(ano_nasc)

idade <- ano_atual - ano_nasc

Escreval("Você tem", idade, " anos")
se (idade > 21) entao
Escreval ("Você é maior de idade!!")
senao
Escreval("Você é di menor!!")
fimse


Fimalgoritmo