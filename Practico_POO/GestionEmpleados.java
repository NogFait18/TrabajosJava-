package EjerciciosJava.Practico_POO;

public class GestionEmpleados {
    public static void main(String[]args){
        Empleado empleado1 = new Empleado("Pepe","Administración");
        Empleado empleado2 = new Empleado("Manolo","Contador",200);
        Empleado empleado3 = new Empleado("Juanito","Programador",500);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        System.out.println("-------------------------------------");
        empleado1.actualizarSalario(10);
        empleado2.actualizarSalarioFijo(200);
        System.out.println("-------------------------------------");


        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        System.out.println("-------------------------------------");
        System.out.println(Empleado.mostrarTotalEmpleados());
        System.out.println("-------------------------------------");
    }
}
