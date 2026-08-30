public abstract class Prenda extends Articulo {

    private String talla;
    private String color;

    public Prenda(String talla, String color, String codigo, String nombre, double precio, int stock, double descuento) {
        this.talla = talla;
        this.color = color;
        super(codigo, nombre, precio, stock, descuento);
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Talla de la prenda: " + getTalla());
        System.out.println("Color de la prenda: " + getColor());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Prenda{" +
                "talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
