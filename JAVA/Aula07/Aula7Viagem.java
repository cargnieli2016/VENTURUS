
package aula7viagemaninhada;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula7ViagemAninhada {

    public static void main(String[] args) {
       float saldo;
       Scanner entrada = new Scanner(System.in);
        System.out.println("Qual saldo você tem no momento? \n");
        saldo = entrada.nextFloat();
        
        if (saldo >= 10000) {
            System.out.println("Parabéns! Você pode viajar pela Europa!\n");  
        } else if (saldo >= 4000 || saldo == 9999) {
            System.out.println("Com essa quantia você só pode viajar pelo Brasil!\n");
        } else if (saldo <=3999){
            System.out.println("Fique em casa e descanse nessas férias! Você está duro!\n");
        }
        System.out.println("====== F I N A L   D O   P R O G R A M A ========\n");
    }
    
}
