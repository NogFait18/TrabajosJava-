package EjerciciosJava.Practico_Genericos;


import java.time.LocalDate;

public class PedidoIdentificable extends Pedido implements Identificable<Integer> {
    public PedidoIdentificable(int id, LocalDate fecha) {
        super(id, fecha);
    }

    @Override
    public Integer getID() {
        return getId();
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return getId() == id;
    }
}
