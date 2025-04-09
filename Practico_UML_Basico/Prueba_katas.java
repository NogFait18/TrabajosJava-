package EjerciciosJava.Practico_UML_Basico;

public class Prueba_katas {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        // Crear usuarios
        Usuario usuario1 = new Usuario(1, "Juan Pérez", "juan@example.com");
        Usuario usuario2 = new Usuario(2, "María López", "maria@example.com");

        // Crear técnicos
        Tecnico tecnico1 = new Tecnico(1, "Carlos Ruiz", "Redes");
        Tecnico tecnico2 = new Tecnico(2, "Lucía Gómez", "Software");

        // Crear tickets
        TicketSoporte ticket1 = sistema.crearTicket("No funciona el correo", usuario1);
        TicketSoporte ticket2 = sistema.crearTicket("Problemas con la red", usuario2);
        TicketSoporte ticket3 = sistema.crearTicket("Error al iniciar el sistema", null); // sin usuario

        // Asignar técnicos
        sistema.asignarTecnico(ticket1.getId(), tecnico1);
        sistema.asignarTecnico(ticket2.getId(), tecnico2);

        // Cerrar un ticket
        sistema.cerrarTicket(ticket1.getId());

        // Listar todos los tickets
        sistema.listarTickets();

        // Listar tickets por estado
        sistema.listarPorEstado("Abierto");
        sistema.listarPorEstado("Cerrado");

        // Mostrar total de tickets
        System.out.println("Total de tickets creados: " + SistemaSoporte.getCantidadTickets());
    }
}

