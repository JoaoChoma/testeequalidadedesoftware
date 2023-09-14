import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class indexTest {

    WebDriver driver = new ChromeDriver();

    @Test
    public void testeCadastroListagemProdutos() {
        // Abrir a página do sistema
        driver.get("file:/Users/joaochoma/Documents/GitHub/testeequalidadedesoftware/SEMANA05/TesteFuncionalAulaPratica/src/main/java/visao/index.html");

        // Adicionar um produto
        WebElement nomeProdutoInput = driver.findElement(By.id("nomeProduto"));
        WebElement precoProdutoInput = driver.findElement(By.id("precoProduto"));
        WebElement adicionarBotao = driver.findElement(By.id("adicionarBotao"));

        nomeProdutoInput.sendKeys("Produto de Teste");
        precoProdutoInput.sendKeys("10.99");
        adicionarBotao.click();

        // Listar produtos
        WebElement listarProdutosBotao = driver.findElement(By.id("listarProdutosBotao"));
        listarProdutosBotao.click();

        // Buscar um produto
        WebElement buscaInput = driver.findElement(By.id("buscaInput"));
        WebElement buscarBotao = driver.findElement(By.id("buscarBotao"));

        buscaInput.sendKeys("Produto");
        buscarBotao.click();


        driver.quit();
    }
}
