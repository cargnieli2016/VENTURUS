import java.util.Scanner;

public class Aula09Temperatura {
    public static void main(String[] args) {
        double c, f;
        boolean resp = true;
        Scanner digite = new Scanner(System.in);
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            c = digite.nextDouble();
            f = c * 1.8 + 32;
            System.out.println("A temperatura em Fahrenheit é: " + f);
            System.out.println("Deseja fazer outro cálculo? true | false: ");
            resp = digite.nextBoolean();
        } while (resp);
    }
}