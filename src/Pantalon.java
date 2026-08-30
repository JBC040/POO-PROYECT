public class Pantalon extends Prenda{

    private String tipoCorte;

    public Pantalon (String tipoCorte, String talla, String color, String codigo, String nombre, double precio, int stock, double descuento) {
        this.tipoCorte = tipoCorte;
        super (talla, color, codigo, nombre, precio, stock, descuento);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion de el Pantalon:");
        super.mostrarInformacion();
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pantalon{" +
                "tipoCorte='" + tipoCorte + '\'' +
                '}';
    }
}
