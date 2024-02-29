import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ColegioTest {
private int numeroAlumnos, numeroAsignaturas, resultado;
public ColegioTest (int numeroAlumnos, int numeroAsignaturas, int resultado) {
    this.numeroAlumnos = numeroAlumnos;
    this.numeroAsignaturas = numeroAsignaturas;
    this.resultado = resultado;
}

@Parameterized.Parameters

public static Collection<Object[]> datos() {
    return Arrays.asList(new Object[][] { {2, 3, 450}, {5, 10, 3750}, {15, 8, 9000}, {20, 5, 7500}}
    );
}

    @org.junit.Test
    public void cantidadCobradaTest() {
    Colegio test = new Colegio("NombreColegio", numeroAlumnos, numeroAsignaturas);
    int resultadoEsperado = (int) test.cantidadCobrada();
    assertEquals("Fallo al calcular la cantidad cobrada.", resultado, resultadoEsperado);

    }
}