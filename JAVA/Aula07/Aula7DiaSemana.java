import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número de 1 a 7");
        int x = entrada.nextInt();

        String dia;

        switch (x) {
            case 1:
                dia = "Segunda";
                break;
            case 2:
                dia = "Terça";
                break;
            case 3:
                dia = "Quarta";
                break;
            case 4:
                dia = "Quinta";
                break;
            case 5:
                dia = "Sexta";
                break;
            case 6:
                dia = "Sábado";
                break;
            default:
                dia = "Valor Inválido";
        }
        System.out.println("Dia da semana: " + dia);

    }
}
