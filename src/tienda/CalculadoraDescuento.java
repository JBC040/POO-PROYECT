package tienda;
public final class CalculadoraDescuento {

    private CalculadoraDescuento() {
    }

    public static double calcularDescuento(double precio, double porcentaje) {
        return precio * porcentaje / 100;
    }
}
