public class Aula11Atividade1 {
    public static void main(String[] args) {
     int [] vetor = {1, 2, 3, 4};
     int num = 10;

     for (int i = 0; i <vetor.length; i++) {
         num = num + vetor[i];
         System.out.println("Elemento " + i + ": " + num);
     }
    }
}