package EjerciciosJava.Practico_InterfacesYExcepciones;


interface Notificable {
    void notificar(String mensaje);
}


class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación para " + nombre + " (" + email + "): " + mensaje);
    }
}


class PedidoConNotificacion {
    private Cliente cliente;
    private String estado;

    public PedidoConNotificacion(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("Su pedido ha cambiado de estado a: " + estado);
    }
}


public class Kata1_3 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("María", "maria@correo.com");
        PedidoConNotificacion pedido = new PedidoConNotificacion(cliente);
        pedido.cambiarEstado("Enviado");
        pedido.cambiarEstado("Entregado");
    }
}
