package model;

public class Rectangulo extends Figura2D{

    int longitudBase, longitudAltura;

    public Rectangulo(String nombre, int longitudBase, int longitudAltura) {
        super(nombre);
        this.longitudBase = longitudBase;
        this.longitudAltura = longitudAltura;
    }

    public int getLongitudBase() {
        return longitudBase;
    }

    public void setLongitudBase(int longitudBase) {
        this.longitudBase = longitudBase;
    }

    public int getLongitudAltura() {
        return longitudAltura;
    }

    public void setLongitudAltura(int longitudAltura) {
        this.longitudAltura = longitudAltura;
    }

    @Override
    public double calcularPerimetro() {
        return this.longitudAltura + this.longitudBase;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "longitudBase=" + longitudBase +
                ", longitudAltura=" + longitudAltura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
