import java.util.InputMismatchException;
import java.util.Scanner;

public class Entradaa {
    public static void main(String[] args) {
        try {
        String nombre, apellido;
        char genero;
        int edad;
        double peso, altura, imc;

    Scanner input = new Scanner(System.in);
    System.out.println("Introduce el nombre:");
    nombre = input.next();
    System.out.println("Introduce el apellido:");
    apellido = input.next();
    System.out.println("Introduce el género (M/F)");
    genero = input.next().charAt(0);
    System.out.println("Introduce la edad:");
    edad = input.nextInt();
    System.out.println("Introduce el peso:");
    peso = input.nextDouble();
    System.out.println("Introduce la altura:");
    altura = input.nextDouble();

        imc = calculoIMC(peso, altura);

        System.out.println("Hola, " + nombre + ". Tu IMC teniendo en cuenta tu altura de " + altura + " cm y tu peso de "+ peso + " kg, tiene un valor de "+ imc + ".");

        } catch (InputMismatchException e) {
            System.out.println("El dato introducido no es correcto");
        }
    }

    public static double calculoIMC(double peso, double altura) {
        return altura/peso;
    }
}
