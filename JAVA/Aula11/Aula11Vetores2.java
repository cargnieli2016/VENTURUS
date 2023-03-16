import java.util.Scanner;

public class Aula11Vetores2 {
    public static void main(String[] args) {
     int i;
     int num[] = new int[4];
        Scanner digite = new Scanner(System.in);
        for (i=0; i < 4; i++) {
            System.out.println("Digite o número da posição " + i + " :");
            num[i] = digite.nextInt();
        }
        int total = num[0] + num[1] + num[2] + num[3];
        System.out.println("A soma dos elementos do vetor é: " + total);
    }
}