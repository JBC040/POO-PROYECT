public abstract class Articulo {

        private final String codigo;
        private final String nombre;
        private double precio;
        private int stock;
        protected double descuento;

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

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", descuento=" + descuento +
                '}';
        }

        public double calcularPrecioFinal() {
            return precio;
        }

        public abstract void mostrarInformacion();

        public String estaDisponible (int cantidad) {
            if (cantidad > 0) {
                return "Esta disponible";
            } else {
                return "No esta disponible";
            }
        }


}
