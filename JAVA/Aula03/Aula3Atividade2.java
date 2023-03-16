
package aula3atividade2;

import java.util.Scanner;


public class Aula3Atividade2 {

    
    public static void main(String[] args) {
        Double numero1, numero2, soma, multiplicacao, divisao, subtracao ;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextDouble();
        
        System.out.println("Digite o segundo número:");
        numero2 = entrada.nextDouble();
        
        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;
        
        System.out.println("---- Início dos cálculos-----");
        System.out.println("O primeiro número digitado foi: " + numero1);
        System.out.println("O segundo número digitado foi: " + numero2);
        
        System.out.println("A soma dá o resultado= " + soma);
        System.out.println("A subtração dá o resultado= " + subtracao);
        System.out.println("A multiplicação dá o resultado= " + multiplicacao);
        System.out.println("A divisão dá o resultado= " + divisao);
        System.out.println("----FIM dos cálculos-----");
         
        
        
        
        
    }
    
}
