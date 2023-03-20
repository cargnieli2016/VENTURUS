public class Atividade1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Brasoca";
        carro1.cor = "Branco";
        carro1.velocidade = 40.0;
        carro1.status();
        carro1.frear();
        carro1.acelerar();
        carro1.acenderFarol();
        System.out.println(" ");

        Carro carro2 = new Carro();
        carro2.modelo = "Fusca";
        carro2.cor = "Preto";
        carro2.velocidade = 0.0;
        carro2.status();
        carro2.frear();
        carro2.acelerar();
        carro2.acenderFarol();
        System.out.println(" ");

        Carro carro3 = new Carro();
        carro3.modelo = "Corcel";
        carro3.cor = "Azul";
        carro3.velocidade = 80.0;
        carro3.status();
        carro3.frear();
        carro3.acelerar();
        carro3.acenderFarol();
        System.out.println(" ");
    }
}

