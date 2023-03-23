import java.util.Locale;
import java.util.Scanner;

public class Aula15EstoqueAtividade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner digite = new Scanner(System.in);
        Produto p1 = new Produto ();
        System.out.println("DADOS DO PRODUTO");
        System.out.print("Digite o nome: ");
        p1.nome = digite.nextLine();
        System.out.print("Digite o preço: ");
        p1.preco = digite.nextDouble();
        System.out.print("Quantidade em estoque: ");
        p1.quantidade = digite.nextInt();
        System.out.println();
        System.out.println("Dados dos produtos: ");
        p1.status();
        System.out.println();
        System.out.print("Entre com o número de produtos para adicionar ao estoque: ");
        int quantidade = digite.nextInt();
        p1.addProdutos(quantidade);
        System.out.println();
        System.out.println("Dados Atualizados...");
        p1.status();
        System.out.println();
        System.out.println("Entre com o número de produtos para ser removido do estoque: ");
        quantidade = digite.nextInt();
        p1.removeProdutos(quantidade);
        System.out.println();
        System.out.println("Dados Atualizados!");
        p1.status();
        digite.close();
    }
}