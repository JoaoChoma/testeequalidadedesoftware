import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        Retangulo retangulo = new Retangulo(5.0, 3.0);

        // Calculando a área esperada manualmente (5 * 3 = 15)
        double areaEsperada = 15.0;

        // Chamando o método de cálculo da área
        double areaCalculada = retangulo.calcularArea();

        // Comparando a área calculada com a esperada
        assertEquals(areaEsperada, areaCalculada, 0.0001); // Usando uma margem de erro
    }
}