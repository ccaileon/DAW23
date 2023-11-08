import java.util.Scanner;

public class tresEnteros {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce el primer número entero positivo:");
        int primerNumero = num.nextInt();
        System.out.println("Introduce el segundo número ero positivo:");
        int segundoNumero = num.nextInt();
        System.out.println("Introduce el tercer número ero positivo:");
        int tercerNumero = num.nextInt();

        if (primerNumero >=1 && segundoNumero >=1 && tercerNumero >= 1) {
            if (primerNumero + tercerNumero == segundoNumero) {
                System.out.println(segundoNumero + " = " + primerNumero + " + " + tercerNumero);
            } else if (primerNumero + segundoNumero == tercerNumero) {
                System.out.println(tercerNumero + " = " + primerNumero + " + " + segundoNumero);
            } else if (segundoNumero + tercerNumero == primerNumero) {
                System.out.println(primerNumero + " = " + segundoNumero + " + " + tercerNumero);
            } else {
                System.out.println("Ninguno es la suma de los otros dos.");
            }
        } else {
            System.out.println("No has introducido los números correctamente. Recuerda que deben ser números enteros positivos.");
        }
    }
}
