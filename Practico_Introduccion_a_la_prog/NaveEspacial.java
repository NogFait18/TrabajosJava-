package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class NaveEspacial {
    String nombre;
    int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        if (this.combustible >= 10){
            combustible -= 10;
        }else{
            System.out.println("No se puede despegar si hay menos de 10 unidades de combustible");
        }
    }
    public void avanzar(int distancia){
        if (distancia <= combustible){
            combustible-= distancia;
            System.out.println("La nave avanzo con exito, tiene aun "+combustible+" de combustible");
        }else
            System.out.println("No se puede avanzar, no hay suficiente combustible");
    }
    public void recargarCombustible(int cantidad){
        if (cantidad > 0 && cantidad <= 100){
            combustible+=cantidad;
            System.out.println("La recarga se concreto con exito, tiene "+combustible+" de combustible");
        }
    }
    public void mostrarEstado(){
        System.out.println("Nombre de la Nave: "+nombre+"\nCantidad de Combustible: "+combustible);
    }
}

