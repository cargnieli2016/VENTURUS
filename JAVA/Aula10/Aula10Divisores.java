import java.util.Scanner;

public class Aula10Divisores {
    public static void main(String[] args) {
       int N;
        Scanner digite = new Scanner(System.in);

        System.out.println("Digite um número inteiro para saber seus divisores: ");
        N = digite.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }
    }
}