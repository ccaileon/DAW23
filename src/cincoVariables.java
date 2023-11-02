import java.util.Arrays;
public class cincoVariables {
    public static void main(String[] args) {
        int[] variablesEnteras = {5, 10, 15, 20, 25};
        //a) Las muestra en una línea separadas por un espacio
        //System.out.println(variablesEnteras[0] + " " + variablesEnteras[1] + " " + variablesEnteras[2] + " " + variablesEnteras[3] + " " + variablesEnteras[4]);
        //De esta forma no hay que poner tanto texto, rota por toda la array y añade un espacio:
        for (int entera : variablesEnteras) {
            System.out.print(entera + " ");
        }
        System.out.println();//salto de linea

        //b) Rote los valores hacia la derecha (la primera variable tome el valor de la segunda; la segunda, la de la tercera; la tercera, la de la cuarta; la cuarta, la de la quinta; y la quinta, la de la primera
        int counter = 0; //Contador para detener el ciclo del while
        int x = 1; //número de veces que queremos que mueva el index
        while (counter < x) {
            int temp = variablesEnteras[variablesEnteras.length - 1]; //guardamos el valor del último elemento del array en una variable temporal
            for (int i = variablesEnteras.length - 1; i > 0; i--) {
                variablesEnteras[i] = variablesEnteras[i - 1];
            }
            variablesEnteras[0] = temp; //Posicionamos el último elemento que teniamos guardado en el index 0
            counter++;
        }
        for (int entera : variablesEnteras) {
            System.out.print(entera + " ");
        }

        System.out.println();//salto de linea

        //c) Se muestren de nuevo el valor de las cinco variables de la misma forma que en el apartado a)
        //Invertir el desplazamiento (desplazar a la izquierda para volver a la posición inicial)
        counter = 0; //reiniciamos el contador
        while (counter < x) {
            int temp = variablesEnteras[0]; //Guardamos el valor del primer elemento (5) en una variable temporal
            for (int i = 0; i < variablesEnteras.length - 1; i++) {
                variablesEnteras[i] = variablesEnteras[i + 1];
            }
            variablesEnteras[variablesEnteras.length - 1] = temp; //Posicionamos el valor temporal en la primera posición
            counter++;
        }


        for (int entera : variablesEnteras) {
            System.out.print(entera + " ");
        }
    }
}







