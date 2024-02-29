import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MayorArray {

    //2. (MayorArray) Crea una aplicación que realice lo siguiente:
    //    - pida por pantalla la longitud del array de enteros
    //    - crea el array de enteros con la longitud introducida
    //    - pida al usuario que introduzca todos los datos del array
    //    - saque por pantalla el elemento mayor y el elemento menor
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indica la longitud del array (sólo número entero):");
        int longitud = input.nextInt();
        int[] lista = new int[longitud];
        System.out.println("Introduce los " + longitud + " números:");
        for (int i = 0; i < lista.length ; i++) {
            lista[i] = input.nextInt();
        }
        int min = 1;
        int max = 0;
        for (int i = 0; i < lista.length; i++) {
            if (min > lista[i]) {
                min = lista[i];
            } else if (max < lista[i]) {
                max = lista[i];
            }
        }
        System.out.println("El número más pequeño es: " + min + ". El número más grande es: " + max + ".");


    }
}
