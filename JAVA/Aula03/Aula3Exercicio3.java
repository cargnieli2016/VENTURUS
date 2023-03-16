
package aula3exercicio3;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula3Exercio3 {

    public static void main(String[] args) {
        float base, altura, area;
        
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite a base do Triângulo: ");
        base = entrada.nextFloat();
        
        System.out.println("Digite  a altura do Triângulo: ");
        altura = entrada.nextFloat();
        
        System.out.println();
        
        area = (base * altura) / 2;
        
        System.out.println("Base = " + base);
        System.out.println("Altura = " + altura);
        System.out.println("Área do Triângulo = " + area);
        
        System.out.println();
        
        
        
        
        
        
    }
    
}
