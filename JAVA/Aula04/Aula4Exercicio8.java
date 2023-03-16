
package aula4exercicio8;

import java.util.Scanner;

/**
 *
 * @author DoniZt
 */
public class Aula4Exercicio8 {

    public static void main(String[] args) {
        
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o valor A:");
        
        A = entrada.nextDouble();
        
        System.out.println("Entre com o valor B: ");
         B = entrada.nextDouble();
        
        System.out.println("Entre com o valor C: ");
         C = entrada.nextDouble();

         triangulo = A * C / 2.0;
         circulo = 3.14159 * (C * C);
         trapezio = ((A + B) * C) / 2;
         quadrado = B * B;
         retangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
                
        
        
    }
    
}
