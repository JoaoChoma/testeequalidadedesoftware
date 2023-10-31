import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AverageCalculatorTest {

    @Test
    public void testCalculateAverage() {
        AverageCalculator calculator = new AverageCalculator();
        int[] numbers = { 5, 10, 15, 20, 25 };
        double result = calculator.calculateAverage(numbers);
        assertEquals(15.0, result, 0.01); // Espera-se que a média seja 15 com uma margem de erro de 0.01
    }
}

