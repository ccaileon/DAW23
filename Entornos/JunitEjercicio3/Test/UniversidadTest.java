import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UniversidadTest {
 private int numeroProfesores, numeroAlumnos, precioMatricula, resultadoTotalMatricula, resultadoTotalGasto;

    public UniversidadTest(int numeroProfesores, int numeroAlumnos, int precioMatricula, int resultadoTotalMatricula, int resultadoTotalGasto) {
        this.numeroProfesores = numeroProfesores;
        this.numeroAlumnos = numeroAlumnos;
        this.precioMatricula = precioMatricula;
        this.resultadoTotalMatricula = resultadoTotalMatricula;
        this.resultadoTotalGasto = resultadoTotalGasto;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{{10, 100, 200, 20000, 20000}, {20, 60, 20, 1200, 40000}, {5, 25, 30, 750, 10000}
        });
    }

    @org.junit.Test
    public void totalMatriculaTest() {
        Universidad universidad = new Universidad(numeroAlumnos, precioMatricula, numeroProfesores);
        int resultadoEsperado = universidad.totalMatriculas();
        assertEquals("Fallo en el test de total matriculas", resultadoEsperado, resultadoTotalMatricula);
    }

    @org.junit.Test
    public void totalGastoTest() {
        Universidad universidad = new Universidad(numeroAlumnos, precioMatricula, numeroProfesores);
        int resultadoEsperado = universidad.totalGasto();
        assertEquals("Fallo en el test de total gastos", resultadoEsperado, resultadoTotalGasto);
    }

}