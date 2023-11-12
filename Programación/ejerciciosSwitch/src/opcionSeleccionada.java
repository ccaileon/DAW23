import java.util.Scanner;

public class opcionSeleccionada {

    //Crea un programa que permita al usuario ingresar un número del 1 al 4 y muestre un mensaje diferente para cada número utilizando una sentencia switch (por ejemplo, "Opción 1 seleccionada", "Opción 2 seleccionada", etc.).

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 4:");

        byte num = input.nextByte();

        switch (num) {
            case 1:
                System.out.println("Opción 1 seleccionada");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada");
                break;
            case 3:
                System.out.println("Opción 3 seleccionada");
                break;
            case 4:
                System.out.println("Opción 4 seleccionada");
                break;
            default:
                System.out.println("La opción seleccionada no está disponible.");
        }
    }
}
