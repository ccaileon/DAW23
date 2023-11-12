import java.util.Scanner;

public class diasMes {

    //Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12) y muestre la cantidad de días que tiene ese mes, considerando años no bisiestos.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un mes en formato número (1-12):");

        int mes = input.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("El mes tiene 31 días.");
                break;
            case 2:
                System.out.println("El mes tiene 28 días en un año no bisiesto y 29 en un año bisiesto.");
                break;
            case 4, 6, 9, 11:
                System.out.println("El mes tiene 30 días");
            default:
                System.out.println("El número que has introducido no corresponde a ningún mes.");
        }
    }
}
