package model.Multimedia;

import java.util.ArrayList;
import model.Persona.Persona;
public final class Video extends ElementoMultimedia {
    Persona director;
    ArrayList<Persona> actores = new ArrayList<>();

    public Video(Persona director, ArrayList<Persona> actores) {
        this.director = director;
        this.actores = actores;
    }

    public Video(int identificador, double size, String titulo, Persona autor, String formato, Persona director, ArrayList<Persona> actores) {
        super(identificador, size, titulo, autor, formato);
        this.director = director;
        this.actores = actores;

    }

    public Persona getDirector() {
        return director;
    }


    public void setDirector(Persona director) {
        this.director = director;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("director = " + director);
        System.out.println("actores = " + actores);
    }
}


