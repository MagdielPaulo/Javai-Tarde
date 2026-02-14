package linkedlist;
import java.util.LinkedList;
public class Linkedlist {


    public static void main(String[] args) {
        LinkedList<String> animais = new LinkedList<>();
        
        animais.add("Cachorro");
        animais.add("Cavalo");
        animais.add("Peixe");
        System.out.println("LinkedList: " + animais);
        
        animais.add(1,"Passaro");
        
        System.out.println("LinkedList: " + animais);
    }

}
