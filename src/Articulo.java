public abstract class Articulo {

        private final String codigo;
        private final String nombre;
        private double precio;
        private int stock;
        private double descuento;

        public Articulo(String codigo, String nombre, double precio, int stock, double descuento) {
            this.nombre = nombre;
            this.codigo = codigo;
            setPrecio(precio);
            this.stock = stock;
            this.descuento = descuento;
        }

        public int getStock() {
            return stock;
        }

        public void aumentarStock(int cantidad) {
            stock += cantidad;
        }

        public void disminuirStock(int cantidad) {
            if (cantidad <= stock) {
                stock -= cantidad;
            }
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public String getCodigo() {
            return codigo;
        }

        public double getDescuento() {
            return descuento;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Articulo" +
                "\n Nombre: " + nombre +
                "\n Codigo: " + codigo +
                "\n Precio: " + precio +
                "\n Stock: " + stock +
                "\n Descuento: " + descuento;
        }

        public double calcularPrecioFinal() {
            return precio;
        }

        public abstract void mostrarInformacion();

        public String estaDisponible (int cantidad) {
            if (stock >= cantidad) {
                return "Esta disponible";
            } else {
                return "No esta disponible";
            }
        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Articulo)) {
            return false;
        }

        Articulo articulo = (Articulo) obj;

        return codigo.equals(articulo.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
