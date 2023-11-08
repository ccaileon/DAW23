import java.util.Scanner;

public class numeroCapicua {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce un número de 4 dígitos");
        int numCapicua = num.nextInt();
        int numOriginal = numCapicua; //guarda el número original antes de modificarlo en el while
        int ultimaCifra;
        int numeroInvertido = 0;

        if (numCapicua >= 1000 && numCapicua <= 9999){

            while (numCapicua != 0) {
                ultimaCifra = numCapicua % 10; //obtiene la última cifra del número guardado en numCapicua
                numCapicua = numCapicua / 10; //quita la última cifra al número guardado en numCapicua
                numeroInvertido = numeroInvertido * 10 + ultimaCifra; //añade a la nueva variable, numInvertido, la última cifra extraida de numCapicua
            }

            if (numOriginal == numeroInvertido) {
                System.out.println("El número " + numOriginal + " es un número capicúa.");
            } else {
                System.out.println("El número " + numOriginal + " no es un número capicúa.");
            }
        } else {
            System.out.println("El número que has introducido no es correcto.");
        }
    }
}
