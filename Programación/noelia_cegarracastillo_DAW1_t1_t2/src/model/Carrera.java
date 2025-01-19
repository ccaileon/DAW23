package model;

import java.util.Objects;
import java.util.Scanner;

public class Carrera { //Creamos la clase Carrera con sus características
    private double kmTotales;
    private int numeroVueltas;
    private String ganador;

    public Carrera() { //Constructor vacío
    }

    public Carrera(double kmTotales, int numeroVueltas) { //Constructor para la carrera
        this.kmTotales = kmTotales;
        this.numeroVueltas = numeroVueltas;
        this.ganador = ganador;

    }

    // <------------getter------------->
    public double getKmTotales() {
        return kmTotales;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public String getGanador() {
        return ganador;
    }

    // <------------setter------------->
    public void setKmTotales(double kmTotales) {
        this.kmTotales = kmTotales;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public void iniciarCarrera(Coche participante1, Coche participante2) { //Método que inicia la carrera y que la completa
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("¡Estos son los participantes de la carrera de hoy!");
        System.out.println("\uD83C\uDFCE\uFE0F Participante número 1:");
        participante1.mostrarDatos();
        System.out.println("--------------------------");
        System.out.println("\uD83C\uDFCE\uFE0F Participante número 2:");
        participante2.mostrarDatos();
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("\uD83C\uDFC1 ¡Comienza la carrera! \uD83C\uDFC1");

        int totalVueltas = this.numeroVueltas;
        int vueltasRestantes = this.numeroVueltas;
        boolean carreraFinalizada = false;


        do {

            if (vueltasRestantes > 0) {// Lógica para simular las vueltas hasta que se completen
                acelerarCoche(participante1, participante2);
                Coche cocheEnCabeza = calcularCocheEnCabeza(participante1, participante2);

                System.out.println("\uD83C\uDFC1 ¡Vuelta número " + ((this.numeroVueltas - vueltasRestantes) + 1) + " completada! Y en cabeza se encuentra... " + mensajeEnCabeza(participante1, participante2, cocheEnCabeza) + "\uD83C\uDFC1");
                vueltasRestantes--;
            } else { // Si se han acabado las vueltas, determinar el ganador, en caso de que alguno de los participantes haya completado los kilómetros de la carrera
                Coche cocheEnCabeza = calcularCocheEnCabeza(participante1, participante2);

                if (participante1.getKmRecorridos() >= kmTotales || participante2.getKmRecorridos() >= kmTotales) { //Comprobamos si alguno de los participantes han completado los kilómetros una vez acabas las vueltas del circuito
                    carreraFinalizada = determinarGanador(participante1, participante2, kmTotales, cocheEnCabeza); //El método "determinarGanador" devuelve un boolean "true" (que finaliza el ciclo del do while) y muestra en pantalla el anuncio del ganador
                } else {
                    // Ninguno de los dos ha llegado aún, continuamos corriendo
                    System.out.println("Ambos participantes aún no han completado el recorrido. Va a dar comienzo la vuelta número " +
                            ((totalVueltas++) + 1) + " y en cabeza se encuentra... " + mensajeEnCabeza(participante1, participante2, cocheEnCabeza) + ". Continuando...");
                    // Lógica para continuar simulando la carrera
                    acelerarCoche(participante1, participante2);
                    carreraFinalizada = determinarGanador(participante1, participante2, kmTotales, cocheEnCabeza);      // Marcar la carrera como finalizada y anunciar el ganador
                }

            }

        }
        while (!carreraFinalizada); //Mientras que carrera finalizada no sea true, se repetirá el ciclo del do while

        this.setGanador(calcularCocheEnCabeza(participante1, participante2).getMatricula()); //Una vez terminada la carrera, se establece la matricula del ganador en la String vacía de la clase Carrera "ganador"
    }

    public static void acelerarCoche(Coche participante1, Coche participante2) { //Método interactivo para hacer que los coches aceleren
        Scanner input = new Scanner(System.in);
        System.out.println("El participante número 1 acelera! ¿Cuántos km/h quieres que acelere?");
        participante1.acelerar(input.nextDouble());

        System.out.println("El participante número 2 acelera! ¿Cuántos km/h quieres que acelere?");
        participante2.acelerar(input.nextDouble());
    }


    public static Coche calcularCocheEnCabeza(Coche participante1, Coche participante2) { //Método que comprueba que participante lleva más kilómetros recorridos. Su función es evitar empates
        // erróneos en caso de que ambos participantes lleguen a la meta en la misma vuelta (comprueba que coche ha hecho más kilómetros y, por tanto, cuál ha llegado antes).
        if (participante1.getKmRecorridos() > participante2.getKmRecorridos()) {
            return participante1;
        } else if (participante1.getKmRecorridos() < participante2.getKmRecorridos()) {
            return participante2;
        }
        return new Coche(); //Devuelve un coche vacio en caso de que ambos coches estén empatados
    }


    private static String mensajeEnCabeza(Coche participante1, Coche participante2, Coche cocheEnCabeza) { //Método que nos sirve para mostrar en consola cuál participante se encuentra en cabeza
        if (cocheEnCabeza == participante1) {
            return "¡el participante número 1!";
        } else if (cocheEnCabeza == participante2) {
            return "¡el participante número 2!";
        } else {
            return "¡ninguno! Ambos están empatados.";
        }
    }

    public static boolean determinarGanador(Coche participante1, Coche participante2, double kmTotales, Coche cocheEnCabeza) { //Método para determinar qué coche ha sido el ganador de la carrera, también devuelve un boolean que determina si la carrera ha terminado o no.

        if (participante1.getKmRecorridos() >= kmTotales || participante2.getKmRecorridos() >= kmTotales) { //Si alguno de los dos participantes ha completado los kilómetros del circuito
            if (Objects.equals(cocheEnCabeza, participante1) && participante1.getKmRecorridos() >= kmTotales) { //Si el participante 1 ha llegado primero a la meta, y también ha hecho más kilómetros, significa que ha ganado
                System.out.println("🏁 ¡Carrera Finalizada! 🏁");
                System.out.println("El ganador es el participante número 1, con matricula " + participante1.getMatricula() + " y que alcanzó una velocidad de " + String.format("%.2f", participante1.getVelocidad()) + "km/h. ¡Impresionante! \uD83C\uDFC6");
                return true; //Finaliza la carrera al completar el ciclo do while
            } else if (Objects.equals(cocheEnCabeza, participante2) && participante2.getKmRecorridos() >= kmTotales) { //Misma comprobación para el participante 2
                System.out.println("🏁 ¡Carrera Finalizada! 🏁");
                System.out.println("El ganador es el participante número 2, con matricula " + participante2.getMatricula() + " y que alcanzó una velocidad de " + String.format("%.2f", participante2.getVelocidad()) + ". ¡Impresionante! \uD83C\uDFC6");
                return true; //Finaliza la carrera al completar el ciclo do while
            } else if (Objects.equals(cocheEnCabeza, new Coche())) { //Si ninguno de los coches va en cabeza, significa que se encuentran empatados
                System.out.println("🏁 ¡Carrera Finalizada! 🏁");
                System.out.println("¡La carrera ha finalizado en empate!");
            }
        }
        return false; //Si ninguno de los participantes cumple con las condiciones anteriores, la carrera no ha finalizado

    }
}



















