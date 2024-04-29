import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class EstacionTest {
private int numeroEsquiadores, resultado;

    public EstacionTest(int numeroEsquiadores, int resultado) {
        this.numeroEsquiadores = numeroEsquiadores;
        this.resultado = resultado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
      return Arrays.asList(new Object[][]{{10, 500}, {20, 1000}, {30, 1500}});
    }

    @org.junit.Test
    public void testRecaudacion() {
        Estacion estacion = new Estacion(numeroEsquiadores);
        int resultadoEsperado = estacion.recaudacionDiaria();
        assertEquals("La prueba de la recaudación es errónea", resultadoEsperado, resultado);
    }
}
