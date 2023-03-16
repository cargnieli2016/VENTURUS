
package aula5exercicio2;

import java.util.Scanner;

/**
 *
 * @author DoniZt
 */
public class Aula5Exercicio2 {

    public static void main(String[] args) {
        int diaMes;
        
        Scanner digite = new Scanner(System.in);
        
        System.out.println("Entre com o dia do mês: ");
        diaMes = digite.nextInt();
        
        String quinzena = (diaMes <=15)? "Primeira Quinzena" : "Segunda Quinzena";
        
        System.out.println(quinzena);
        
        
               
        
    }
    
}
