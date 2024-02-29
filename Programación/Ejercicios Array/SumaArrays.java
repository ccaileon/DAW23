import java.util.Scanner;

public class SumaArrays {
    public static void main(String[] args) {
        //3. (SumaArrays) Crear una aplicación que:
        //    - pida la longitud de dos arrays de enteros
        //    - crea los array de enteros con las longitudes introducidas
        //    - crea un tercer array de la misma longitud que los dos anteriores
        //    - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la longitud del array (número entero)");
        int longitud = input.nextInt();
        int[] lista = new int[longitud];
        int[] lista1 = new int[longitud];
        int[] lista2 = new int[longitud];
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = lista[i] + lista1[i];

        }
    }
}
