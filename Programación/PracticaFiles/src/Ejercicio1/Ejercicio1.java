package Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respuesta = "si";
        ArrayList<Usuario> usuarios = new ArrayList<>();
        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Introduce los datos del usuario");
            System.out.printf("Nombre:");
            String nombre = input.next();
            System.out.printf("Apellido:");
            String apellido = input.next();
            System.out.printf("Teléfono:");
            int telefono = input.nextInt();
            System.out.printf("DNI:");
            String dni = input.next();
            System.out.printf("Edad:");
            int edad = input.nextInt();
            usuarios.add(new Usuario(nombre, apellido, dni, edad, telefono));
            System.out.println("¿Quiere introducir otro usuario?");
            System.out.printf("Respuesta:");
            respuesta = input.next();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("usuarios.txt"))) {
            for (Usuario usuario: usuarios) {
                bufferedWriter.write(usuario.toString());
                bufferedWriter.newLine();
            }
            System.out.println("Lista de usuarios guardada en la ruta");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de texto: " + e.getMessage());
        }
    }
}
