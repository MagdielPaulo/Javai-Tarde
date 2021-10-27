package alarme;

class Gates implements AlarmListener {
    public void alarm() {
        System.out.println("Fechar Portões");
    }
}