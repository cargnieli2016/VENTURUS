public class Aula17Exercicio1 {
    public static void main(String[] args) {
        Motor meumotor = new Motor();
        meumotor.gasolina = 10;
        meumotor.Ligar();
        System.out.println("O estado do motor é: " + meumotor.Ligado);

    }
}
