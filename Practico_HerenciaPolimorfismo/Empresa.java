package EjerciciosJava.Practico_HerenciaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public void mostrarSalarios() {
        for (Empleado emp : empleados) {
            System.out.println(emp.nombreCompleto() + " - Salario: $" + emp.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        EmpleadoAComision mejorEmpleado = null;

        for (Empleado emp : empleados) {
            if (emp instanceof EmpleadoAComision) {
                EmpleadoAComision eac = (EmpleadoAComision) emp;

                if (mejorEmpleado == null || eac.getCantClientesCaptados() > mejorEmpleado.getCantClientesCaptados()) {
                    mejorEmpleado = eac;
                }
            }
        }

        return mejorEmpleado;
    }
}
