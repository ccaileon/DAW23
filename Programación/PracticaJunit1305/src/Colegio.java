public class Colegio {
    private int numeroAlumnos, numeroProfesores;

    public Colegio(int numeroAlumnos, int numeroProfesores) {
        this.numeroAlumnos = numeroAlumnos;
        this.numeroProfesores = numeroProfesores;
    }

    public int totalGanancias(){
        return numeroAlumnos * 500;
    }

    public int totalGasto(){
        return numeroProfesores * 2000;
    }
}
