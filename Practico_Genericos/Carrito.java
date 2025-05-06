package EjerciciosJava.Practico_Genericos;

import java.util.ArrayList;
import java.util.List;

public class Carrito<T extends Producto<?>> {
    private List<T> productos = new ArrayList<>();

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void eliminarProducto(T producto) {
        productos.remove(producto);
    }

    public double obtenerTotal() {
        double total = 0;
        for (T p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        for (T p : productos) {
            System.out.println(p);
        }
    }
}
