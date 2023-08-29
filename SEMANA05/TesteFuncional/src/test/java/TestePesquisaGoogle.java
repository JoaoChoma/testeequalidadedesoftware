import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestePesquisaGoogle {

    @Test
    public void testPesquisaGoogle() {
        // Configuração do WebDriver
        //System.setProperty("webdriver.chrome.driver", "caminho_para_chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navegar para o site do Google
        driver.get("https://www.google.com");

        // Preencher o campo de pesquisa e pressionar Enter
        driver.findElement(By.name("q")).sendKeys("Teste de Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        // Verificar se o primeiro resultado contém a palavra-chave
        assertTrue(driver.findElement(By.cssSelector(".g")).getText().contains("Selenium"));

        // Fechar o navegador
        driver.quit();
    }
}
