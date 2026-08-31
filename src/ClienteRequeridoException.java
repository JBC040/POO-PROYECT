public class ClienteRequeridoException extends Exception {
    public ClienteRequeridoException() {
        super("La venta es a crédito y requiere un cliente.");
    }

}