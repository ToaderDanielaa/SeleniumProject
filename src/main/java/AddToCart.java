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
        driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#swatch25 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#swatch64 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button")).click();

        String messageCart=driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span")).getText();
        if(messageCart.equalsIgnoreCase("Khaki Bowery Chino Pants was added to your shopping cart."))
            System.out.println("Succes!");
        else
            System.out.println("!Succes");
        driver.close();

    }
}
