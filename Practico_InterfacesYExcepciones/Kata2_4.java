package EjerciciosJava.Practico_InterfacesYExcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Kata2_4 {
    public static void main(String[] args) {
        String rutaArchivo = "archivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
