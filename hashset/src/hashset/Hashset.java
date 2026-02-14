package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
