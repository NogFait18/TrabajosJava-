package Practico_ProgEstructurada;

public class Ejercicio12 {
    public static void main(String[] args) {

        double[] precios = {100.50, 200.75, 50.25, 300.40, 150.60};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.print(precio + " ");
        }
        System.out.println();

        int indiceModificar = 1;
        double nuevoPrecio = 220.90;
        precios[indiceModificar] = nuevoPrecio;

        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.print(precio + " ");
        }
    }
}
