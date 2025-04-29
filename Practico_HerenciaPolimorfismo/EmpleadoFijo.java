package EjerciciosJava.Practico_HerenciaPolimorfismo;

public class EmpleadoFijo extends Empleado {
    private double sueldoBasico;

    public EmpleadoFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double getSalario() {
        int aniosTrabajo = 2025 - getAnioIngreso();
        double porcentajeAdicional = 0;

        if (aniosTrabajo >= 2 && aniosTrabajo <= 5) {
            porcentajeAdicional = 0.05; // 5%
        } else if (aniosTrabajo > 5) {
            porcentajeAdicional = 0.10; // 10%
        }

        return sueldoBasico * (1 + porcentajeAdicional);
    }
}
