import java.util.Scanner;

public class Aula10Senha {
    public static void main(String[] args) {
     int senha;

        Scanner digite = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        senha = digite.nextInt();

        while (senha != 2023) {
            System.out.println("Senha inválida!");
            senha = digite.nextInt();

            }
        if (senha == 2023) {
            System.out.println("Acesso Permitido...");
        }
    }

    }