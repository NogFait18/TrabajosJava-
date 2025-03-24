package Practico_ProgEstructurada;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double precio_producto, descuento, resultado;
        String categoria;
        System.out.println("Ingrese el precio del producto: ");
        precio_producto = input.nextDouble();

        System.out.println("Ingrese la categoría del producto(A, B o C): ");
        input.nextLine();

        categoria = input.nextLine();
        input.close();

        switch (categoria.toUpperCase()){
            case "A":{
                System.out.println("Descuento aplicado: 10%");
                descuento = precio_producto * 0.10;
                resultado = precio_producto - descuento;
                System.out.println("Precio final: "+resultado);
                break;
            }
            case "B":{
                System.out.println("Descuento aplicado: 15%");
                descuento = precio_producto * 0.15;
                resultado = precio_producto - descuento;
                System.out.println("Precio final: "+resultado);
                break;
            }
            case "C":{
                System.out.println("Descuento aplicado: 20%");
                descuento = precio_producto * 0.20;
                resultado = precio_producto - descuento;
                System.out.println("Precio final: "+resultado);
                break;
            }
            default:{
                System.out.println("Esa opción no existe");
                break;
            }
        }
    }
}
