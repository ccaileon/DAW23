import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1AL {
    public static void main(String[] args) {

        // 1. Crea un ArrayList de String y realiza las siguientes acciones
        //- Guarda manualmente 10 palabras
        //- Imprime por pantalla todas las palabras del arraylist
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 10 palabras");
        ArrayList<String> palabras = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            palabras.add(input.next());
        }

        System.out.println("Estas son las palabras introducidas: " + palabras);


    }

}



