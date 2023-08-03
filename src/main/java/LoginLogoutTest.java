import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
@RunWith(JUnit4.class)
public class LoginLogoutTest extends BaseTest {
    @Test
    public void validLogin(){
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
        String welcomeText = driver.findElement(By.cssSelector("div.welcome-msg .hello:first-child")).getText();
        Assert.assertEquals("Hello, sss sssss!",welcomeText);
    }
    @Test
    public void validLogout(){
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Log Out\"]")).click();
        driver.findElement(By.cssSelector("a.skip-link.skip-account")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[title=\"Log In\"]")).isDisplayed());
    }
}
