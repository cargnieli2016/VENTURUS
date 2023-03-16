
package aula5incremento1;

/**
 *
 * @author CargN
 */
public class Aula5Incremento1 {

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a += ++a);
        
        int b = 5;
        System.out.println(b += b++);
    }
    
}
