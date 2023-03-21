import java.util.Locale;
import java.util.Scanner;

public class ConversaoAtividade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner digite = new Scanner(System.in);
        System.out.println("Entre com a cotação do Dolar: ");
        double precoDolar = digite.nextDouble();
        System.out.println("Entre com a quantidade de Dolares a comprar: ");
        double quantidade = digite.nextDouble();
        double resultado = Conversao.conversao(quantidade, precoDolar);
        System.out.printf("A quantidade que vai pagar em Reais = %.2f\n", resultado);
        digite.close();
    }
}