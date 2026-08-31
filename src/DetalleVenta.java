public class DetalleVenta {

    private Articulo articulo;
    private int cantidad;
    private double precioUnitario;

    public DetalleVenta(Articulo articulo, int cantidad)
            throws ProductoNoEncontradoException {

        if (articulo == null) {
            throw new ProductoNoEncontradoException("El producto no fue encontrado");
        }

        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precioUnitario = articulo.getPrecio();
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularSubtotal() {

        double precioFinal = precioUnitario -
                (precioUnitario * articulo.getDescuento() / 100);

        return precioFinal * cantidad;
    }

    @Override
    public String toString() {
        return articulo.getNombre() + " x" + cantidad + " = $" + calcularSubtotal();
    }
}