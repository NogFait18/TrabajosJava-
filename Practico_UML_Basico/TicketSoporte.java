package EjerciciosJava.Practico_UML_Basico;
import java.time.LocalDate;

import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnicoAsignado;

    public TicketSoporte(int id, String descripcion) {
        this(id, descripcion, null);
    }

    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
        this.usuario = usuario;
        this.tecnicoAsignado = null;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    public void asignarTecnico(String tecnico) {
        this.tecnicoAsignado = tecnico;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado +
                "\nFecha de creación: " + fechaCreacion +
                "\nUsuario: " + (usuario != null ? usuario.toString() : "Ninguno") +
                "\nTécnico asignado: " + (tecnicoAsignado != null ? tecnicoAsignado : "Sin asignar");
    }
}
