public class Candidatura {
    String nomeCandidato, vagaDesejada;
    Double pretensaoSalarial;

    void status() {
        System.out.println("Nome do candidato: " + this.nomeCandidato);
        System.out.println("Vaga desejada: " + this.vagaDesejada);
        System.out.println("Pretensão Salarial: " + this.pretensaoSalarial);
    }

    void testeTecnico() {
       if (this.vagaDesejada == "Tecnologia") {
           System.out.println("Enviar teste de Tecnologia!");
       } else {
           System.out.println("Enviar teste Geral!");
       }
    }
}