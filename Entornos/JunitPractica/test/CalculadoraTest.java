import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class CalculadoraTest {
    private int numero1, numero2, resultadoSuma, resultadoResta, resultadoMultiplicacion;

    public CalculadoraTest(int numero1, int numero2, int resultadoSuma, int resultadoResta, int resultadoMultiplicacion) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultadoSuma = resultadoSuma;
        this.resultadoResta = resultadoResta;
        this.resultadoMultiplicacion = resultadoMultiplicacion;
    }


    @Parameterized.Parameters
    public static Collection<Object[]>datos() {
       return Arrays.asList(new Object[][]{{5, 6, 11, -1, 30}, {5, 5, 10, 0, 25}, {20, 10, 30, 10, 200}});
    }

    Calculadora calculadora = new Calculadora(numero1, numero2);
    @org.junit.Test
    public void testSuma() {
       int resultadoEsperadoSuma = calculadora.sumar(numero1, numero2);
        assertEquals("La prueba de la suma ha fallado", resultadoEsperadoSuma, resultadoSuma);
    }
    @org.junit.Test
    public void testResta() {
        int resultadoEsperadoResta = calculadora.restar(numero1, numero2);
        assertEquals("La prueba de la resta ha fallado", resultadoEsperadoResta, resultadoResta);
    }
    @org.junit.Test
    public void testMultiplicacion() {
        int resultadoEsperadoMultiplicacion = calculadora.multiplicar(numero1, numero2);
        assertEquals("La prueba de la multiplicación ha fallado", resultadoEsperadoMultiplicacion, resultadoMultiplicacion);
    }
}