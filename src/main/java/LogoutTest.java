import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {
    public void validLogout(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3magento.dev.evozon.com/");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();

        String logoutMessage=driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.page-title")).getText();
        if(logoutMessage.equalsIgnoreCase("YOU ARE NOW LOGGED OUT"))
            System.out.println("Succes!");
        else
            System.out.println("!Succes");

        driver.close();
    }
}
