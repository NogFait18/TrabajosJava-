package Practico_ProgEstructurada;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[]args) {
        int num, cont_positivo = 0, cont_negativo = 0, cont_ceros = 0;
        Scanner input = new Scanner(System.in);
        int i;
        for (i = 1; i < 11; i++) {
            System.out.println("Ingrese el número " + i + ": ");
            num = input.nextInt();
            if (num > 0) {
                cont_positivo += 1;
            } else if (num < 0) {
                cont_negativo += 1;
            } else {
                cont_ceros += 1;
            }
        }
        input.close();
        System.out.println("Resultados");
        System.out.println("Positivos: " + cont_positivo);
        System.out.println("Negativos: " + cont_negativo);
        System.out.println("Ceros: " + cont_ceros);
    }
}
