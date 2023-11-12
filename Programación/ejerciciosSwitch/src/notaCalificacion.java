import java.util.Scanner;

public class notaCalificacion {
    public static void main(String[] args) {
        //Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 10 y muestre un mensaje de calificación utilizando una sentencia switch (por ejemplo, "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la nota a calificar (1-10):");

        int nota = input.nextInt();

        switch (nota) {
            case 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;
            case 5, 6:
                System.out.println("Aprobado");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("La nota introducida no es correcta.");

        }
    }
}
