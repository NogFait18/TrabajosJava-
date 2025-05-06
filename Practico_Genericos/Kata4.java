package EjerciciosJava.Practico_Genericos;

import java.time.LocalDate;
import java.util.*;

public class Kata4 {
    public static void main(String[] args) {
        List<PedidoIdentificable> pedidos = new ArrayList<>();
        LocalDate LocalDate = null;
        pedidos.add(new PedidoIdentificable(1, java.time.LocalDate.now()));
        pedidos.add(new PedidoIdentificable(2, java.time.LocalDate.now().minusDays(2)));
        pedidos.add(new PedidoIdentificable(3, java.time.LocalDate.now().plusDays(5)));

        Buscador<PedidoIdentificable, Integer> buscador = new Buscador<>();
        PedidoIdentificable resultado = buscador.buscar(pedidos, 2);

        if (resultado != null) {
            System.out.println("Pedido encontrado: " + resultado);
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }
}
