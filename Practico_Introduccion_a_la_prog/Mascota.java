package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+"\nEspecie: "+this.especie+"\nEdad: "+this.edad);
    }
    public int cumplirAnios(){
        edad += 1;
        return edad;
    }
}
