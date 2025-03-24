package Practico_ProgEstructurada;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        num3 = input.nextInt();

        input.close();
        if (num1 > num2 && num1 >num3){
            System.out.println("El numero 1 es mayor: "+num1);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("El numero 3 es mayor: "+num3);
        }else {
            System.out.println("El numero 2 es mayor: "+num2);
        }
    }
}
