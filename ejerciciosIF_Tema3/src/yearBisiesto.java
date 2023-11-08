import java.util.Scanner;

public class yearBisiesto {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce un año");
        int year = num.nextInt();

        if (year % 4 == 0) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year +  " no es bisiesto.");
        }
    }
}
