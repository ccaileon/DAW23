import java.util.Arrays;
import java.util.Scanner;

public class PosicionesArray {
    public static void main(String[] args) {
        //4. (PosicionesArray) Crea una aplicación que:
        //    - pida por teclado la longitud de un array
        //    - cree el array de enteros de la longitud introducida
        //    - pida al usuario que introduzca todos los datos del array
        //    - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
        //    - realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la longitud del array:");
        int longitud = input.nextInt();
        int[] lista = new int[longitud];
        System.out.println("Introduce los " + longitud + " números:");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = input.nextInt();

        }
        //int primerElemento = lista[0];
        int ultimoElemento = lista[lista.length - 1];
        for (int i = lista.length - 1; i > 0; i--) {
            lista[i] = lista[i - 1];
        }
        lista[0] = ultimoElemento;
        System.out.println(Arrays.toString(lista));

        for (int i = 0; i < lista.length - 1; i++) {
            lista[i] = lista[i + 1];
        }
        lista[lista.length - 1] = ultimoElemento;
        System.out.println(Arrays.toString(lista));

    }

}

