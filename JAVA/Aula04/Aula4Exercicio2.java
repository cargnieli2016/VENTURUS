
package aula4exercicio2;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula4Exercicio2 {

    public static void main(String[] args) {
        int anoAtual, anoNascimento, idade;
        String nome;
        
        
        Scanner digite = new Scanner(System.in);
        
        System.out.println("Entre com seu nome: ");
        nome = digite.next();
        
        System.out.println(nome + " entre com o ano atual: ");
        anoAtual = digite.nextInt();
        
        System.out.println(nome + " entre com o ano de nascimento: ");
        anoNascimento = digite.nextInt();
        
        idade = anoAtual - anoNascimento;
        
        System.out.println(nome + " a sua idade é de " + idade + " anos," + " parabéns!");
        
        
    }
    
}
