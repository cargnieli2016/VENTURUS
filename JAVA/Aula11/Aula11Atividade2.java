public class Aula11Atividade2 {
    public static void main(String[] args) {
        int matriza[][] = {{1, 2}, {4, 5}};
        int matrizb[][] = {{7, 8}, {10, 11}};

        int matrizsoma[][] = new int[2][2];
        int matrizmulti[][] = new int[2][2];

        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                matrizsoma[i][j] = matriza[i][j] + matrizb[i][j];
            }
        }

        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matrizb[i].length; j++) {
                matrizmulti[i][j] = matriza[i][j] * matrizb[i][j];
            }
        }
        for (int i = 0; i < matrizsoma.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < matrizsoma.length; j++) {
                System.out.println(matrizsoma[i][j] + "\t");
            }
        }
        for (int i = 0; i < matrizmulti.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < matrizmulti.length; j++) {
                System.out.println(matrizmulti[i][j] + "\t");
            }
        }
    }
}