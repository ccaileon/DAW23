package controller;

import model.Ingrediente;
import model.Pizza;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("A continuación vas a crear una nueva pizza.");
        System.out.println("Introduce el nombre de la pizza:");
        String nombre = input.next();
//        System.out.println("Introduce el precio que tendrá la pizza:");
//        int precio = input.nextInt();
//        System.out.println("Introduce la cantidad de ingredientes que tendrá la pizza:");
//        int cantidadIngredientes = input.nextInt();
        System.out.println("A continuación escribe el nombre de cada ingrediente y su precio: (escribe 'fin' cuando hayas acabado)");
        ArrayList<Ingrediente> listaIngredientes = new ArrayList<>();
//        for (int i = 0; i < cantidadIngredientes; i++) {
        String nombreIngrediente;
        do {
            System.out.println("Nombre ingrediente:");
            nombreIngrediente = input.next();
            if (!nombreIngrediente.equals("fin")) {
                System.out.println("Precio:");
                int precioIngrediente = input.nextInt();
                listaIngredientes.add(new Ingrediente(nombreIngrediente, precioIngrediente));
            }
//        }
        } while (!nombreIngrediente.equals("fin"));
        int precio = 0;
        for (Ingrediente item: listaIngredientes) {
            precio = item.getPrecio() + precio;
        }
        fabricarPizza(nombre, precio, listaIngredientes);
    }

    public static void fabricarPizza(String nombre, int precio, ArrayList<Ingrediente> listaIngredientes) {
        Pizza pizza = new Pizza(nombre, precio, listaIngredientes);
        System.out.println("Tu nueva pizza con nombre " + nombre + " tiene un precio de " + precio + "€ y sus ingredientes son: ");
        for (Ingrediente ingrediente: listaIngredientes) {
            System.out.println("Nombre: " + ingrediente.getNombre() + " Precio: " + ingrediente.getPrecio());

        }
    }
}
