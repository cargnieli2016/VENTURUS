package aula4exercicio7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula4Exercicio7 {

    public static void main(String[] args) {
        int codPeca01, codPeca02, qtdePeca01, qtdePeca02;

        double valorUnitarioPeca01, valorUnitarioPeca02, valorAPagarPeca01, valorAPagarPeca02, valorTotal;

        Locale.setDefault(Locale.US);
        Scanner entre = new Scanner(System.in);

        System.out.println("Entre com o código da peça 1: ");
        codPeca01 = entre.nextInt();
        System.out.println("Entre com a quantidade de peça 1: ");
        qtdePeca01 = entre.nextInt();
        System.out.println("Entre com o valor unitário da peça 1 : ");
        valorUnitarioPeca01 = entre.nextDouble();

        System.out.println("Entre com o código da peça 2: ");
        codPeca02 = entre.nextInt();
        System.out.println("Entre com a quantidade de peça 2: ");
        qtdePeca02 = entre.nextInt();
        System.out.println("Entre com o valor unitário da peça 2 : ");
        valorUnitarioPeca02 = entre.nextDouble();

        valorAPagarPeca01 = valorUnitarioPeca01 * qtdePeca01;
        valorAPagarPeca02 = valorUnitarioPeca02 * qtdePeca02;
        
        valorTotal = valorAPagarPeca01 + valorAPagarPeca02;

        System.out.printf("VALOR TOTAL A PAGAR: R$%.2f\n", valorTotal);

        

    }
}
