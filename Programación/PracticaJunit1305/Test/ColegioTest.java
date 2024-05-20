import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ColegioTest {
private int numeroAlumnos, numeroProfesores, resultadoGanancias, resultadoGasto;

    public ColegioTest(int numeroAlumnos, int numeroProfesores, int resultadoGanancias, int resultadoGasto) {
        this.numeroAlumnos = numeroAlumnos;
        this.numeroProfesores = numeroProfesores;
        this.resultadoGanancias = resultadoGanancias;
        this.resultadoGasto = resultadoGasto;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{{5, 5, 2500, 10000}, {9, 4, 4500, 8000}, {7, 2, 3500, 4000}
        });
    }

    @org.junit.Test
    public void testTotalGanancias() {
        Colegio colegioTest = new Colegio(numeroAlumnos, numeroProfesores);
        int resultadoEsperado = colegioTest.totalGanancias();
        assertEquals("El método que comprueba el total de ganancias ha fallado", resultadoEsperado, resultadoGanancias);
    }

    @org.junit.Test
    public void testTotalGasto() {
        Colegio colegioTest = new Colegio(numeroAlumnos, numeroProfesores);
        int resultadoEsperado = colegioTest.totalGasto();
        assertEquals("El método que comprueba el total de ganancias ha fallado", resultadoEsperado, resultadoGasto);
    }
}