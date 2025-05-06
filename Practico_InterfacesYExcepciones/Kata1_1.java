package EjerciciosJava.Practico_InterfacesYExcepciones;

import java.util.ArrayList;
import java.util.List;


interface Pagable {
    double calcularTotal();
}


class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularTotal() {
        return precio;
    }
}


class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}


public class Kata1_1 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.agregarProducto(new Producto("Teclado", 1500));
        pedido.agregarProducto(new Producto("Mouse", 800));
        pedido.agregarProducto(new Producto("Monitor", 25000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());
    }
}
