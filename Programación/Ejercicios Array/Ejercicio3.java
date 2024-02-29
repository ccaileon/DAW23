import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
        //    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
        //    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 10 números enteros:");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
        int[] inverso = new int[10];
        for (int i = 0; i < numeros.length ; i++) {
            inverso[i] = numeros[9-i];
        }
        System.out.println(Arrays.toString(inverso));
    }
}
