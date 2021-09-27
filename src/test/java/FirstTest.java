import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void openLKS(){
        System.setProperty("webdriver.chrome.driver", "C:\\MyProjects\\TestAuto\\chromedriver93.exe");
                WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://spms-ddb-web.spms-develop.apps.ds1-genr01.corp.dev.vtb/");

        WebElement inputName = driver.findElement(By.name("username"));
        inputName.sendKeys("adm");
        WebElement inputPass = driver.findElement(By.name("password"));
        inputPass.sendKeys("adm");
        WebElement inputSubmit = driver.findElement(By.className("jss158"));
        inputSubmit.submit();
    }
}
