package Practico_ProgEstructurada;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int edad = 0;
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        input.close();
        if (edad < 12){
            System.out.println("Niño");
        } else if (edad <= 17) {
            System.out.println("Adolecente");
        } else if (edad <= 59) {
            System.out.println("Adulto");
        }else {
            System.out.println("Adulto Mayor");
        }
    }
}
