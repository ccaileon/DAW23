import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 5 números entre el 1 y el 10:");
        int[] numeroAleatorio = new int[5];
        int[] numeroUsuario = new int[5];
        boolean repetido;
        int numeroSalido;
        int aciertos = 0;
        for (int i = 0; i < numeroAleatorio.length; i++) {
            do {
                repetido = false;
                numeroSalido = (int) (Math.random() * 11);
                for (int item : numeroAleatorio) {
                    if (item == numeroSalido) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            numeroAleatorio[i] = numeroSalido;
        }
        for (int i = 0; i < numeroUsuario.length; i++) {
            numeroUsuario[i] = input.nextInt();
            for (int item : numeroAleatorio) {
                if (item == numeroUsuario[i]) {
                    aciertos++;
                }
            }
        }
        System.out.println("Ha obtenido " + aciertos + " aciertos.");
    }
}

