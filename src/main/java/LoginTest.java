import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public void validLoginTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3magento.dev.evozon.com/");
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
        String welcomeText = driver.findElement(By.cssSelector("div.welcome-msg .hello:first-child")).getText();

        if (welcomeText.equalsIgnoreCase("Hello, sss sssss!"))
            System.out.println("Success!");
        else
            System.err.println("!Success");

        driver.close();
    }
}
