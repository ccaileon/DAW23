import java.util.Scanner;

public class tablero {  //Noelia Cegarra Castillo
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Medida horizontal");
        int h = input.nextInt();
        System.out.println("Medida vertical");
        int v = input.nextInt();
        int[][] tablero = new int[h][v];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                tablero[i][j] = (int) (Math.random() * 99);
                System.out.println(tablero[i][j]);
            }

        }
        System.out.println("¿Qué numero quieres comprobar si se encuentra en el tablero?");
        int numeroBuscado = input.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                if (tablero[i][j] == numeroBuscado) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        if (encontrado) {
            System.out.println("El número buscado se encuentra en el tablero.");
        } else {
            System.out.println("El número buscado no se encuentra en el tablero.");
        }
    }
}



