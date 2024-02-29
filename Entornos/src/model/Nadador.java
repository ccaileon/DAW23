package model;

public class Nadador {
    private String nombre, dni, fecha;
    private int dorsal;
    private double puntuacion, dificultad;
    private boolean mayorDeEdad;

    public Nadador(String nombre, String dni, String fecha, int dorsal, double puntuacion, double dificultad) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.dorsal = dorsal;
        this.puntuacion = puntuacion;
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public double getDificultad() {
        return dificultad;
    }

    public void setDificultad(double dificultad) {
        this.dificultad = dificultad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: ");
        System.out.println("D.N.I: ");
        System.out.println("Dorsal: ");
        System.out.println("Fecha Cumpleaños: ");
        System.out.println("Puntuación: ");
        System.out.println("Dificultad: ");
    }

    public double puntuacionFinal() {
        return this.puntuacion * this.dificultad;

    }

    public boolean mayorDeEdad(int edad) {
        return this.mayorDeEdad = (edad >= 18);
    }
}

