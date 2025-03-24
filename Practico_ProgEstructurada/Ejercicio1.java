package Practico_ProgEstructurada;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int anio;
        System.out.println("Ingrese un año: ");
        anio = input.nextInt();
        input.close();

        if ((anio % 4 == 0 && anio % 100 !=0) || (anio % 400 == 0)){
            System.out.println("El año "+anio+ " es bisciesto");
        }else{
            System.out.println("No es un año bisciesto");
        }

    }
}
