
package aula5exercicio1;

import java.util.Scanner;

/**
 *
 * @author DoniZt
 */
public class Aula5Exercicio1 {

    public static void main(String[] args) {
        int idade;
        
        String resultado;
        
        Scanner digite = new Scanner(System.in);
        System.out.println("Entre com a idade: ");
        idade = digite.nextInt();
        
        resultado = ((idade >=16 && idade <18) || idade >70)? "Voto opcional" : "Voto obrigatório";
        
        System.out.println(resultado);
        
        
        
        
    }
    
}
