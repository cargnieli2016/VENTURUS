import java.util.Scanner;

public class Aula7ClassificacaoAtleta {
    public static void main(String[] args) {
    String nome, categoria;
    int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o nome do atleta: ");
        nome = entrada.nextLine();

        System.out.println("Entre com a idade do atleta: ");
        idade = entrada.nextInt();

        switch (idade) {
            case 5, 6, 7, 8, 9, 10:
                categoria = "Infantil";
                break;
            case 11, 12, 13, 14, 15:
                categoria = "Juvenil";
                break;
            case 16, 17, 18, 19, 20:
                categoria = "Junior";
                break;
            case 21, 22, 23, 24, 25:
                categoria = "Profissional";
                break;
            default:
                categoria = "Inválido";

        }
        System.out.println("O(A) atleta " + nome + " é da " + "Categoria " + categoria + "!");
    }
}