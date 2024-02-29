import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        //2. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30. Una vez hecho esto realizará las siguientes operaciones:
        //    - modificar todos los 6 por 8
        //    - modificar todos los 7 por 15
        //    - modificar todos los 20 por 10
        int valorBuscado1 = 6;
        int valorReemplazo1 = 8;
        int valorBuscado2 = 7;
        int valorReemplazo2 = 15;
        int valorBuscado3 = 20;
        int valorReemplazo3 = 10;

        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*31);
            if (numeros[i] == valorBuscado1) {
                numeros[i] = valorReemplazo1;
        } else if (numeros[i] == valorBuscado2) {
                numeros[i] = valorReemplazo2;
            } else if (numeros[i] == valorBuscado3) {
                numeros[i] = valorReemplazo3;
            }
            }
        System.out.println(Arrays.toString(numeros));
        }
}
