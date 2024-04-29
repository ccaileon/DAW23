package Colegio;

public class Colegio {
    String nombreColegio;
    int numeroAlumnos, numeroAsignaturas;

    public Colegio(String nombreColegio, int numeroAlumnos, int numeroAsignaturas){
        this.nombreColegio = nombreColegio;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroAsignaturas = numeroAsignaturas;
    }

    public Colegio(int numeroAlumnos, int numeroAsignaturas) {
        this.numeroAlumnos = numeroAlumnos;
        this.numeroAsignaturas = numeroAsignaturas;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroAsignaturas() {
        return numeroAsignaturas;
    }

    public void setNumeroAsignaturas(int numeroAsignaturas) {
        this.numeroAsignaturas = numeroAsignaturas;
    }

    public int cantidadCobrada(){
        return (numeroAlumnos * numeroAsignaturas)*20;
    }
    public int numeroProfesores(){
        return (numeroAlumnos/30);
    }


}
