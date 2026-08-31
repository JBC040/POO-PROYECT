package tienda;
public final class CalculadoraDescuento {

    private CalculadoraDescuento() {
    }

    public static double calcularDescuento(double precio, double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    public static double calcularDescuento(double precio, int porcentaje) {
        return calcularDescuento(precio, (double) porcentaje);
    }
}
