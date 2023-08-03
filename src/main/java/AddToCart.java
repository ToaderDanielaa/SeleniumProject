import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class AddToCart {
    public void validAddToCart(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3magento.dev.evozon.com/");
        driver.findElement(By.id("search")).sendKeys("pants");
        driver.findElement(By.cssSelector("button.button.search-button")).click();
        driver.findElement(By.cssSelector("div.actions a:first-child")).click();
        driver.findElement(By.cssSelector("[alt=\"Khaki\"]")).click();
        driver.findElement(By.cssSelector("#swatch64 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("div.add-to-cart-buttons button.button.btn-cart")).click();

        String messageCart=driver.findElement(By.cssSelector("li.success-msg")).getText();
        if(messageCart.equalsIgnoreCase("KHAKI BOWERY Chino Pants was added to your shopping cart."))
            System.out.println("Succes!");
        else
            System.out.println("!Succes");
        driver.close();

    }
}
