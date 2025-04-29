package EjerciciosJava.Practico_HerenciaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        EmpleadoFijo empFijo = new EmpleadoFijo("12345678", "Juan", "Pérez", 2018, 3000);
        EmpleadoAComision empComision1 = new EmpleadoAComision("87654321", "Carlos", "López", 2020, 1500, 20, 100);
        EmpleadoAComision empComision2 = new EmpleadoAComision("23456789", "Ana", "Gómez", 2019, 1500, 25, 100);

        empresa.agregarEmpleado(empFijo);
        empresa.agregarEmpleado(empComision1);
        empresa.agregarEmpleado(empComision2);


        empresa.mostrarSalarios();


        Empleado mejorEmpleado = empresa.empleadoConMasClientes();
        if (mejorEmpleado != null) {
            System.out.println("Empleado con más clientes: " + mejorEmpleado.nombreCompleto());
        } else {
            System.out.println("No hay empleados a comisión.");
        }
    }
}

