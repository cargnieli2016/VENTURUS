import java.util.Scanner;

public class Aula09ValorInicialValorFinal {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        int i = digite.nextInt();

        System.out.println("Digite o valor final: ");
        int f = digite.nextInt();

        do {
            i++;
            System.out.println("Aprendendo Java!");
            System.out.println("O valor é: " + i);
        } while (i != f);

    }
}