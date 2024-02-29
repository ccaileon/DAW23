import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //7. Crea un programa que pida 10 palabras por consola y las guarde en un array de String. Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
        //    - Ver todas las palabras: mostrarla todas las palabras del array
        //    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
        //    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
        //    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
        //    - Ver palabra con más letras
        //    - Ver palabra con menos letras
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 10 palabras:");
        String[] palabras = new String[10];
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = input.next();
        }

        int opcion;
        do {
            //Opciones Menú
            System.out.println("-- Menú --");
            System.out.println("1. Ver todas las palabras.");
            System.out.println("2. Obtener una palabra al azar.");
            System.out.println("3. Ver número total de letras.");
            System.out.println("4. Ver media de letras entre todas las palabras.");
            System.out.println("5. Ver palabra con más letras.");
            System.out.println("6. Ver palabra con menos letras.");

            System.out.println("Ingrese el número de la opción:");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: //Ver todas las palabras
                    System.out.println(Arrays.toString(palabras));
                    break;
                case 2: //Obtener una palabra al azar
                    System.out.println(palabras[(int) (Math.random() * palabras.length + 1)]);
                    break;
                case 3: //Ver número total de letras
                    int totalLetras = 0;
                    for (int i = 0; i < palabras.length; i++) {
                        totalLetras += palabras[i].length();
                    }
                    System.out.println("El total de letras entre todas las palabras es de: " + totalLetras);
                    break;
                case 4: //Ver media de letras entre todas las palabras
                    totalLetras = 0;
                    for (String palabra : palabras) {
                        totalLetras += palabra.length();
                    }
                    double mediaLetras = (double) totalLetras / palabras.length;
                    System.out.println("La media de letras entre todas las palabras es de: " + mediaLetras);
                    break;
                case 5: //Ver palabra con más letras
                    String palabraMasLarga = "";
                    for (String item : palabras) {
                        if (item.length() > palabraMasLarga.length()) {
                            palabraMasLarga = item;
                        }
                    }
                    System.out.println("La palabra más larga es: " + palabraMasLarga);
                    break;
                case 6: //Ver palabra con menos letras
                    String palabraMasCorta = palabras[0];
                    for (String item : palabras) {
                        if (item.length() < palabraMasCorta.length()) {
                            palabraMasCorta = item;
                        }
                    }
                    System.out.println("La palabra más corta es: " + palabraMasCorta);
                    break;


            }

        } while (opcion != 0);


    }
}


