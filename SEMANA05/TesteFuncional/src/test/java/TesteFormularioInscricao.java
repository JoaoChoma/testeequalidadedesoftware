import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteFormularioInscricao {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "caminho_para_chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("/Users/joaochoma/Documents/GitHub/testeequalidadedesoftware/SEMANA05/TesteFuncional/src/main/java/web/index.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testPreenchimentoBemSucedido() {
        // Preenchimento dos campos
        driver.findElement(By.id("first-name")).sendKeys("João");
        driver.findElement(By.id("last-name")).sendKeys("Silva");
        driver.findElement(By.id("email")).sendKeys("joao.silva@example.com");
        driver.findElement(By.id("workshop")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("workshop")).sendKeys(Keys.ENTER);

        // Envio do formulário
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Verifica se a página de sucesso foi exibida
        assertTrue(driver.getPageSource().contains("Inscrição bem-sucedida"));
    }

    @Test
    public void testCamposEmBranco() {
        // Envio do formulário sem preencher campos
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Verifica se mensagens de erro são exibidas
        assertTrue(driver.getPageSource().contains("Este campo é obrigatório"));
    }

    @Test
    public void testEmailInvalido() {
        // Preenchimento inválido do email
        driver.findElement(By.id("email")).sendKeys("email_invalido");

        // Envio do formulário
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Verifica se mensagem de erro é exibida
        assertTrue(driver.getPageSource().contains("Digite um endereço de email válido"));
    }

    @Test
    public void testSelecaoWorkshops() {
        // Preenchimento dos campos
        driver.findElement(By.id("first-name")).sendKeys("Maria");
        driver.findElement(By.id("last-name")).sendKeys("Santos");
        driver.findElement(By.id("email")).sendKeys("maria.santos@example.com");
        driver.findElement(By.id("workshop")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("workshop")).sendKeys(Keys.ENTER);

        // Envio do formulário
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Verifica se a página de sucesso foi exibida
        assertTrue(driver.getPageSource().contains("Inscrição bem-sucedida"));
    }
}
