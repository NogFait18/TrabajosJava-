package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class Kata5 {
    public static void main(String[]args){
        NaveEspacial nave1 = new NaveEspacial("Apolo 11",50);
        nave1.avanzar(60);
        nave1.recargarCombustible(40);
        nave1.mostrarEstado();
        nave1.avanzar(60);
        nave1.mostrarEstado();
    }
}
