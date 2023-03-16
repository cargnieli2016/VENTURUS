
package Aula7Cinema;

import java.util.Scanner;



/**
 *
 * @author CargN
 */
public class Aula7Cinema {

    public static void main(String[] args) {
       int dinheiro;
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite a quantia que você tem em dinheiro: ");
        dinheiro = entrada.nextInt();
        
        if (dinheiro >= 30) {
            System.out.println("Pode ir ao cinema!");
            
        } else {
            System.out.println("Tá sem grana, fique em casa vendo o Faustão!");
        }
               
       
    }
    
}
