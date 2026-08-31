package tienda;
public class Inventario {

    private Articulo[] articulos;
    private int cantidad;

    public Inventario(int tamaño) {
        articulos = new Articulo[tamaño];
        cantidad = 0;
    }

    public void agregar(Articulo articulo) {

        if (cantidad < articulos.length) {
            articulos[cantidad] = articulo;
            cantidad++;
        } else {
            System.out.println("El inventario está lleno.");
        }
    }

    public Articulo buscar(String codigo) {

        for (int i = 0; i < cantidad; i++) {

            if (articulos[i].getCodigo().equals(codigo)) {
                return articulos[i];
            }
        }

        return null;
    }

    public boolean estaDisponible(String codigo, int cantidadSolicitada) {

        Articulo articulo = buscar(codigo);

        if (articulo != null) {
            return articulo.getStock() >= cantidadSolicitada;
        }

        return false;
    }

    public void mostrarArticulos() {

        System.out.println("===== INVENTARIO =====");

        for (int i = 0; i < cantidad; i++) {
            System.out.println(articulos[i]);
            System.out.println("---------------------");
        }
    }

    public void eliminar(String codigo) {

        for (int i = 0; i < cantidad; i++) {

            if (articulos[i].getCodigo().equals(codigo)) {

                for (int j = i; j < cantidad - 1; j++) {
                    articulos[j] = articulos[j + 1];
                }

                articulos[cantidad - 1] = null;
                cantidad--;

                System.out.println("Artículo eliminado.");
                return;
            }
        }

        System.out.println("Artículo no encontrado.");
    }

    public int getCantidad() {
        return cantidad;
    }
}