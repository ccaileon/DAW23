import java.util.Scanner;

//Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.

public class parOImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int num = input.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("El número es par.");
                break;
            default:
                System.out.println("El número es impar.");
        }
    }
}
