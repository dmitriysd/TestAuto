import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void openLKS(){
        System.setProperty("webdriver.chrome.driver", "C:\\MyProjects\\TestAuto\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.get("http://spms-ddb-web.spms-develop.apps.ds1-genr01.corp.dev.vtb/");
    }
}
