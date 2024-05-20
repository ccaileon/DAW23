import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();

        int cantidadNotas = 20;

        while (cantidadNotas != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduzca la nota número " + (notas.size()+1) + ":");
            int nota = input.nextInt();
            if (nota <= 10 && nota >= 0) {
                notas.add(nota);
                cantidadNotas--;
            }
            else {
                System.out.println("La nota introducida no es válida");
            }

        }

        long cantidadAprobados = notas.stream().filter(n -> n >= 5).count();
        long cantidadSuspensos = notas.stream().filter(n -> n < 5).count();
        double mediaNotas = notas.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("Ha introducido todas las notas.");
        System.out.println("La nota más alta obtenida es: " + Collections.max(notas));
        System.out.println("La nota más baja obtenida es: " + Collections.min(notas));
        System.out.println("La cantidad de aprobados es: " + cantidadAprobados);
        System.out.println("La cantidad de suspensos es: " + cantidadSuspensos);
        System.out.println("La nota media es: " + mediaNotas);

    }
}
