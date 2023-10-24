import br.com.cod3r.cm.modelo.ResultadoEvento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResultadoEventoTest {

    @Test
    public void testGanhouTrue() {
        // Arrange
        ResultadoEvento resultado = new ResultadoEvento(true);

        // Act
        boolean ganhou = resultado.isGanhou();

        // Assert
        assertTrue(ganhou);
    }

    @Test
    public void testGanhouFalse() {
        // Arrange
        ResultadoEvento resultado = new ResultadoEvento(false);

        // Act
        boolean ganhou = resultado.isGanhou();

        // Assert
        assertFalse(ganhou);
    }

    @Test
    public void testConstrutor() {
        // Arrange
        boolean ganhou = true;

        // Act
        ResultadoEvento resultado = new ResultadoEvento(ganhou);

        // Assert
        assertNotNull(resultado);
    }

    @Test
    public void testConstrutorComFalse() {
        // Arrange
        boolean ganhou = false;

        // Act
        ResultadoEvento resultado = new ResultadoEvento(ganhou);

        // Assert
        assertNotNull(resultado);
    }
}
