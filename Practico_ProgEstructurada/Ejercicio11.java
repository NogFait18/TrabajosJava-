package Practico_ProgEstructurada;

import java.util.Scanner;

import static Practico_ProgEstructurada.variableGlobal.descuentoEspecial;

class variableGlobal{
    public static double descuentoEspecial = 0.10;
}

public class Ejercicio11 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double precio, precioConDescuento;
        System.out.println("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        input.close();

        precioConDescuento = calcularDescuentoEspecial(precio);
    }
    public static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado;
        descuentoAplicado = precio * descuentoEspecial;
        System.out.println("El descuento especial aplicado es: "+ descuentoAplicado);
        descuentoAplicado = precio - descuentoAplicado;
        System.out.println("El precio final con descuento es: "+descuentoAplicado);
        return descuentoAplicado;
    }

}
