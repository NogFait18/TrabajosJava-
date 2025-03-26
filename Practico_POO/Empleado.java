package EjerciciosJava.Practico_POO;

public class Empleado {
    int id;
    String nombre;
    String puesto;
    double salario;
    static int totalEmpleados = 0;

    public Empleado(String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
        System.out.println(nombre + ", tu nuevo salario es: " + this.salario);
    }
    public void actualizarSalarioFijo(double cantidadAumentar) {
        this.salario += cantidadAumentar;
        System.out.println(nombre + ", tu nuevo salario es: " + this.salario);
    }

    @Override
    public String toString(){
        return "ID: "+ this.id+"\nNombre: "+this.nombre+"\nPuesto: "+this.puesto+"\nSalario: "+this.salario;
    }

    public static int mostrarTotalEmpleados(){
        System.out.println("El total de empleados creados es: ");
        return totalEmpleados;
    }
}
