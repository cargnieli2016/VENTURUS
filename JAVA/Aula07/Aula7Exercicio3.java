package aula7exercicio3;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula7Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o nome do atleta: ");
        String nome = sc.next();

        System.out.println("Entre com a idade: ");
        int idade = sc.nextInt();
        String resultado;

        switch (idade) {
            case 5, 6, 7, 8, 9, 10:
                resultado = "Infantil";
                break;

            case 11, 12, 13, 14, 15:
                resultado = "Juvenil";
                break;

            case 16, 17, 18, 19, 20:
                resultado = "Junior";
                break;

            case 21, 22, 23, 24, 25:
                resultado = "Profissional";
                break;
            default:
                resultado = "Valor inválido";
                break;
        }
        System.out.println("A Categoria do " + nome + " é "+ resultado + ".");

    }
}
