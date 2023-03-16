
package aula4exercicio5;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula4Exercicio5 {

    public static void main(String[] args) {
        int A, B, C, D, DIFERENCA;
        
        Scanner digite = new Scanner(System.in);
        
        System.out.println("Entre com o valor de A: ");
        A = digite.nextInt();
        
        System.out.println("Entre com o valor de B: ");
        B = digite.nextInt();
        
        System.out.println("Entre com o valor de C: ");
        C = digite.nextInt();
        
        System.out.println("Entre com o valor de D: ");
        D = digite.nextInt();
        
        DIFERENCA = (A * B - C * D);
        
        
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
    
}
