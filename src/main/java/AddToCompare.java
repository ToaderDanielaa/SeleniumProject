import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCompare {
    public void validAddToCompare(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3magento.dev.evozon.com/");

        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();

        driver.findElement(By.id("search")).sendKeys("skirt");
        driver.findElement(By.cssSelector("button.button.search-button")).click();
        driver.findElement(By.cssSelector("ul.add-to-links a.link-compare")).click();

        String messageAdded=driver.findElement(By.cssSelector("li.success-msg")).getText();
        if(messageAdded.equalsIgnoreCase("The product Racer Back Maxi Dress has been added to comparison list."))
            System.out.println("Succes!");
        else
            System.out.println("!Succes");
        driver.close();
    }
}
