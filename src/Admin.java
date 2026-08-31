public class Admin extends Usuario implements GestionCatalogo {

    private String codigoAdmin;
    public Admin(int id, String nombre, String email, String codigoAdmin) {
        super(id, nombre, email);
        this.codigoAdmin = codigoAdmin;
    }
    @Override public void cambiarPrecio(Articulo articulo, double nuevoPrecio) {
        articulo.setPrecio(nuevoPrecio);
        System.out.println("Precio editado correctamente.");
    }
    @Override public void eliminarArticulo(Articulo articulo) {
        System.out.println("Artículo eliminado correctamente.");
    }
    @Override public void mostrarInformacion() {
        System.out.println("Administrador: " + getNombre());
        System.out.println("Código: " + codigoAdmin);
        System.out.println("Email: " + getEmail());
    }
}
