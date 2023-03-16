
package aula6exercicio5;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula6Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A, B, C;
        
        Scanner digite = new Scanner(System.in);
        
        System.out.println("Digite o lado A: ");
        A = digite.nextInt();
        
        System.out.println("Digite o lado B: ");
        B = digite.nextInt();
        
        System.out.println("Digite o lado C: ");
        C = digite.nextInt();
        
        if( A < B + C && B < A + C && C < A + B ){
            if(A==B && B == C){
                System.out.print("O triângulo é Eqüilátero.\n");
                }else if(A==B || A==C || B==C){
                    System.out.print("O triângulo é Isósceles.\n");
                    }else{
                    System.out.print("O triângulo é Escaleno.\n");
            }
            }else{
            System.out.print("Os lados fornecidos não caracterizam um triângulo\n");
        }
            
            
        }
        
        
        
    }
    
