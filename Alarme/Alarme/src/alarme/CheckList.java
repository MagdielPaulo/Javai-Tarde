package alarme;

class CheckList {
    // Template Method design pattern
    public void byTheNumbers() {
        localize();
        isolate();
        identify();
    }

    protected void localize() {
        System.out.println("   Estabelecer um Perimetro");
    }

    protected void isolate() {
        System.out.println("   isolate the grid");
    }

    protected void identify() {
        System.out.println("   Identificar a Fonte");
    }
}