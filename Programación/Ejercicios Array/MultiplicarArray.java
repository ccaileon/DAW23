import java.util.Arrays;
import java.util.Scanner;

//1. (MultiplicarArray) Crear un array de 5 posiciones:
//    - se le pedirá al usuario que introduzca cada unos de los elementos del array
//    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
//    - Saca por consola la suma de todos los números
//    - Saca la media de todos los elementos

public class MultiplicarArray {
    public static void main(String[] args) {
        int[] lista = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 5 números enteros:");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = input.nextInt() * 2;
            if (i == 4) {
                System.out.println("La suma de todos los elementos al cuadrado es de: " + Arrays.stream(lista).sum() + ". La media de todos los elementos al cuadrado es de: " + Arrays.stream(lista).sum() / (lista.length));
            }
        }
    }
}
