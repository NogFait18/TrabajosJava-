package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class Kata2 {
    public static  void main(String[]args){
        Mascota perro = new Mascota("Tito","Caniche",5);
        perro.mostrarInfo();
        System.out.println(perro.nombre+" cumplio: "+perro.cumplirAnios()+ " años");
        System.out.println("Info actualizada: ");
        perro.mostrarInfo();
    }
}
