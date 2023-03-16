
package aula4exercicio4;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula4Exercicio4 {

    public static void main(String[] args) {
        double raio, area;
        final double PI = 3.14159;
        
        Scanner digite = new Scanner(System.in);
        
        System.out.println("Entre com o valor do raio: ");
        raio = digite.nextFloat();
        
        
        area = PI * Math.pow(raio, 2);
        
        System.out.printf("O valor da area é %.2f \n", area );
        System.out.printf("O valor da area é %.4f \n", area );
        
        
    }
    
}
