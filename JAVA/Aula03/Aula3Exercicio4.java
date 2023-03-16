package aula3exercicio4;

import java.util.Scanner;

/**
 *
 * @author CargN
 */
public class Aula3Exercicio4 {

    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, media;
        String nomeAluno;
        int idade;
        
        Scanner digite = new Scanner(System.in);
        
        System.out.println("Entre com o nome do aluno: ");
        nomeAluno = digite.next();
        
        System.out.println("Entre com a idade do aluno: ");
        idade = digite.nextInt();
        
        System.out.println("Digite a nota do primeiro bimestre: ");
        nota1 = digite.nextFloat();
        
        System.out.println("Digite a nota do segundo bimestre: ");
        nota2 = digite.nextFloat();
        
        System.out.println("Digite a nota do terceiro bimestre: ");
        nota3 = digite.nextFloat();
        
        System.out.println("Digite a nota do quarto bimestre: ");
        nota4 = digite.nextFloat();
        
        media = nota1 + nota2 + nota3 + nota4 / 4;
        
        System.out.println("O aluno: "+ nomeAluno +"" + " com " + idade +"" + "  anos | "  +" nota1: " + nota1 + " | nota2: " + nota2 + " | nota3: "+ nota3 +" | nota4 " + nota4 + " -> sua MÉDIA foi: " + media);
       
        
        
        
        
        
        
    }
    
}
