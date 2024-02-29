import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2AL {
    public static void main(String[] args) {
        //Crea un ArrayList de números enteros que guarde valores aleatorios (entre 0 y 100). Una vez introducidos todos calcula la suma, la media, el máximo y el mínimo de esos números.

        ArrayList<Integer> numeros = new ArrayList<>();

        //Añado 20 números ya que el enunciado no da límite de cuántos números hay que generar.
        for (int i = 0; i < 20; i++) {
            numeros.add((int) (Math.random() * 101));
        }
        int suma = sumarArrayList(numeros);
        double media = mediaArrayList(suma, numeros);
        int maximo = Collections.max(numeros);
        int minimo = Collections.min(numeros);

        System.out.println("Números generados: " + numeros);
        System.out.println("La suma de todos los números es: " + suma);
        System.out.println("La media de todos los números es: " + media);
        System.out.println("El número mayor es: " + maximo);
        System.out.println("El número menor es: " + minimo);
    }

    public static int sumarArrayList(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static double mediaArrayList(int suma, ArrayList<Integer> numeros) {
        return (double) suma / numeros.size();
    }

}





