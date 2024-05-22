import model.Colegio;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        int numeroMatricula = 1;
        // Dar de alta los alumnos
        for (int i = 0; i < 4; i++) {
            colegio.darAlta(numeroMatricula);
            System.out.println("Número matrícula: " + numeroMatricula);
            System.out.println("model.Alumno registrado correctamente");
            numeroMatricula++;
        }

        // Calificar a los alumnos
        for (int i = 0; i < colegio.getListaAlumnos().toArray().length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Matricula del alumno a calificar: ");
            colegio.calificarAlumno(input.nextInt());
        }

    }
}
