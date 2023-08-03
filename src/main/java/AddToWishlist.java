import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToWishlist {
    public void validAddToWishlist() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3magento.dev.evozon.com/");
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();

        driver.findElement(By.id("search")).sendKeys("dress");
        driver.findElement(By.cssSelector("[title=\"Search\"]")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();

        String addedMessage = driver.findElement(By.cssSelector("li.success-msg span")).getText();
        if (addedMessage.equalsIgnoreCase("Ana - Dress -Blue-M has been added to your wishlist. Click here to continue shopping."))
            System.out.println("Succes!");
        else
            System.out.println("!Succes");
        driver.close();
    }
}

