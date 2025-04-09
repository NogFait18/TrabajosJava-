package EjerciciosJava.Practico_UML_Basico;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets;
    private static int contadorTickets = 0;

    public SistemaSoporte() {
        tickets = new ArrayList<>();
    }

    public TicketSoporte crearTicket(String descripcion, Usuario usuario) {
        contadorTickets++;
        TicketSoporte ticket = new TicketSoporte(contadorTickets, descripcion, usuario);
        tickets.add(ticket);
        return ticket;
    }

    public void asignarTecnico(int idTicket, Tecnico tecnico) {
        for (TicketSoporte t : tickets) {
            if (t.getId() == idTicket) {
                t.asignarTecnico(tecnico.getNombre());
                break;
            }
        }
    }

    public void cerrarTicket(int idTicket) {
        for (TicketSoporte t : tickets) {
            if (t.getId() == idTicket) {
                t.cerrarTicket();
                break;
            }
        }
    }

    public void listarTickets() {
        System.out.println("=== LISTA DE TODOS LOS TICKETS ===");
        for (TicketSoporte t : tickets) {
            System.out.println(t);
            System.out.println("--------------------");
        }
    }

    public void listarPorEstado(String estadoBuscado) {
        System.out.println("=== TICKETS EN ESTADO: " + estadoBuscado.toUpperCase() + " ===");
        for (TicketSoporte t : tickets) {
            if (t.getEstado().equalsIgnoreCase(estadoBuscado)) {
                System.out.println(t);
                System.out.println("--------------------");
            }
        }
    }

    public static int getCantidadTickets() {
        return contadorTickets;
    }
}
