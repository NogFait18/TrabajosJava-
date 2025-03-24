package Practico_ProgEstructurada;

public class Ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {100.50, 200.75, 50.25, 300.40, 150.60};
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);
        int indiceModificar = 1;
        double nuevoPrecio = 220.90;
        precios[indiceModificar] = nuevoPrecio;
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }

    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.print(precios[indice] + " ");
            mostrarPrecios(precios, indice + 1);
        } else {
            System.out.println();
        }
    }
}
