import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePassword {
    public void validChangePassword(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3magento.dev.evozon.com/");
        //login
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
        //change password from my account
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div:nth-child(3) > div.col2-set > div.col-1 > div > div.box-content > p > a")).click();
        driver.findElement(By.cssSelector("#current_password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();

        String messagePassword= driver.findElement(By.cssSelector("body > div > div > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > ul > li > ul > li")).getText();
        if(messagePassword.equalsIgnoreCase("The account information has been saved."))
            System.out.println("Succes!");
        else
            System.out.println("!Succes");
        driver.close();
    }
}
