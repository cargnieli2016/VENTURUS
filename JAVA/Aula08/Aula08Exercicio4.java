import java.util.Locale;
import java.util.Scanner;

public class Aula08Exercicio4 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        Locale.setDefault(Locale.US);
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite a nota1: ");
        nota1 = digite.nextFloat();

        System.out.println("Digite a nota2: ");
        nota2 = digite.nextFloat();

        System.out.println("Digite a nota3: ");
        nota3 = digite.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Sua média foi: " + media + " e está Aprovado");
        }
        if (media  < 7 && media >= 5  ) {
            System.out.println("Sua média foi: " + media + " e está em Recuperação");
        }
        if (media < 5) {
            System.out.println("Sua média foi: " + media + " e está REPROVADO!");
        }
    }
}
