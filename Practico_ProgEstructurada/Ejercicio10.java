package Practico_ProgEstructurada;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int stockActual,cantidadVendida,cantidadRecibida,actualizacion;

        System.out.println("Ingrese el stock actual del producto: ");
        stockActual = input.nextInt();

        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = input.nextInt();

        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida = input.nextInt();
        input.close();

        actualizacion = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

    }
    public static int actualizarStock(int stockActual,int cantidadVendida,int cantidadRecibida){
        int stockActualizado;
        stockActualizado = (stockActual-cantidadVendida)+cantidadRecibida;
        System.out.println("El nuevo stock del producto es: "+stockActualizado);
        return stockActualizado;
    }
}
