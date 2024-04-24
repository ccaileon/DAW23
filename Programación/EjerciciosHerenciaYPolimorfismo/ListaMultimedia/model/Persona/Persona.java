import model.Persona.Persona;

public final class Persona {
    private String dni, nombre;

    public Persona() {
    }
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

public void mostrarDatos() {
    System.out.println("Nombre = " + nombre);
    System.out.println("Dni = " + dni);
}
}


