import java.util.Scanner;

public class multiploVeinte {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numEntero = num.nextInt();

        if (numEntero % 20 == 0 && numEntero >=-100 && numEntero <=100) {
            System.out.println(numEntero + " es múltiplo de 20 y está entre -100 y 100.");
        } else if (numEntero % 20 == 0) {
            System.out.println(numEntero + " es múltiplo de 20 y no está entre -100 y 100.");
        } else if (numEntero >=-100 && numEntero <=100) {
            System.out.println(numEntero + " no es múltiplo de 20 y está entre -100 y 100.");
        } else {
            System.out.println(numEntero + " no es múltiplo de 20 y no está entre -100 y 100");
        }
    }
}
