public class Aula15Caneta1 {
    public static void main(String[] args) {

        Aula15Caneta1Exemplo c1 = new Aula15Caneta1Exemplo("Bic", "Vermelho", 0.7f, 100);
        c1.setTampada(false);
        c1.status();
        System.out.println(" ");

        Aula15Caneta1Exemplo c2 = new Aula15Caneta1Exemplo("FaberCastell", "Azul", 0.9f, 90);
        c2.setTampada(true);
        c2.status();
        System.out.println(" ");
    }
}