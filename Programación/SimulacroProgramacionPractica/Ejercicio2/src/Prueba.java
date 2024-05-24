import model.Circulo;
import model.Figura2D;
import model.Rectangulo;
import model.Triangulo;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Figura2D> listaFiguras = new ArrayList<>();

    listaFiguras.add(new Circulo("circulo1", 5));
    listaFiguras.add(new Rectangulo("rectangulo1", 6, 3));
    listaFiguras.add(new Triangulo("triangulo1", 3, 5, 3));


    for (Figura2D figura : listaFiguras) {
        System.out.println(figura.toString());
    }

    }


}
