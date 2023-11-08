import java.util.Scanner;

public class dosEnteros {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce el primer número entero");
        int primerNumero = num.nextInt();
        System.out.println("Introduce el segundo número entero");
        int segundoNumero = num.nextInt();

        if (primerNumero > segundoNumero) {
            System.out.println("El primero es mayor que el segundo");
        } else {
            System.out.println("El primero no es mayor que el segundo");
        }
    }

}
