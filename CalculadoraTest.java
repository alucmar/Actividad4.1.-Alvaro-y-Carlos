import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testSumar() {
        assertEquals(5.0, CalculadoraTest.sumar(2, 3));
        assertEquals(-1.0, CalculadoraTest.sumar(2, -3));
        assertEquals(0.0, CalculadoraTest.sumar(0, 0));
    }

    @Test
    void testRestar() {
        assertEquals(-1.0, CalculadoraTest.restar(2, 3));
        assertEquals(5.0, CalculadoraTest.restar(2, -3));
        assertEquals(0.0, CalculadoraTest.restar(0, 0));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6.0, CalculadoraTest.multiplicar(2, 3));
        assertEquals(-6.0, CalculadoraTest.multiplicar(2, -3));
        assertEquals(0.0, CalculadoraTest.multiplicar(0, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2.0, CalculadoraTest.dividir(6, 3));
        assertEquals(-2.0, CalculadoraTest.dividir(6, -3));
    }

    @Test
    void testDividirPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraTest.dividir(5, 0);
        });

        assertEquals("No se puede dividir entre 0", exception.getMessage());
    }
}
}
