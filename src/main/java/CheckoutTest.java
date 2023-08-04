import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckoutTest extends BaseTest{
    @Before
    public void validLogin(){
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
        String welcomeText = driver.findElement(By.cssSelector("div.welcome-msg .hello:first-child")).getText();
        Assert.assertEquals("Hello, sss sssss!",welcomeText);
    }
    @Before
    public void validAddToCart(){
        driver.findElement(By.id("search")).sendKeys("pants");
        driver.findElement(By.cssSelector("button.button.search-button")).click();
        driver.findElement(By.cssSelector("div.actions a:first-child")).click();
        driver.findElement(By.cssSelector("[alt=\"Khaki\"]")).click();
        driver.findElement(By.cssSelector("#swatch64 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("div.add-to-cart-buttons button.button.btn-cart")).click();
        String messageCart=driver.findElement(By.cssSelector("li.success-msg")).getText();
        Assert.assertEquals("Khaki Bowery Chino Pants was added to your shopping cart.",messageCart);
    }
    @Test
    public void validCheckout(){
        driver.findElement(By.cssSelector(".count")).click();
        driver.findElement(By.cssSelector(".button.checkout-button")).click();
        driver.findElement(By.cssSelector("[id=\"billing:street1\"]")).sendKeys("address required");
        driver.findElement(By.id("id=billing:city")).sendKeys("Cluj");
        Select select = new Select(driver.findElement(By.id("billing:region_id")));
        select.selectByVisibleText("Alaska");
        driver.findElement(By.id("billing:postcode"));
        Select select1=new Select(driver.findElement(By.id("billing:country_id")));
        select1.selectByVisibleText("Tokelau");
        driver.findElement(By.id("billing:telephone")).sendKeys("02156448");
        driver.findElement(By.cssSelector("[for=\"billing:use_for_shipping_no\"]")).click();
        driver.findElement(By.cssSelector("div#billing-buttons-container [title=\"Continue\"] ")).click();
        //step2
        //
        driver.findElement(By.id("shipping:firstname")).sendKeys("AnaMaria");
        driver.findElement(By.id("shipping:lastname")).sendKeys("Ioana");
        driver.findElement(By.id("shipping:street1")).sendKeys("Street idk");
        driver.findElement(By.id("shipping:city")).sendKeys("Cluj");
        Select select2 = new Select(driver.findElement(By.id("shipping[region_id]")));
        select2.selectByVisibleText("Alaska");
        driver.findElement(By.id("shipping:postcode")).sendKeys("485645");
        Select select3 = new Select(driver.findElement(By.id("shipping:country_id")));
        select3.selectByVisibleText("Tonga");
        driver.findElement(By.id("shipping:telephone")).sendKeys("0261551565");
        driver.findElement(By.cssSelector("div#shipping-buttons-container [title=\"Continue\"]"));
    }
}
