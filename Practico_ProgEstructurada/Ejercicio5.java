package Practico_ProgEstructurada;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args){
        int num = 1, cont = 0;
        Scanner input = new Scanner(System.in);

        while (num != 0){
            System.out.println("Ingrese  un número (0 para terminar): ");
            num = input.nextInt();
            if (num % 2 == 0){
                cont += num;
            }
        }
        input.close();
        System.out.println("La suma de los números pares es: "+cont);
    }
}
