
package pkgabstract;


public class Poupanca extends Conta {
    public void imprimeExtrato(){
        System.out.println("O saldo da conta: " + this.getSaldo());
    }
}
