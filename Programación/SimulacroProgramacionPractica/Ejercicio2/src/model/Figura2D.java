package model;

public abstract class Figura2D implements FiguraGeometrica{
    private String nombreFigura;
    private double perimetro;

    public Figura2D() {
    }

    public Figura2D(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public Figura2D(String nombreFigura, double perimetro) {
        this.nombreFigura = nombreFigura;
        this.perimetro = perimetro;


    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
