public class Vendedor extends Usuario {
    private String codigoVendedor;
    public Vendedor(int id, String nombre, String email, String codigoVendedor) {
        super(id, nombre, email);
        this.codigoVendedor = codigoVendedor;
    }
    public void registrarVenta(Venta venta) {
        System.out.println("Venta registrada por: " + getNombre());
    }
    public void consultarInventario() {
        System.out.println("Consultando inventario...");
    }
    @Override public void mostrarInformacion() {
        System.out.println("Vendedor: " + getNombre());
        System.out.println("Código: " + codigoVendedor);
        System.out.println("Email: " + getEmail());
    }
}