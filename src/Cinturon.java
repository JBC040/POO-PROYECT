public final class Cinturon extends Accesorio {

    private String materialHebilla;

     public Cinturon (String materialHebilla, String tipoAccesorio, String codigo, String nombre, double precio, int stock, double descuento) {
         super(tipoAccesorio, codigo, nombre, precio, stock, descuento);
         this.materialHebilla = materialHebilla;
     }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Material de la hebilla: " + materialHebilla);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Cinturon" +
                "\n Material de Hebilla: " + materialHebilla;

    }
}
