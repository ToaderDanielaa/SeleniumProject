import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

@RunWith(JUnit4.class)
public class RegisterTest extends BaseTest {
    @Test
    public void validRegisterTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3magento.dev.evozon.com/");
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Register\"]")).click();
        driver.findElement(By.id("firstname")).sendKeys("AnaMaria");
        driver.findElement(By.id("middlename")).sendKeys("C");
        driver.findElement(By.id("lastname")).sendKeys("Ionescu");
        driver.findElement(By.id("email_address")).sendKeys("ioon@maria.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector("[for=\"is_subscribed\"]")).click();
        driver.findElement(By.cssSelector(".buttons-set [title=\"Register\"]")).click();
        String welcomeText=driver.findElement(By.cssSelector("li.success-msg span")).getText();
        Assert.assertEquals("Thank you for registering with Madison Island.",welcomeText);
    }

}
