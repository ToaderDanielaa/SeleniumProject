import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePassword {
    public void validChangePassword(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3magento.dev.evozon.com/");
        //login
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
        //change password from my account
        driver.findElement(By.cssSelector("div.box-content a")).click();
        driver.findElement(By.cssSelector("#current_password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345678");
        driver.findElement(By.cssSelector("[title=\"Save\"]")).click();

        String messagePassword= driver.findElement(By.cssSelector("li.success-msg span")).getText();
        if(messagePassword.equalsIgnoreCase("The account information has been saved."))
            System.out.println("Succes!");
        else
            System.out.println("!Succes");
        driver.close();
    }
}
