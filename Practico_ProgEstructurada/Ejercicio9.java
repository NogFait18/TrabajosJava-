package Practico_ProgEstructurada;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double precio_producto,peso_paquete,costoEnvio,precioFinal;
        String zona_envio;

        System.out.println("Ingrese el precio del producto: ");
        precio_producto = input.nextDouble();

        System.out.println("Ingrese el peso del paquete en kg: ");
        peso_paquete = input.nextDouble();

        costoEnvio = calcularCostoEnvio(peso_paquete);

        precioFinal = calcularTotalCompra(precio_producto,costoEnvio);
        input.close();


    }
    public static double calcularCostoEnvio(double peso){
        Scanner input = new Scanner(System.in);
         double precio_nacional=5,precio_internacional=10,resultado = 0;
         String zona_envio,Nacional="Nacional",Internacional="Internacional";

        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        zona_envio = input.nextLine();

        if (Objects.equals(zona_envio, Nacional)) {
            resultado = peso * precio_nacional;
             System.out.println("El costo de envío es: "+resultado);
         } else if (Objects.equals(zona_envio, Internacional)){
            resultado = peso * precio_internacional;
            System.out.println("El costo de envío es: "+resultado);
        }else {
            System.out.println("Esa zona de envio no existe. Tiene que ser (Nacional/Internacional) ");
        }
        return resultado;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double precioFinal=precioProducto+costoEnvio;
        System.out.println("El total a pagar es: "+precioFinal);
        return precioFinal;
    }
}
