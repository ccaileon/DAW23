package model.Multimedia;
import Persona.Persona;

public abstract class ElementoMultimedia {
    private int identificador;
    private double size;
    private String titulo, formato;
    private Persona autor;

    public ElementoMultimedia(){};
    public ElementoMultimedia(int identificador, double size, String titulo, Persona autor, String formato) {
        this.identificador = identificador;
        this.size = size;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
    }

    public void mostrarDatos() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = ");
        autor.mostrarDatos();
        System.out.println("Formato = " + formato);
        System.out.println("Tamaño = " + size);
    }
}
