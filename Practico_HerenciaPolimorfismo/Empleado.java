package EjerciciosJava.Practico_HerenciaPolimorfismo;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public abstract double getSalario();

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }
}
