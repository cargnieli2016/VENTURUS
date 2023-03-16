Algoritmo "Calcula area do circulo"

Var

 Area, Raio: real

Inicio

Escreval("Entre com raio do círculo: ")
Leia(Raio)
Se Raio > 0 entao
          Area <- PI*(Raio^2)
          Escreva("A área do círculo e raio", Raio, " é ", Area)
          
senao
          Escreva("Raio não pode ser nulo ou negativo")
fimse


Fimalgoritmo