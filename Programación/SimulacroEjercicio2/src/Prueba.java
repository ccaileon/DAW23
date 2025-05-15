import model.Circulo;
import model.Figura2D;
import model.Rectangulo;
import model.Triangulo;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Figura2D> listaFiguras = new ArrayList<>();
        listaFiguras.add(new Circulo("circuloPequeño", 6));
        listaFiguras.add(new Circulo("circuloGrande", 12));
        listaFiguras.add(new Rectangulo("rectanguloPequeño", 3, 6));
        listaFiguras.add(new Rectangulo("rectanguloGrande", 6, 12));
        listaFiguras.add(new Triangulo("trianguloPequeño", 3, 6, 3));
        listaFiguras.add(new Triangulo("trianguloGrande", 6, 12, 6));


        for (Figura2D item: listaFiguras) {
            System.out.println(item.getNombre());
            System.out.println(item.calcularPerimetro());
        }

        }
    }

