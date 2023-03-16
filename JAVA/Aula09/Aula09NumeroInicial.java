import java.util.Scanner;

public class Aula09NumeroInicial {
    public static void main(String[] args) {
        int i, num_inicial, num_final;
        Scanner digite = new Scanner(System.in);

        System.out.println("Digite um número inicial: ");
        num_inicial = digite.nextInt();

        System.out.println("Digite um número final: ");
        num_final = digite.nextInt();

        i = num_inicial;

        while (i <= num_final) {
            System.out.println(i);
            i = i + 2;
        }

        System.out.println("F I M ");
    }
}