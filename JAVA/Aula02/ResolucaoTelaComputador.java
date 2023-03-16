
package resolucaotelacomputador;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoTelaComputador {

    
    public static void main(String[] args) {
        Toolkit resolucaoTela = Toolkit.getDefaultToolkit();
        Dimension d = resolucaoTela.getScreenSize();
        System.out.println("Largura: " + d.width);
        System.out.println("Altura: " + d.height);
        
    }
    
}
