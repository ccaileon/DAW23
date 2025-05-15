package model;

public class Alumnoo {
    private String nombre, apellido, correo;
    private int mediaObtenida;

    public Alumnoo() {
    }

    public Alumnoo(String nombre, String apellido, String correo, int mediaObtenida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.mediaObtenida = mediaObtenida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getMediaObtenida() {
        return mediaObtenida;
    }

    public void setMediaObtenida(int mediaObtenida) {
        this.mediaObtenida = mediaObtenida;
    }

    public String mostrarDatos() {
        return "Alumnoo{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", mediaObtenida=" + mediaObtenida +
                '}';
    }
}
