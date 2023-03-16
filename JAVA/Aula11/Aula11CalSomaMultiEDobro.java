import java.util.Scanner;

public class Aula11CalSomaMultiEDobro {
    public static void main(String[] args) {
     int x, y;
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        x = digite.nextInt();
        System.out.println("Digite o segundo número: ");
        y = digite.nextInt();

        imprima("Soma: " + somar(x, y));
        imprima("Multiplicação: " + multiplicar(x, y));
        imprima("Dobro do primeiro número: " + dobro(x));
        imprima("Dobro do segundo número: " + dobro(y));
    }
    public static void imprima(String s) {
        System.out.println(s);
    }
    public static int somar(int a, int b) {
        int soma;
        soma = a + b;
        return soma;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dobro(int a) {
        return somar(a, a);
    }
}