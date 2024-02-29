import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array. Una vez metidos, se deberá mostrar:
        //    - Numero de puntos obtenidos
        //    - Media de puntos obtenidos

        int[] numerosAleatorios = new int[30];
        int aleatorio;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            aleatorio = (int) (Math.random() * 31);
            numerosAleatorios[i] = aleatorio;

        }
        System.out.println("Puntuación total: " + Arrays.stream(numerosAleatorios).sum() + ". Puntuación media: " + Arrays.stream(numerosAleatorios).average().orElse(Double.NaN));
    }
}
