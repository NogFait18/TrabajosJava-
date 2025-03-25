package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class Kata3 {
    public static void main(String[]args){
        Libro harryPotter = new Libro("Las reliquias de la muerte parte 2","J.K Rowling",2006);
        System.out.println("Modificacion con año erroneo");
        harryPotter.setAnioPublicacion(1899);
        harryPotter.mostrarInfo();

        System.out.println("\nModificacion con año correcto: ");
        harryPotter.setAnioPublicacion(2007);
        harryPotter.mostrarInfo();
    }
}
