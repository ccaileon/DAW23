public class Colegio {
    private String nombreColegio;
    private int numeroAlumnos, numeroprofesores, numeroAsignaturas;

    public Colegio(String nombreColegio, int numeroAlumnos, int numeroprofesores, int numeroAsignaturas) {
        this.nombreColegio = nombreColegio;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroprofesores = numeroprofesores;
        this.numeroAsignaturas = numeroAsignaturas;
    }

    public int ingresoTotal() {
        return numeroAlumnos*numeroAsignaturas*10;
    }
    public int gastoTotal() {
        return numeroprofesores*20;
    }
}
