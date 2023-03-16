import java.util.Scanner;

public class Aula8ParImparNegativo {
    public static void main(String[] args) {

        int numero;
        Scanner digite = new Scanner(System.in);
        System.out.println("Entre com um número:");
        numero = digite.nextInt();
        if (numero < 0){
            System.out.println("Número" + numero + " é Negativo!");
        }
        if (numero > 0 && numero % 2 == 0){
                System.out.println("O número " + numero + " é par!");
        }
        if (numero > 0 && numero % 2 != 0){
                    System.out.println("O número " + numero + " é impar!");
        }
            }
        }


