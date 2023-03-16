
package aula4exercicio6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula4Exercicio6 {

    public static void main(String[] args) {
       int ID;
       double horaTrabalhadas, valorPorHora, salario;
       
       Locale.setDefault(Locale.US);
       
      Scanner digite = new Scanner(System.in);
      
        System.out.println("Entre com o ID do funcionário: ");
        ID = digite.nextInt();
        
        System.out.println("Entre com a quantidade de horas trabalhadas: ");
        horaTrabalhadas = digite.nextDouble();
        
        System.out.println("Entre com o valor por hora: ");
        valorPorHora = digite.nextDouble();
        
        salario = horaTrabalhadas * valorPorHora;
        
        System.out.printf("ID funcionário: %d | SALÁRIO = R$ %.2f\n", ID, salario);
    }
    
}
