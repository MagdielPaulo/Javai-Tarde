
package randomgame;

import java.util.Random;
import java.util.Scanner;

public class Randomgame {
    public static void main(String[] args) {
        Random gerador = new Random();
        int x = gerador.nextInt(100);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Advinhe o numero que eestou pensando ");
        int numero = entrada.nextInt();
        
        if(numero == x){
          System.out.println("Parbens, vc acertou, eu pensei " + x);
        }
        else{
          System.out.println("Voce erooooouuu, eu pensei no " + x);
        }
    }  
}
