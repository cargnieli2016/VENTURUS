
package aula4exercicio3;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula4Exercicio3 {

    public static void main(String[] args) {
       int valor1, valor2, soma;
       
       Scanner digite = new Scanner(System.in);
        System.out.println("Digite o valor1: ");
        valor1 = digite.nextInt();
        
        System.out.println("Digite o valor2");
        valor2 = digite.nextInt();
        
        soma = valor1 + valor2;
        
        System.out.println("SOMA de " + valor1 + "" + " + " +valor2 + " = "+ soma);
        
        
       
           
       
    }
    
}
