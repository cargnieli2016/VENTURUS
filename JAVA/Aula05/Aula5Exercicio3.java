
package aula5exercicio3;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula5Exercicio3 {

    public static void main(String[] args) {
        int numeroDias;
        String quinzena;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com o dia do mês: ");
        numeroDias = entrada.nextInt();
        
        quinzena = (numeroDias <=15)? "Primeira Quinzena" : "Segunda Quinzena";
        System.out.println(quinzena);
    }
    
}
