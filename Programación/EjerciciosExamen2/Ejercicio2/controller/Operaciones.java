package controller;

import model.Alumnoo;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Operaciones {
    private ArrayList<Alumnoo> listaAlumnos = new ArrayList<Alumnoo>();

    public void leerFichero() {
        File file = new File("Ejercicio2/resources/alumnos.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] alumnoDato = linea.split(", ");
                listaAlumnos.add(new Alumnoo(alumnoDato[0], alumnoDato[1], alumnoDato[2], (Integer.valueOf(alumnoDato[3]))));
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.err.println("Fallo en la lectura.");
        }
    }

    public void mejorNota() {
        listaAlumnos.sort(new Comparator<Alumnoo>() {
            @Override
            public int compare(Alumnoo o1, Alumnoo o2) {
                if (o1.getMediaObtenida() > o2.getMediaObtenida()) {
                    return -1;
                }
                if (o1.getMediaObtenida() < o2.getMediaObtenida()) {
                    return 1;
                } else {
                    return 0;
                }
            }


        });
        System.out.println("El alumno con la nota media más alta es " + listaAlumnos.get(0).getNombre() + " " + listaAlumnos.get(0).getApellido() + ", con una nota media de " +listaAlumnos.get(0).getMediaObtenida() + "." );

    }
}
