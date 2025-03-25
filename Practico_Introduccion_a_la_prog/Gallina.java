package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class Gallina {
    int idGallina;
    int edad;
    private int huevosPuestos;
    private static int contadorGallinas = 0;

    public Gallina( int edad, int huevosPuestos) {
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
        this.idGallina = ++contadorGallinas;  // Asigna un ID único y lo incrementa
    }

    public int getIdGallina() {
        return idGallina;
    }
    public void ponerHuevo(){
        huevosPuestos += 1;
    }
    public void envejecer(){
        edad += 1;
    }
    public void mostrarEstado(){
        System.out.println("ID: "+idGallina+"\nEdad: "+edad+"\nHuevos Puestos: "+huevosPuestos);
    }
}
