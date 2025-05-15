package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public Colegio() {
    }

    public Colegio(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public void listarAlumnos(ArrayList<Alumno> lista) {
        for (Alumno alumno: lista) {
            alumno.mostrarDatos();
        }
    }

    public void darAlta(int numeroMatricula) {
        System.out.println("- - Registrar nuevo alumno - -");
        Scanner input = new Scanner(System.in);
        System.out.printf("Nombre: ");
        String nombre = input.next();
        System.out.printf("Apellido: ");
        String apellido = input.next();
        System.out.printf("DNI: ");
        String dni = input.next();
       listaAlumnos.add(new Alumno(nombre, apellido, dni, numeroMatricula));
    }

    public void calificarAlumno(int numeroMatricula) {
        for (Alumno alumno: listaAlumnos) {
            if (alumno.getNumeroMatricula() == numeroMatricula) {
                Scanner input = new Scanner(System.in);
                System.out.printf("Introduzca la calificación del alumno: ");
                alumno.setCalificacion(input.nextInt());
                System.out.println("model.Alumno calificado correctamente.");
            } else {
                System.out.println("No se ha encontrado al alumno con matrícula " + numeroMatricula);
            }
        }
    }
}
