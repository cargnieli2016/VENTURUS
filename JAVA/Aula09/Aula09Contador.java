import java.util.Scanner;

public class Aula09Contador {
    public static void main(String[] args) {
        int contador, numero, salto;
        contador = 0;

        Scanner digite = new Scanner(System.in);

        System.out.println("Até que número você quer contar? ");
        numero = digite.nextInt();

        System.out.println("Quer contar saltando de quantos em quantos? ");
        salto = digite.nextInt();

        while (contador <= numero) {
            System.out.println(contador);
            contador = contador + salto;
        }
        System.out.println("Terminei de contar...");

    }
}