public class Conversao {
    public static double IOF = 0.06;
    public static double conversao(double quantidade, double precoDolar) {
        return quantidade * precoDolar * (1.0 + IOF);
    }

}
