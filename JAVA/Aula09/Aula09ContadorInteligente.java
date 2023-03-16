import java.util.Scanner;

public class Aula09ContadorInteligente {
    public static void main(String[] args) {
        int inicio, fim, contador;
        Scanner digite = new Scanner(System.in);
        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("----------------------");

        System.out.println("Digite o inicio: ");
        inicio = digite.nextInt();
        System.out.println("Digite o fim: ");
        fim = digite.nextInt();

        System.out.println("--------------------");
        System.out.println(" C O N T A N D O  ");
        System.out.println("----------------------");

        if (fim > inicio) {
            contador = inicio;
            while (contador <= fim) {
                System.out.println(contador + "..");
                contador = contador + 1;
            }
        } else {
            contador = inicio;
            while (contador >= fim) {
                System.out.println(contador + "..");
                contador = contador - 1;
            }
        }



    }
}