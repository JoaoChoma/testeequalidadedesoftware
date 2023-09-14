import cadastroProdutos.SistemaCadastro;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SistemaCadastroTest {
    private SistemaCadastro sistema = new SistemaCadastro();


    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


        //System.setOut(new PrintStream(outputContent));

    @Test
    public void testAdicionarProduto() {
        // Entrada de teste simulada (nome e preço)
        // Verificar a saída
        assertEquals(true, sistema.adicionarProduto("Camiseta", 19.99));
    }

    @Test
    public void testListarProdutos() {
        // Adicionar alguns produtos de teste
        sistema.adicionarProduto("Camiseta", 19.99);
        sistema.adicionarProduto("Calça Jeans", 39.99);

        // Verificar a saída
        String expectedOutput = "Lista de Produtos:\n" +
                "Camiseta - R$19.99\n" +
                "Calça Jeans - R$39.99\n";
        assertEquals(expectedOutput, sistema.listarProdutos());
    }

    @Test
    public void testBuscarProduto() {
        // Adicionar produtos de teste
        sistema.adicionarProduto("Camiseta", 19.99);
        sistema.adicionarProduto("Calça Jeans", 39.99);

        // Entrada de teste simulada (termo de busca: "Camiseta")

        String expectedOutput = "Resultados da busca por 'Camiseta':\n" +
                "Camiseta - R$19.99\n";
        assertEquals(expectedOutput, sistema.buscarProduto("Camiseta"));
    }


}

