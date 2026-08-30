public final class Pantalon extends Prenda {

    private String tipoCorte;

    public Pantalon (String tipoCorte, String talla, String color, String codigo, String nombre, double precio, int stock, double descuento) {
        super (talla, color, codigo, nombre, precio, stock, descuento);
        this.tipoCorte = tipoCorte;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion de el pantalon:");
        super.mostrarInformacion();
        System.out.println("Tipo de corte: " + this.tipoCorte);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Pantalon" +
                "\n Tipo de corte: " + tipoCorte;
    }
}
