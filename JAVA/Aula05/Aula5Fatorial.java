
package aula5fatorial;

/**
 *
 * @author CargN
 */
public class Aula5Fatorial {

    public static void main(String[] args) {
        int soma = 1;
        
        for (int i=1; i < 10; i++){
            soma = soma * i;
            
            System.out.println("O fatorial de: " + i + "=" + soma);
        }
        
    }
    
}
