package EjerciciosJava.Practico_Genericos;

import java.time.LocalDate;
import java.util.*;

public class Kata3 {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(1, LocalDate.of(2024, 5, 1));
        Pedido p2 = new Pedido(2, LocalDate.of(2024, 4, 15));
        Pedido p3 = new Pedido(3, LocalDate.of(2024, 5, 10));

        p1.agregarProducto(new Producto<>(101, "Disco SSD", 500.0));
        p2.agregarProducto(new Producto<>("A20", "RAM 16GB", 300.0));
        p3.agregarProducto(new Producto<>(303, "GPU", 1500.0));

        List<Pedido> pedidos = new ArrayList<>(List.of(p1, p2, p3));

        System.out.println("Ordenados por total:");
        pedidos.sort(null); // usa compareTo
        pedidos.forEach(System.out::println);

        System.out.println("\nOrdenados por fecha:");
        pedidos.sort(new ComparadorPedidosPorFecha());
        pedidos.forEach(System.out::println);
    }
}
