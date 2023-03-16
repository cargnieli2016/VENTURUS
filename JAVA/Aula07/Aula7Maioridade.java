import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        int ano_atual, ano_nasc, idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        ano_atual = entrada.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        ano_nasc = entrada.nextInt();

        idade = ano_atual - ano_nasc;
        if (idade >=18) {
            System.out.println("Você possui a MAIORIDADE! PODE IR VOTAR!");
        } else {
            System.out.println("Você NÃO possui a MAIORIDADE! NÃO PODE VOTAR!");
        }

    }
}