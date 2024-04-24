package controller;

import model.Multimedia.ElementoMultimedia;
import model.Multimedia.Libro;
import model.Multimedia.Video;
import model.Multimedia.Audio;
import model.Persona.Persona;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        Coleccion coleccion = new Coleccion();
        ElementoMultimedia elemento;
        do {

            opcion = input.nextInt();
            int identificador = 0, numeroPaginas;
            double size = 0;
            String titulo = "", autor = "", formato= "", isbn, dni = "", nombre = "", duracion, soporte;

            System.out.println("¿Qué deseas hacer? (indica el número de la opción)");
            opciones();
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("--- Añadir a la colección ---");
                    opciones();
                    break;

                case 2:
                    System.out.println("--- Eliminar de la colección ---");
                    opciones();
                    break;

                case 3:
                    System.out.println("--- Mostrar colección ---");
                    opciones();
                    break;

                case 4:
                    break;
            }


            switch (opcion) {
                case 1: //Libro
                    System.out.println("A continuación, introduce los datos del libro:");
                    datosMultimedia(identificador, size, titulo, nombre, dni, formato);
                    System.out.println("ISBN:");
                    isbn = input.next();
                    System.out.println("Número de páginas:");
                    numeroPaginas = input.nextInt();
                    elemento = new Libro(identificador, size, titulo, new Persona(nombre, dni), formato, isbn, numeroPaginas);
                    coleccion.addElemento(elemento);
                    System.out.println("Libro añadido correctamente a la colección.");
                    break;

                case 2: //Video
                    ArrayList<Persona> actores = new ArrayList<>();
                    System.out.println("A continuación, introduce los datos del video:");
                    datosMultimedia(identificador, size, titulo, nombre, dni, formato);
                    System.out.println("Director:");
                    String nombreDirector = input.next();
                    System.out.println("Dni Director:");
                    String dniDirector = input.next();
                    System.out.println("Número de actores:");
                    int numeroActores = input.nextInt();
                    for (int i = 1; i <= numeroActores; i++) {
                        System.out.println("Introduce los datos del actor número " + i);
                        System.out.println("Dni:");
                        String dniActor = input.next();
                        System.out.println("Nombre:");
                        String nombreActor = input.next();
                        Persona nuevoActor = new Persona(dni, nombre);
                        actores.add(nuevoActor);

                    }
                    elemento = new Video(identificador, size, titulo, new Persona(nombre, dni), formato, new Persona(dniDirector, nombreDirector), actores);
                    coleccion.addElemento(elemento);
                    System.out.println("Video añadido correctamente a la colección.");
                    break;

                case 3: //Audio
//                    System.out.println();
//                    System.out.println("A continuación, introduce los datos del audio:");
//                    datosMultimedia(identificador, size, titulo, nombre, dni, formato);
//                    System.out.println("Duración:");
//                    duracion = input.next();
//                    System.out.println("Soporte:");
//                    soporte = input.next();
//                    elemento = new Audio(identificador, size, titulo, new Persona(nombre, dni), formato, duracion, soporte);
//                    coleccion.addElemento(elemento);
                 System.out.println("Audio añadido correctamente a la colección.");
//                    break;

                case 4: //Salir
                    break;
            }
        } while (opcion != 4);

    }

    public static void opciones() {
        System.out.println("Opción 1: Libro");
        System.out.println("Opción 2: Video");
        System.out.println("Opción 3: Audio");
        System.out.println("Opción 4: Salir");
    }

    public static void datosMultimedia(int identificador, double size, String titulo, String nombre, String dni, String formato) {
        System.out.println("Identificador:");
        Scanner input = new Scanner(System.in);
        identificador = input.nextInt();
        System.out.println("Tamaño:");
        size = input.nextDouble();
        System.out.println("Titulo:");
        titulo = input.next();
        System.out.println("Nombre autor:");
        nombre = input.next();
        System.out.println("Dni autor:");
        dni = input.next();
        System.out.println("Formato:");
        formato = input.next();
    }
}
