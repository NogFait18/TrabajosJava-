package EjerciciosJava.Practico_Genericos;

public interface Identificable<K> {
    K getID();
    boolean tieneMismoID(K id);
}
