package model.Multimedia;
import model.Persona.Persona;
public final class Audio extends ElementoMultimedia {
    private String duracion, soporte;

    public Audio(){}

    public Audio(String duracion, String soporte) {
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public Audio(int identificador, double size, String titulo, Persona autor, String formato, String duracion, String soporte) {
        super(identificador, size, titulo, autor, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("duracion = " + duracion);
        System.out.println("soporte = " + soporte);
    }
}
