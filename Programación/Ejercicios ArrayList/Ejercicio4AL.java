import java.util.ArrayList;
import java.util.Objects;

public class Ejercicio4AL {
    public static void main(String[] args) {
        //Crea dos ArrayList de números y guarda de forma aleatoria 20 números sin decimales en cada uno de ellos.
        // Una vez hecho esto comprueba cuantos números de los dos arraylist son iguales (mismo número en la misma posición).
        // Tras hacer la comprobación indica cuantos números han sido iguales

        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numeros1.add((int) (Math.random()*21));
            numeros2.add((int) (Math.random()*21));
        }
int coincide = 0;
        for (int i = 0; i < 20; i++) {
            if (Objects.equals(numeros1.get(i), numeros2.get(i))) {
                coincide++;
            }

        }
        System.out.println("Numero de veces que un número ha coincidido en los dos arrays en la misma posición: " + coincide);
    }
}
