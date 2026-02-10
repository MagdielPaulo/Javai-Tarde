package sobrecargademetodos;

public class Desenho {

    public void mostrar() {
        // metodo sem parametro
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }

    // metodo com um parametro 
    public void mostrar(char simb) {
        for (int i = 0; i < 10; i++) {
            System.out.println(simb);
        }
    }

    // metodos com dois parametros 
    public void mostrar(char simb, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(simb);
        }
    }

    public static void main(String[] args) {
        Desenho d1 = new Desenho();

        d1.mostrar();
        
        d1.mostrar('$');
        
        d1.mostrar('&');

    }

}
