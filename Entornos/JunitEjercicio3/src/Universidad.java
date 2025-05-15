public class Universidad {
    private int numeroAlumnos, precioMatricula, numeroProfesores;

    public Universidad(int numeroAlumnos, int precioMatricula, int numeroProfesores) {
        this.numeroAlumnos = numeroAlumnos;
        this.precioMatricula = precioMatricula;
        this.numeroProfesores = numeroProfesores;
    }

    public Universidad(int numeroAlumnos, int precioMatricula) {
        this.numeroAlumnos = numeroAlumnos;
        this.precioMatricula = precioMatricula;
    }

    public Universidad(int numeroProfesores) {
        this.numeroProfesores = numeroProfesores;
    }

    public int totalMatriculas() {
        return this.numeroAlumnos * this.precioMatricula;
    }

    // Cada profesor cuesta 2000€
    public int totalGasto() {
       return this.numeroProfesores * 2000;
    }
}
