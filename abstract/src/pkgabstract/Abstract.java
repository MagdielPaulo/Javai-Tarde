
package pkgabstract;

public class Abstract {

    public static void main(String[] args) {
        Conta cp = new Poupanca();
        
        cp.setSaldo(5000);
        
        cp.imprimeExtrato();
    }
    
}
