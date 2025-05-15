import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ColegioTest {
private int numeroALumnos, numeroAsignaturas, numeroProfesores, resultadoTotalIngresos, resultadoTotalGastos;

    public ColegioTest(int numeroALumnos, int numeroAsignaturas, int numeroProfesores, int resultadoTotalIngresos, int resultadoTotalGastos) {
        this.numeroALumnos = numeroALumnos;
        this.numeroAsignaturas = numeroAsignaturas;
        this.numeroProfesores = numeroProfesores;
        this.resultadoTotalIngresos = resultadoTotalIngresos;
        this.resultadoTotalGastos = resultadoTotalGastos;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][]{{5, 5, 2, 250, 40}, {4, 3, 5, 120, 100}});
    }

    @org.junit.Test
    public void testTotalIngresos(){
        Colegio colegioTest = new Colegio("Las Meninas", numeroALumnos, numeroProfesores, numeroAsignaturas);
        int resultadoEsperado = colegioTest.ingresoTotal();
        assertEquals("Fallo en el test de ingresos totales.", resultadoEsperado, resultadoTotalIngresos);
    }

    @org.junit.Test
    public void testTotalGastos(){
        Colegio colegioTest = new Colegio("Las Meninas", numeroALumnos, numeroProfesores, numeroAsignaturas);
        int resultadoEsperado = colegioTest.gastoTotal();
        assertEquals("Fallo en el test de gastos totales.", resultadoEsperado, resultadoTotalGastos);

    }


}