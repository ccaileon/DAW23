import java.util.Scanner;

public class operacionDosNumeros {
    public static void main(String[] args) {
        // Realiza un programa que pida al usuario ingresar un carácter que represente una operación matemática (+, -, *, /) y dos números. Luego, utiliza una sentencia switch para realizar la operación correspondiente y mostrar el resultado.
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el símbolo de la operación que desees realizar (+, -, *, /)");
        String operacion = input.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Introduce el primer número de la operación:");
        int primerNumero = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Introduce el segundo número de la operación:");
        int segundoNumero = input3.nextInt();

        switch (operacion) {
            case "+":
                System.out.println("El resultado es " + primerNumero + segundoNumero);
                break;
            case "-":
                System.out.println("El resultado es " + (primerNumero - segundoNumero));
                break;
            case "*":
                System.out.println("El resultado es " + primerNumero * segundoNumero);
                break;
            case "/":
                System.out.println("El resultado es " + primerNumero / segundoNumero);
                break;
            default:
                System.out.println("El simbolo introducido no es correcto.");
        }



    }
}
