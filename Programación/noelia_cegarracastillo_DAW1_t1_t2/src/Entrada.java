import model.Carrera;
import model.Coche;

import java.util.Scanner;

// Trabajo realizado por Noelia Cegarra Castillo (DAW 2023/2024)

public class Entrada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\uD83C\uDFC1¡Bienvenido a la carrera!\uD83C\uDFC1");
        System.out.println("Introduce los datos del primer participante:"); //Mensaje de bienvenida
        String marca, modelo, matricula; //Creamos las variables que almacenan los inputs del usuario
        int cv, cc;
        System.out.println("Marca:");
        marca = input.next();
        System.out.println("Modelo:");
        modelo = input.next();
        System.out.println("Matrícula:");
        matricula = input.next();
        System.out.println("Cv:");
        cv = input.nextInt();
        System.out.println("Cc:");
        cc = input.nextInt();

        Coche participante1 = new Coche(marca, modelo, matricula, cv, cc); //Constructor que crea el coche participante número 1

        System.out.println("Introduce los datos del segundo participante:");
        System.out.println("Marca:");
        marca = input.next();
        System.out.println("Modelo:");
        modelo = input.next();
        System.out.println("Matrícula:");
        matricula = input.next();
        System.out.println("Cv:");
        cv = input.nextInt();
        System.out.println("Cc:");
        cc = input.nextInt();

        Coche participante2 = new Coche(marca, modelo, matricula, cv, cc); //Constructor que crea el coche participante número 2

        double kmTotales; //Creamos las variables que almacenan los inputs relacionados con los detalles de la carrera
        int numeroVueltas;
        System.out.println("A continuación, introduce los datos de la carrera:");
        System.out.println("Kilómetros totales del circuito:");
        kmTotales = input.nextDouble();
        System.out.println("Número de vueltas:");
        numeroVueltas = input.nextInt();

        Carrera carrera = new Carrera(kmTotales, numeroVueltas); //Constructor que crea la carrera con los datos introducidos por el usuario

        carrera.iniciarCarrera(participante1, participante2); //Iniciamos el método que da inicio a la carrera


    }
}
