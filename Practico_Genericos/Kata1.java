package EjerciciosJava.Practico_Genericos;

import java.util.ArrayList;
import java.util.List;

public class Kata1 {
    public static void main(String[] args) {
        List<Producto<?>> productos = new ArrayList<>();
        productos.add(new Producto<>(101, "Laptop", 1500.0));
        productos.add(new Producto<>("SKU-200", "Teclado", 300.0));
        productos.add(new Producto<>(303, "Mouse", 150.0));

        for (Producto<?> p : productos) {
            System.out.println(p);
        }
    }
}
