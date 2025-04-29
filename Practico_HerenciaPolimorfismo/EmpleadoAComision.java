package EjerciciosJava.Practico_HerenciaPolimorfismo;

public class EmpleadoAComision extends Empleado {
    private double salarioMinimo;
    private int clientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo,
                             int clientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public double getSalario() {
        double salarioCalculado = clientesCaptados * montoPorCliente;
        if (salarioCalculado < salarioMinimo) {
            return salarioMinimo;
        } else {
            return salarioCalculado;
        }
    }

    public int getCantClientesCaptados() {
        return clientesCaptados;
    }
}
