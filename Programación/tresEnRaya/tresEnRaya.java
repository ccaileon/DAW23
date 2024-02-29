import java.util.ArrayList;
import java.util.Scanner;

public class tresEnRaya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Inicializar cada posición con un nuevo ArrayList
        ArrayList[][] tablero = new ArrayList[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = new ArrayList<>();
            }
        }
        System.out.println("Vas a comenzar una partida de tres en raya");
        boolean tresEnRaya = false;
        while (!tresEnRaya) {
            System.out.println("Jugador 1: Escoge una línea vertical");
            int verticalJugador1 = input.nextInt();
            System.out.println("Jugador 1: Escoge una linea horizontal");
            int horizontalJugador1 = input.nextInt();
            tablero[verticalJugador1][horizontalJugador1].add("X");
            System.out.println("Has colocado tu ficha en la casilla [" + verticalJugador1 + ", " + horizontalJugador1 + "]");
            System.out.println("Jugador 2: Escoge una línea vertical");
            int verticalJugador2 = input.nextInt();
            System.out.println("Jugador 2: Escoge una linea horizontal");
            int horizontalJugador2 = input.nextInt();
            tablero[verticalJugador2][horizontalJugador2].add("O");
            System.out.println("Has colocado tu ficha en la casilla [" + verticalJugador2 + ", " + horizontalJugador2 + "]");

            //Verificar filas
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length - 2; j++) {
                    if (tablero[i][j].equals(tablero[i][j + 1]) && tablero[i][j + 1].equals(tablero[i][j + 2])) {
                        tresEnRaya = true;
                        System.out.println("Tres en raya en horizontal");
                        break;
                    }
                }
            }
            //Verificar columnas
            for (int i = 0; i < tablero.length - 2; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j].equals(tablero[i + 1][j]) && tablero[i + 1][j].equals(tablero[i + 2][j])) {
                        tresEnRaya = true;
                        System.out.println("Tres en raya en vertical");
                        break;
                    }
                }

            }
            //Verificar diagonal hacia la derecha
            for (int i = 0; i < tablero[i].length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j].equals(tablero[i + 1][j + 1]) && tablero[i + 1][j + 1].equals(tablero[i + 2][j + 2])) {
                        tresEnRaya = true;
                        System.out.println("Tres en raya en diagonal");
                        break;
                    }
                    if (tablero[i][j + 2].equals(tablero[i + 1][j + 1]) && tablero[i + 1][j + 1].equals(tablero[i + 2][j])) {
                        tresEnRaya = true;
                        System.out.println("Tres en raya en diagonal");
                        break;
                    }

                }

            }


        }

    }
}
