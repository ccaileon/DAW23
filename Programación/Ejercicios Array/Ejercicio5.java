import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
//5. Realiza un programa que pida 8 números enteros, los guarde en un array y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 8 números enteros:");
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();

        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + ": par.");
            } else {
                System.out.println(numeros[i] + ": impar.");
            }

        }
        
        
    }
}
