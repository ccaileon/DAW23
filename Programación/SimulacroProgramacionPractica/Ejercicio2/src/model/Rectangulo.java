package model;

import java.util.Objects;

public final class Rectangulo extends Figura2D {
    private int longitudBase, longitudAltura;

    public Rectangulo(String nombreFigura, int longitudBase, int longitudAltura) {
        super(nombreFigura);
        this.longitudBase = longitudBase;
        this.longitudAltura = longitudAltura;
    }

    @Override
    public double calcularPerimetro() {
        setPerimetro(this.longitudAltura + this.longitudBase);
        return getPerimetro();
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "longitudBase=" + longitudBase +
                ", longitudAltura=" + longitudAltura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return longitudBase == that.longitudBase && longitudAltura == that.longitudAltura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitudBase, longitudAltura);
    }
}
