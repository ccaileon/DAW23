package Ejercicio1;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class ColegioTest {
private int numeroAlumnos, numeroAsignaturas;
private int resultado;

    public ColegioTest(int numeroAlumnos, int numeroAsignaturas, int resultado) {
        this.numeroAlumnos = numeroAlumnos;
        this.numeroAsignaturas = numeroAsignaturas;
        this.resultado = resultado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos (){
        return Arrays.asList(new Object[][]{{5, 2, 200}, {4, 8, 640}, {10, 10, 2000}, {9, 18, 3240}});
    }


    @org.junit.Test
    public void testCantidadTotal(){
        Colegio.Colegio pruebaColegio = new Colegio.Colegio(numeroAlumnos, numeroAsignaturas);
int resultadoEsperado = (int) pruebaColegio.cantidadCobrada();
assertEquals("Fallo al calcular la cantidad cobrada", resultadoEsperado, resultado);
    }

}
