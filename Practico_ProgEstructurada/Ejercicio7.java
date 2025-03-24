package Practico_ProgEstructurada;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Ingresa una nota (0-10): ");
            nota = input.nextInt();
            if (nota < 0 || nota >10){
                System.out.println("⚠️ Error: Nota inválida. Ingrese una nota entre 0 y 10");
            }
        }while (nota < 0 || nota > 10);
        input.close();
        System.out.println("✅ Nota guardada correctamente");
    }
}
