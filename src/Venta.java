public class Venta {

    private static int consecutivo = 1;

    private int numeroVenta;
    private String vendedor;
    private TipoPago tipoPago;
    private Cliente cliente;
    private DetalleVenta[] detalles;
    private int cantidadDetalles;
    private double total;

    public Venta(String vendedor) {
        this(vendedor, TipoPago.CONTADO);
    }

    public Venta(String vendedor, TipoPago tipoPago) {
        this.numeroVenta = consecutivo++;
        this.vendedor = vendedor;
        this.tipoPago = tipoPago;
        this.detalles = new DetalleVenta[20];
        this.cantidadDetalles = 0;
        this.total = 0;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarDetalle(Articulo articulo)
            throws StockInsuficienteException, ProductoNoEncontradoException {

        agregarDetalle(articulo, 1);
    }

    public void agregarDetalle(Articulo articulo, int cantidad)
            throws StockInsuficienteException, ProductoNoEncontradoException {

        if (articulo == null) {
            throw new ProductoNoEncontradoException("el producto no ha sido encontrado");
        }

        if (cantidad > articulo.getStock()) {
            throw new StockInsuficienteException(
                    "Stock insuficiente para " + articulo.getNombre());
        }

        DetalleVenta detalle = new DetalleVenta(articulo, cantidad);
        detalles[cantidadDetalles] = detalle;
        cantidadDetalles++;
        articulo.disminuirStock(cantidad);
    }
    public double calcularTotal() {
        total = 0;
        for (int i = 0; i < cantidadDetalles; i++) {
            total += detalles[i].calcularSubtotal();
        }
        return total;
    }
    public void aplicarDescuento() {

        if (tipoPago == TipoPago.CONTADO) {
            aplicarDescuento(5);
        }
    }
    public void aplicarDescuento(double porcentaje) {
        total = total - (total * porcentaje / 100);
    }

    public void verificarCliente()
            throws ClienteRequeridoException {

        if (tipoPago == TipoPago.CREDITO && cliente == null) {
            throw new ClienteRequeridoException();
        }
    }

    public void finalizarVenta()
            throws ClienteRequeridoException {

        verificarCliente();
        calcularTotal();
        aplicarDescuento();
    }

    @Override
    public String toString() {
        String factura = "VENTA #" + numeroVenta + "\n";
        factura += "Vendedor: " + vendedor + "\n";
        factura += "Pago: " + tipoPago + "\n";

        if (cliente != null) {
            factura += cliente + "\n";
        }

        factura += "Productos:\n";

        for (int i = 0; i < cantidadDetalles; i++) {
            factura += detalles[i] + "\n";
        }

        factura += "TOTAL: $" + total;

        return factura;
    }
}