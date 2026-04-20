import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        assertEquals(8, Calculadora.operar(5, 3, 1));
    }

    @Test
    public void testResta() {
        assertEquals(2, Calculadora.operar(5, 3, 2));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(15, Calculadora.operar(5, 3, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculadora.operar(6, 3, 4));
    }

    @Test
    public void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.operar(5, 0, 4);
        });
    }

    @Test
    public void testOpcionInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.operar(5, 3, 99);
        });
    }
}
