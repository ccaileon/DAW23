import java.util.Scanner;

public class estacionNumero {
    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y muestre la estación del año correspondiente (por ejemplo, "Primavera", "Verano", "Otoño", "Invierno") utilizando una sentencia switch.

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un mes en formato número (1-12) para ver a qué estación corresponde:");
        int mes = input.nextInt();

        switch (mes) {
            case 12, 1, 2:
                System.out.println("Estación de invierno.");
                break;
            case 3, 4, 5:
                System.out.println("Estacion de primavera.");
                break;
            case 6, 7, 8:
                System.out.println("Estación de verano.");
                break;
            case 9, 10, 11:
                System.out.println("Estación de otoño.");
                break;
            default:
                System.out.println("El número introducido no corresponde a ningún mes.");
        }

    }
}
