import java.util.Scanner;

public class Aula11Exemplo6 {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Entre com 3 números: ");
        int a = digite.nextInt();
        int b = digite.nextInt();
        int c = digite.nextInt();
        if (a > b && a > c) {
            System.out.println("O Maior é: " + a + " | a |");
        } else if (b > c) {
            System.out.println("O maior é: " + b + " | b |");
        } else {
            System.out.println("O maior é: " + c + " | c |");
        }

    }
}