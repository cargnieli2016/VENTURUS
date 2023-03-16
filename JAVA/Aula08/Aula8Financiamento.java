import java.util.Scanner;

public class Aula8Financiamento {
    public static void main(String[] args) {

       float salario, financ;
        Scanner digite = new Scanner(System.in);
        System.out.println("Entre com o valor do salário: ");
        salario = digite.nextFloat();

        System.out.println("Entre com o valor do financiamento: ");
        financ = digite.nextFloat();
        if (financ <= 5 * salario) {
            System.out.println("Financiamento concedido... Obrigado por nos consultar!");
        } else {
            System.out.println("Financiamento NEGADO... Obrigado por nos consultar!");
        }
    }
}