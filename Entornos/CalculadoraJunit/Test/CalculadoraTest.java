import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

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
    public static Collection<Object> datos() {
      return  Arrays.asList(new Object[][]{{3, 2, 5, 1, 6}, {5, 2, 7, 3, 10}, {6, 3, 9, 3, 18}});
    }

    @org.junit.Test
   public void testSuma() {
        Calculadora calculadoraTest = new Calculadora(numero1, numero2);
            int resultadoEsperadoSuma = calculadoraTest.sumar(numero1, numero2);
            assertEquals("Fallo en el método de suma.", resultadoEsperadoSuma, resultadoSuma);

        }

        @org.junit.Test
    public void testResta() {
            Calculadora calculadoraTest = new Calculadora(numero1, numero2);
            int resultadoEsperadoResta = calculadoraTest.restar(numero1, numero2);
            assertEquals("Fallo en el método de resta", resultadoEsperadoResta, resultadoResta);
    }

    @org.junit.Test
    public void testMultiplicacion() {
        Calculadora calculadoraTest = new Calculadora(numero1, numero2);
        int resultadoEsperadoMultiplicacion = calculadoraTest.multiplicar(numero1, numero2);
        assertEquals("Fallo en el método de multiplicar", resultadoEsperadoMultiplicacion, resultadoMultiplicacion);
    }
}