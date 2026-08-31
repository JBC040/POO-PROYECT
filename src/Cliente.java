public class Cliente {

    private String documento;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;

    public Cliente(String documento, String nombre, String telefono, String direccion, String email) {
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public Cliente(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = "";
        this.direccion = "";
        this.email = "";
    }

    public String getDocumento() {
        return documento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEmail() {
        return email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Cliente: " + nombre +
                " Documento: " + documento;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        Cliente otro = (Cliente) obj;
        return documento.equals(otro.documento);
    }

    @Override
    public int hashCode() {
        return documento.hashCode();
    }
}