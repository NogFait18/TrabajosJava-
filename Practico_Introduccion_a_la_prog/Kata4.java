package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class Kata4 {
    public static void main(String[]args){
        Gallina gallina1 = new Gallina(19,2);
        Gallina gallina2 = new Gallina(24,0);
        System.out.println("Gallina 1: ");
        gallina1.mostrarEstado();
        System.out.println("\nGallina 2: ");
        gallina2.mostrarEstado();

        System.out.println("\nPoniendo Huevos...");
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();

        System.out.println("\nGallinas Envejeciendo...");
        gallina1.envejecer();
        gallina2.envejecer();

        System.out.println("\nGallina 1: ");
        gallina1.mostrarEstado();
        System.out.println("\nGallina 2: ");
        gallina2.mostrarEstado();
    }
}
