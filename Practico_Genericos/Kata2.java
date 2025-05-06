package EjerciciosJava.Practico_Genericos;

public class Kata2 {
    public static void main(String[] args) {
        Carrito<Producto<?>> carrito = new Carrito<>();
        carrito.agregarProducto(new Producto<>(1, "Monitor", 500.0));
        carrito.agregarProducto(new Producto<>("C-20", "Silla Gamer", 750.0));

        System.out.println("Productos en el carrito:");
        carrito.mostrarProductos();

        System.out.println("Total a pagar: $" + carrito.obtenerTotal());
    }
}

