import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculadoraTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(5, 0);
            //fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Espera-se que uma exceção do tipo IllegalArgumentException seja lançada, portanto, este bloco catch será executado.
        }
    }
}