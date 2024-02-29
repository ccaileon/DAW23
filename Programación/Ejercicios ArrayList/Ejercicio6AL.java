import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6AL {
    public static void main(String[] args) {
        //Crea un programa que permita meter una lista de coches, donde cada coche consta de marca (String), modelo (String) y caballos (int). Mete tres coches manualmente.

        ArrayList<HashMap<String, Object>> listaCoches = new ArrayList<>();
        HashMap<String, Object> coche1 = new HashMap<>();
        coche1.put("Marca", "Toyota");
        coche1.put("Modelo", "Corolla");
        coche1.put("Caballos", 150);
        listaCoches.add(coche1);
        HashMap<String, Object> coche2 = new HashMap<>();
        coche2.put("Marca", "Seat");
        coche2.put("Modelo", "Ibiza");
        coche2.put("Caballos", 105);
        listaCoches.add(coche2);
        HashMap<String, Object> coche3 = new HashMap<>();
        coche3.put("Marca", "Renault");
        coche3.put("Modelo", "Megan");
        coche3.put("Caballos", 200);
        listaCoches.add(coche3);

        //System.out.println(listaCoches);
        //System.out.println();//Espacio

        /*6. Modifica el ejercicio anterior para que una vez metodos los coches se listen todos con el siguiente formato: "Modelo: Ford	Marca: Focus CV: 100".
        //System.out.printf("%-15s %-15s %-10s\n", "Marca:", "Modelo:", "Caballos:");
        for (HashMap<String, Object> coche: listaCoches) {
            //System.out.printf("%-15s %-15s %-10s\n", coche.get("Marca"), coche.get("Modelo"), coche.get("Caballos"));
        */

        //7. Modifica el ejercicio anterior para que pida por teclado una marca y muestre por consola todos los coches que sean de la marca introducida.

       /* Scanner input = new Scanner(System.in);
        System.out.println("Introduce la marca que quieras filtrar:");
        String marca = input.next();

        System.out.printf("%-15s %-15s %-10s\n", "Marca:", "Modelo:", "Caballos:");
        for (HashMap<String, Object> coche : listaCoches) {
            if (coche.get("Marca").toString().equalsIgnoreCase(marca)) {
                System.out.printf("%-15s %-15s %-10s\n", coche.get("Marca"), coche.get("Modelo"), coche.get("Caballos"));
            }
*/

        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-- Menú --");
            System.out.println("1. Ver listado de todos los coches.");
            System.out.println("2. Ver listado de coches formateado en columnas.");
            System.out.println("3. Filtrar coches por marca.");
            System.out.println("4. Introducir nuevos datos de coche.");
            System.out.println();
            System.out.println("Introduce el número de la opción deseada:");
            opcion = input.nextInt();


//8. Crea un programa que permita realizar las funcionalidades de los ejercicios 5, 6 y 7 mediante un menú

            switch (opcion) {
                case 1:
                    System.out.println(listaCoches);
                    break;
                case 2:
                    System.out.printf("%-15s %-15s %-10s\n", "Marca:", "Modelo:", "Caballos:");
                    for (HashMap<String, Object> coche : listaCoches) {
                        System.out.printf("%-15s %-15s %-10s\n", coche.get("Marca"), coche.get("Modelo"), coche.get("Caballos"));
                    }
                    break;
                case 3:
                    // Scanner input = new Scanner(System.in);
                    System.out.println("Introduce la marca que quieras filtrar:");
                    String marca = input.next();

                    System.out.printf("%-15s %-15s %-10s\n", "Marca:", "Modelo:", "Caballos:");
                    for (HashMap<String, Object> coche : listaCoches) {
                        if (coche.get("Marca").toString().equalsIgnoreCase(marca)) {
                            System.out.printf("%-15s %-15s %-10s\n", coche.get("Marca"), coche.get("Modelo"), coche.get("Caballos"));
                        }


                    }
                    break;
                case 4:

                    int indexCoche = (listaCoches.size() + 1);

                    HashMap<String, Object> nuevoCoche = new HashMap<>();
                    System.out.println("Introduce la marca del coche:");
                    String marcaCoche = input.next();
                    nuevoCoche.put("Marca", marcaCoche);

                    System.out.println("Introduce el modelo del coche:");
                    String modeloCoche = input.next();
                    nuevoCoche.put("Modelo", modeloCoche);

                    System.out.println("Introduce los caballos del coche:");
                    int caballosCoche = input.nextInt();
                    nuevoCoche.put("Caballos", caballosCoche);

                    listaCoches.add(nuevoCoche);
                    break;


            }
        } while (opcion != 0);
    }


}


