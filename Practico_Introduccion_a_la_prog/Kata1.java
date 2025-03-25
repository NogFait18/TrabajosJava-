package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class Kata1 {
    public static void main(String[] args){

    Estudiante estudiante1 = new Estudiante("Cinthia","Rigoni","Programación",7.5);
    estudiante1.mostrarInfo();

    estudiante1.subirCalificacion(9);
        System.out.println(estudiante1.getCalificacion());

        estudiante1.bajarCalificacion(4.5);
        System.out.println(estudiante1.getCalificacion());
    }
}

