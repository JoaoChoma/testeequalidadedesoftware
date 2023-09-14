import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTestEquiv {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        // Classe de Equivalência 1: Números positivos
        assertEquals(5, calculator.add(2, 3));

        // Classe de Equivalência 2: Números negativos
        assertEquals(-5, calculator.add(-2, -3));

        // Classe de Equivalência 3: Zero e um número positivo
        assertEquals(5, calculator.add(0, 5));

        // Classe de Equivalência 4: Um número positivo e zero
        assertEquals(7, calculator.add(7, 0));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        // Classe de Equivalência 1: Números positivos, onde o primeiro número é maior
        assertEquals(3, calculator.subtract(6, 3));

        // Classe de Equivalência 2: Números negativos
        assertEquals(-3, calculator.subtract(-6, -3));

        // Classe de Equivalência 3: Um número positivo e zero
        assertEquals(5, calculator.subtract(5, 0));

        // Classe de Equivalência 4: Zero e um número positivo
        assertEquals(-7, calculator.subtract(0, 7));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();

        // Classe de Equivalência 1: Números positivos
        assertEquals(12, calculator.multiply(4, 3));

        // Classe de Equivalência 2: Números negativos
        assertEquals(12, calculator.multiply(-4, -3));

        // Classe de Equivalência 3: Zero e qualquer número
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(0, calculator.multiply(0, -7));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();

        // Classe de Equivalência 1: Números positivos, onde o divisor é maior que o dividendo
        assertEquals(0, calculator.divide(6, 12));

        // Classe de Equivalência 2: Números negativos, onde o divisor é menor que o dividendo
        assertEquals(3, calculator.divide(-6, -2));

        // Classe de Equivalência 3: Divisão por 1
        assertEquals(8, calculator.divide(8, 1));

        // Classe de Equivalência 4: Divisão por -1
        assertEquals(-10, calculator.divide(10, -1));

        // Classe de Equivalência 5: Divisão por zero (deve lançar uma exceção)
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(7, 0));
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();

        // Classe de Equivalência 1: Tentativa de divisão por zero (deve lançar uma exceção)
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}

