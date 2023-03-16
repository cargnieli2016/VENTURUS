import java.util.Scanner;

public class Aula8ParOuImpar {
    public static void main(String[] args) {
        int numero;
        Scanner digite = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        numero = digite.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O número digitado é PAR!");
        } else {
            System.out.println("O número digitado é IMPAR!");
        }


    }
}