package Practico_ProgEstructurada;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double precio_base,porcentaje_impuesto,porcentaje_descuento,PrecioFinal;

        System.out.println("Ingrese el precio base del producto: ");
        precio_base = input.nextDouble();
        System.out.println("Ingrese el porcentaje de impuesto: ");
        porcentaje_impuesto = input.nextDouble() /100;
        System.out.println("Ingrese el porcentaje de descuento: ");
        porcentaje_descuento = input.nextDouble() / 100;

        input.close();

        PrecioFinal=calcularPrecioFinal(precio_base,porcentaje_impuesto,porcentaje_descuento);
        System.out.println("El precio final es: "+PrecioFinal);

    }
    public static double calcularPrecioFinal(double precio_base, double porcentaje_impuesto, double porcentaje_descuento){
        double PrecioFinal;
        PrecioFinal = precio_base + (precio_base * porcentaje_impuesto)-(precio_base * porcentaje_descuento);

        return PrecioFinal;
    }
}
