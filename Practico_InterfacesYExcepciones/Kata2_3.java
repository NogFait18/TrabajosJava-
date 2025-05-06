package EjerciciosJava.Practico_InterfacesYExcepciones;


class Calculadora {
    public static int dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
}


public class Kata2_3 {
    public static void main(String[] args) {
        try {
            int resultado = Calculadora.dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error en la división: " + e.getMessage());
        }
    }
}
