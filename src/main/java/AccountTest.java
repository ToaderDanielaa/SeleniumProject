import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class AccountTest extends BaseTest{
    @Before
    public void login(){
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
    }
    @Test
    public void validChangePassword(){
        driver.findElement(By.cssSelector("div.box-content a")).click();
        driver.findElement(By.cssSelector("#current_password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345678");
        driver.findElement(By.cssSelector("[title=\"Save\"]")).click();
        String messagePassword= driver.findElement(By.cssSelector("li.success-msg span")).getText();
        Assert.assertEquals("The account information has been saved.",messagePassword);
    }
}
