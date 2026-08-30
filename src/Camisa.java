public final class Camisa extends Prenda {

    private String tipoManga;

    Camisa(String tipoManga, String talla, String color, String codigo, String nombre, double precio, int stock, double descuento) {
        super(talla, color, codigo, nombre, precio, stock, descuento);
        this.tipoManga = tipoManga;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion de la camisa:");
        super.mostrarInformacion();
        System.out.println("Tipo de manga: " + this.tipoManga);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Camisa" +
                "\n Tipo de manga: " + tipoManga;

    }
}
