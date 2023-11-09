import java.util.Scanner;

public class vocalConsonante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una letra:");

        String letra = input.next();
switch (letra.toLowerCase()) {
    case "a", "e", "i", "o", "u":
        System.out.println("Vocal");
        break;
    default:
        System.out.println("Consonante");

}


    }
}
