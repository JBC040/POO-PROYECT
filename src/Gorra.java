public final class Gorra extends Accesorio {

    private String ajuste;

    public Gorra(String ajuste, String tipoAccesorio, String codigo, String nombre, double precio, int stock, double descuento) {
        super(tipoAccesorio, codigo, nombre, precio, stock, descuento);
        this.ajuste = ajuste;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Ajuste de la gorra: " + this.ajuste);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Gorra" +
                "\n Ajuste de gorra: " + ajuste;
    }
}
