package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio > 1900 && nuevoAnio <= 2025) {
            this.anioPublicacion = nuevoAnio;
        }  else {
            System.out.println("No se puede modificar si el año es menor a 1900 o mayor al año actual");
        }
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAño de publicación: " + anioPublicacion);
    }
}
