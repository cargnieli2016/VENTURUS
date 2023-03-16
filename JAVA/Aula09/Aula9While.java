import java.util.Scanner;

public class Aula9While {
    public static void main(String[] args) {

        float numero, total;

        Scanner digite = new Scanner(System.in);
        System.out.println("Para finalizar digite 0");
        System.out.println("Digite um número qualquer: ");
        numero = digite.nextFloat();
        total = 0;
        while (numero != 0) {
            System.out.println("Digite outro número: ");
            numero = digite.nextFloat();
            total  = total + numero;
        }
        System.out.println("A soma total é: " + total);
        digite.close();
    }
}