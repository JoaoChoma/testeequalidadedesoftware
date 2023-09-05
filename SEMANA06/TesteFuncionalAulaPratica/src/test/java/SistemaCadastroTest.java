

import cadastroProdutos.Main;
import cadastroProdutos.SistemaCadastro;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SistemaCadastroTest {
    private SistemaCadastro sistema = new SistemaCadastro();;
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

        // Entrada de teste simulada (apenas pressione Enter)
        String input = "\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Executar o teste
        sistema.listarProdutos();

        // Verificar a saída
        String expectedOutput = "Lista de Produtos:\n" +
                "Camiseta - R$19.99\n" +
                "Calça Jeans - R$39.99\n";
        assertEquals(expectedOutput, outputContent.toString());
    }

    @Test
    public void testBuscarProduto() {
        // Adicionar produtos de teste
        sistema.adicionarProduto("Camiseta", 19.99);
        sistema.adicionarProduto("Calça Jeans", 39.99);

        // Entrada de teste simulada (termo de busca: "Camiseta")
        String input = "Camiseta\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Executar o teste
        sistema.buscarProduto("Camiseta");

        // Verificar a saída
        String expectedOutput = "Resultados da busca por 'Camiseta':\n" +
                "Camiseta - R$19.99\n";
        assertEquals(expectedOutput, outputContent.toString());
    }

    @Test
    public void testOpcaoInvalida() {
        // Entrada de teste simulada (opção inválida: "5")
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Executar o teste
        Main.main(new String[]{});

        // Verificar a saída
        String expectedOutput = "Opção inválida.\n";
        assertEquals(expectedOutput, outputContent.toString());
    }

    @Test
    public void testSair() {
        // Entrada de teste simulada (opção "4" para sair)
        String input = "4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Executar o teste
        Main.main(new String[]{});

        // Verificar a saída
        String expectedOutput = "Saindo...\n";
        assertEquals(expectedOutput, outputContent.toString());
    }
}

