import java.util.Scanner;

public class Aula10NumPrimo {
    public static void main(String[] args) {
     int numero, cont;
     numero = 0;
     cont = 0;

        Scanner digite = new Scanner(System.in);
        System.out.print("Digite um número para ver se é primo: ");
        numero = digite.nextInt();

       for (int i = 1; i <= numero; i++) {
           if(numero % i == 0) {
               cont ++;
           }
       }
        if (cont == 2) {
            System.out.println("O número " + numero + " é primo");
        }else {
            System.out.println("O número " + numero + " não é primo");
        }
    }
}