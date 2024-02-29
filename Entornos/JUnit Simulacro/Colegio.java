public class Colegio {
    private String nombreColegio;
    private int numeroAsignaturas, numeroAlumnos;

    public Colegio(String nombreColegio, int numeroAsignaturas, int numeroAlumnos) {
        this.nombreColegio = nombreColegio;
        this.numeroAsignaturas = numeroAsignaturas;
        this.numeroAlumnos = numeroAlumnos;
    }


    public int cantidadCobrada() {
        return (numeroAlumnos * numeroAsignaturas) * 75;
    }
}

