
package treeset;
import java.util.TreeSet;
public class Treeset {

   
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        
        numeros.add(8);
        numeros.add(6);
        numeros.add(9);
        
        System.out.println("TreeSet: " + numeros);
        
        boolean result  =  numeros.remove(61);
        System.out.println("Removeu??: " + result);
        
    }
    
}
