import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EstabloTest {
    private int numeroCaballos, numeroClientes, resultadoGananciaMensual, resultadoGastoMensual;

    public EstabloTest(int numeroCaballos, int numeroClientes, int resultadoGananciaMensual, int resultadoGastoMensual) {
        this.numeroCaballos = numeroCaballos;
        this.numeroClientes = numeroClientes;
        this.resultadoGananciaMensual = resultadoGananciaMensual;
        this.resultadoGastoMensual = resultadoGastoMensual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos () {
        return Arrays.asList(new Object[][] { {5, 10, 2500, 100}, {20, 14, 14000, 400}, {12, 35, 21000, 240}

        });
    }



    @org.junit.Test
    public void gananciaMensualTest() {
        Establo establo = new Establo(numeroCaballos, numeroClientes);
        int resultadoEsperado = establo.gananciaMensual();
        assertEquals("Error en el método de gananciaMensual", resultadoEsperado, resultadoGananciaMensual);
    }

    @org.junit.Test
    public void gastoMensualTest() {
        Establo establo = new Establo(numeroCaballos, numeroClientes);
        int resultadoEsperado = establo.gastoMensual();
        assertEquals("Error en el método de gastoMensual", resultadoEsperado, resultadoGastoMensual);
    }
}