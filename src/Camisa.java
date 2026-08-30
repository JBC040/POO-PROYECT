public class Camisa extends Prenda {

    private String tipoManga;

    Camisa(String tipoManga, String talla, String color, String codigo, String nombre, double precio, int stock, double descuento) {
        this.tipoManga = tipoManga;
        super(talla, color, codigo, nombre, precio, stock, descuento);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion de la camiseta:");
        super.mostrarInformacion();
        System.out.println("Tipo de manga: " + this.tipoManga);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Camisa{" +
                "tipoManga='" + tipoManga + '\'' +
                '}';
    }
}
