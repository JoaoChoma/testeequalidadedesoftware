import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExemploTesteFuncional {

    CalculadoraDePreco cal = new CalculadoraDePreco();

    @Test
    public void testCalcularPrecoComDesconto() {
        double compra = 100.0;
        double desconto = 0.2;  // 20% de desconto

        double precoCalculado = cal.calcularPrecoTotal(compra, desconto);

        // Verifica se o preço calculado com desconto está correto
        assertEquals(80.0, precoCalculado, 0.0001);  // Usando uma margem de erro
    }


}
