package alarme;

class Surveillance extends CheckList implements AlarmListener {
    public void alarm() {
        System.out.println("Vigilancia: ");
        byTheNumbers();
    }

    protected void isolate() {
        System.out.println("   Checar cameras");
    }
}
