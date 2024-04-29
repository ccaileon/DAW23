package Colegio;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(Parameterized.class)

public class ColegioTest{
    private int numeroAlumnos, numeroAsignaturas, resultado;

    public ColegioTest(int numeroAlumnos, int numeroAsignaturas, int resultado) {
        this.numeroAlumnos = numeroAlumnos;
        this.numeroAsignaturas = numeroAsignaturas;
        this.resultado = resultado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{{50, 10, 10000}, {30, 5, 3000}, {40, 3, 2400}});
    }

    @org.junit.Test
    public void cantidadCobradaTest() {


        Colegio colegioTest = new Colegio("Nombre" ,numeroAlumnos, numeroAsignaturas);
        int resultadoEsperado = (int) colegioTest.cantidadCobrada();
        assertEquals(resultadoEsperado, resultado, "Fallo al calcular la cantidad cobrada." );
    }

}