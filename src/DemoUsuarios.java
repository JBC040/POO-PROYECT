public class DemoUsuarios {
    public static void main(String[] args) {
        Usuario[] usuarios = new Usuario[4];
        usuarios[0] = new Vendedor(1, "Negro", "negro@gmail.com", "VEN001");
        usuarios[1] = new Admin(2, "Juan", "juan@gmail.com", "ADM001");
        usuarios[2] = new Vendedor(3, "Juanes", "juanes@gmail.com", "VEN002");
        usuarios[3] = new Admin(4, "Londo", "londo@gmail.com", "ADM002");
        for (Usuario usuario : usuarios) {
            usuario.mostrarInformacion();
            System.out.println();
        }
        Usuario usuario = new Admin(5, "maquina", "maquina@gmail.com", "ADM003");
        if (usuario instanceof Admin) {
            Admin administrador = (Admin) usuario;
            administrador.mostrarInformacion();
        }
        Usuario vendedor = new Vendedor(6, "Pedromiguel", "pedromiguel@gmail.com", "VEN003");
        Articulo articulo = null;
        try {
            GestionPermisos.cambiarPrecio(vendedor, articulo, 50000);
        } catch (PermisoDenegado e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("Finalizó el intento de cambiar el precio.");
        }
    }
}