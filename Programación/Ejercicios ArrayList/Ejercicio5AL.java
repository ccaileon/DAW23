import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio5AL {
    public static void main(String[] args) {
        //Crea un programa que cree un ArrayList de palabras, introduce en él 10 palabras cualquiera. 
        //Muestra el número de letras de todas las palabras, la palabra con más letras y la palabra con menos letra.

        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("Mesa", "Dado", "Cielo", "Lluvia", "Primavera", "Concierto", "Viaje", "Ordenador", "Hoja", "Campo"));

        int totalLetras = 0;
        for (String item : palabras) {
            totalLetras += item.length();

        }
        String palabraMasLarga = "";
        for (String item : palabras) {
            if (item.length() > palabraMasLarga.length()) {
                palabraMasLarga = item;
            }
        }
        String palabraMasCorta = palabraMasLarga;
        for (String item : palabras) {
            if (item.length() < palabraMasCorta.length()) {
                palabraMasCorta = item;
            }
        }

        System.out.println("El número total de letras entre todas las palabras es: " + totalLetras + ". La palabra más corta es '" + palabraMasCorta + "', y la más larga es '" + palabraMasLarga + "'." );
    }
}
