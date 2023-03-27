public class Aula15Caneta1Exemplo {
    public String modelo, cor;
    private float ponta;
    protected int carga;
    public boolean tampada;

    public Aula15Caneta1Exemplo(String modelo, String cor, float ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tamanho da ponta: " + this.getPonta());
        System.out.println("% de carga: " + this.getCarga());
        System.out.println("Está tampada?: " + this.isTampada());
    }
    public void escrever() {
        if (tampada == true) {
            System.out.println("Não posso escrever");
        } else {
            System.out.println("Estou escrevendo");
        }

    }
    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
}
