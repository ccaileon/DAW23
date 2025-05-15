package model;

public class Triangulo extends Figura2D{

    int longitud1, longitud2, longitud3;

    public Triangulo(String nombre, int longitud1, int longitud2, int longitud3) {
        super(nombre);
        this.longitud1 = longitud1;
        this.longitud2 = longitud2;
        this.longitud3 = longitud3;
    }

    public int getLongitud1() {
        return longitud1;
    }

    public void setLongitud1(int longitud1) {
        this.longitud1 = longitud1;
    }

    public int getLongitud2() {
        return longitud2;
    }

    public void setLongitud2(int longitud2) {
        this.longitud2 = longitud2;
    }

    public int getLongitud3() {
        return longitud3;
    }

    public void setLongitud3(int longitud3) {
        this.longitud3 = longitud3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "longitud1=" + longitud1 +
                ", longitud2=" + longitud2 +
                ", longitud3=" + longitud3 +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public double calcularPerimetro() {
        return this.longitud1 + this.longitud2 + this.longitud3;
    }
}
