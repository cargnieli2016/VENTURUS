import java.util.Scanner;

public class Aula09For2 {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = digite.nextInt();
        for(int i = 1 ; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        digite.close();
    }
}