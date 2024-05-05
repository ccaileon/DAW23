package model;

public class Circulo extends Figura2D{
    int radio;

    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }



    @Override
    public String toString() {
        return "Circulo{" +
                "nombre='" + nombre + '\'' +
                ", radio=" + radio +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public double calcularPerimetro() {
       return 2*Math.PI*this.radio;
    }
}
