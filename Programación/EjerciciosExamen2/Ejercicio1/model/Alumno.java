package model;

public class Alumno {
    private String nombre, apellido, dni;
    private int numeroMatricula, calificacion;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String dni, int numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numeroMatricula = numeroMatricula;
    }

    public Alumno(String nombre, String apellido, String dni, int numeroMatricula, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numeroMatricula = numeroMatricula;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }


    public String mostrarDatos() {
        return "model.Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                ", calificacion=" + calificacion +
                '}';
    }
}
