import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio3AL {
    public static void main(String[] args) {
        //Crea un programa que cree un ArrayList con los nombres de todos los compañeros de clase. Una vez creado, sacará el nombre de uno de los compañeros (aleatorio)

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Juan", "Patricia", "Alfredo", "Carlos", "Antonia", "Paloma", "Lucía", "Federico"));

        int indiceAleatorio = (int) (Math.random() * nombres.size());
        System.out.println("El alumno elegido es: " + nombres.get(indiceAleatorio));

    }
}
