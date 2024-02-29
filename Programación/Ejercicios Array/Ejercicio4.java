import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        // 4. Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
        //    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
        //    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        String[] encabezado = {"Número:","Al Cuadrado:", "Al Cubo:"};
        System.out.printf("%-10s%-15s%-15s%n", encabezado[0], encabezado[1], encabezado[2]);
        for (int i = 0; i < numero.length ; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * numero[i];
            System.out.printf("%-10d%-15d%-15d%n", numero[i], cuadrado[i], cubo[i]);
        }



       /* System.out.println("Números enteros:" + Arrays.toString(numero));
        System.out.println("Al cuadrado:" + Arrays.toString(cuadrado));
        System.out.println("Al cubo:" + Arrays.toString(cubo)); */

    }
}
