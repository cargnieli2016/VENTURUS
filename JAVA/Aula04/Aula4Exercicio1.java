/*
 Crie um algoritmo que lê o nome de um correntista, sua agência e conta. Exiba esses dados na tela.
 */
package aula4exercicio1;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula4Exercicio1 {

    public static void main(String[] args) {
       String nomeCorrentista, agencia, conta;
       
       Scanner digite = new Scanner(System.in);
       
        System.out.println("Entre com o nome do correntista: ");
        nomeCorrentista = digite.next();
        
        System.out.println("Entre com a sua agência: ");
        agencia = digite.next();
        
        System.out.println("Entre com sua conta: ");
        conta = digite.next();
        
        System.out.println("Correntista: " + nomeCorrentista + "" + " | agência: " + agencia + "" + " | conta: " + "" + ">"+ conta + "<");
       
    }
    
}
