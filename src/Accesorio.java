public abstract class Accesorio extends Articulo {

    private String tipoAccesorio;

    public Accesorio (String tipoAccesorio, String codigo, String nombre, double precio, int stock, double descuento) {
        super(codigo, nombre, precio, stock, descuento);
        this.tipoAccesorio = tipoAccesorio;
    }

    public String getTipoAccesorio() {
        return tipoAccesorio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion de el accesorio:");
        System.out.println("tipo de accesorio: " + getTipoAccesorio());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Accesorio" +
                "\n Tipo de accesorio: " + tipoAccesorio;
    }
}
