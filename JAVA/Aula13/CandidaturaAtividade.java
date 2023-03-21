public class CandidaturaAtividade {
    public static void main(String[] args) {
        Candidatura candidato1 = new Candidatura();
        candidato1.nomeCandidato = "Donizety Augusto";
        candidato1.vagaDesejada = "Tecnologia";
        candidato1.pretensaoSalarial = 15.200;
        candidato1.status();
        candidato1.testeTecnico();
        System.out.println(" ");

        Candidatura candidato2 = new Candidatura();
        candidato2.nomeCandidato = "Daniel Costa";
        candidato2.vagaDesejada = "Geral";
        candidato2.pretensaoSalarial = 26.250;
        candidato2.status();
        candidato2.testeTecnico();
        System.out.println(" ");
    }
}
