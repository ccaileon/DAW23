import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Introduce 10 números.");

        for (int i = 0; i < numeros.length; i++) {
            int numeroIntroducido = input.nextInt();
            numeros[i] = numeroIntroducido;

        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(("Index " + i) + ": " + numeros[i]);
        }

    }


}

