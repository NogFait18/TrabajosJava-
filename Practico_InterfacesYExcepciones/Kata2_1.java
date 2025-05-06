package EjerciciosJava.Practico_InterfacesYExcepciones;

class UsuarioInvalidoException extends Exception {
    public UsuarioInvalidoException(String mensaje) {
        super(mensaje);
    }
}


class ValidadorUsuario {
    public static void validar(String nombreUsuario, String contraseña) throws UsuarioInvalidoException {
        if (nombreUsuario == null || nombreUsuario.length() < 5) {
            throw new UsuarioInvalidoException("El nombre de usuario debe tener al menos 5 caracteres.");
        }
        if (contraseña == null || contraseña.length() < 8) {
            throw new UsuarioInvalidoException("La contraseña debe tener al menos 8 caracteres.");
        }
    }
}


public class Kata2_1 {
    public static void main(String[] args) {
        try {
            ValidadorUsuario.validar("Juan", "1234567");
        } catch (UsuarioInvalidoException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
    }
}
