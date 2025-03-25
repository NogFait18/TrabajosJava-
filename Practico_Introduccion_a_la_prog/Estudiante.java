package EjerciciosJava.Practico_Introduccion_a_la_prog;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInfo(){
        System.out.println("Apellido del estudiante: "+apellido+"\n Nombre del estudiante: " + nombre+"\n Curso:"+curso+"\n Calificacion: "+calificacion);
    }

    public void subirCalificacion(double puntos){
        if(calificacion+puntos<=10){
            calificacion+=puntos;
        }else{
            calificacion = 10.0;
        }
    }

    public void bajarCalificacion(double puntos){
        if(calificacion-puntos>=0){
            calificacion-=puntos;
        }else{
            calificacion = 0.0;
        }
    }

}
