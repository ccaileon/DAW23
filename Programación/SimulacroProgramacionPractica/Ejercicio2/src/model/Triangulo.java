package model;

import java.util.Objects;

public class Triangulo  extends Figura2D{
    private int longitud1, longitud2, longitud3;

    public Triangulo() {
    }

    public Triangulo(int longitud1, int longitud2, int longitud3) {
        this.longitud1 = longitud1;
        this.longitud2 = longitud2;
        this.longitud3 = longitud3;
    }

    public Triangulo(String nombreFigura, int longitud1, int longitud2, int longitud3) {
        super(nombreFigura);
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
    public double calcularPerimetro() {
       setPerimetro(this.longitud1+this.longitud2+this.longitud3);
       return getPerimetro();
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "longitud1=" + longitud1 +
                ", longitud2=" + longitud2 +
                ", longitud3=" + longitud3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return longitud1 == triangulo.longitud1 && longitud2 == triangulo.longitud2 && longitud3 == triangulo.longitud3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitud1, longitud2, longitud3);
    }
}
