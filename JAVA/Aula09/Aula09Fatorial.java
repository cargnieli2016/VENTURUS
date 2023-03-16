import java.util.Scanner;

public class Aula09Fatorial {
    public static void main(String[] args) {
        int contador, numero, fatorial;
        char resp;

        Scanner digite = new Scanner(System.in);
        do {
        System.out.println("Digite um número: ");
        numero = digite.nextInt();
        contador = numero;
        fatorial = 1;
        do{
            fatorial = fatorial * contador;
            contador = contador - 1;
        } while (contador > 1);
            System.out.println("O fatorial de " + numero + " é igual a " + fatorial);
            System.out.println("Quer continuar? [S/N]");
            resp = digite.next() .charAt(0);
        } while (resp != 'n');

    }
}