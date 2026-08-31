public class GestionPermisos {
    public static void cambiarPrecio(Usuario usuario, Articulo articulo, double nuevoPrecio) throws PermisoDenegado {
        if (usuario instanceof Admin) {
            Admin administrador = (Admin) usuario;
            administrador.cambiarPrecio(articulo, nuevoPrecio);
        } else {
            throw new PermisoDenegado(
                    "Permiso denegado: el vendedor no puede cambiar precios."
            );
        }
    }
    public static void eliminarArticulo(Usuario usuario, Articulo articulo) throws PermisoDenegado {
        if (usuario instanceof Admin) {
            Admin administrador = (Admin) usuario;
            administrador.eliminarArticulo(articulo);
        } else {
            throw new PermisoDenegado(
                    "Permiso denegado: el vendedor no puede eliminar artículos."
            );
        }
    }
}