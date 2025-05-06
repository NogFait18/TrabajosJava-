package EjerciciosJava.Practico_InterfacesYExcepciones;

public class Kata2_2 {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println("Valor: " + numeros[5]);
            int resultado = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        } finally {
            System.out.println("Finalizando el manejo de excepciones.");
        }
    }
}
