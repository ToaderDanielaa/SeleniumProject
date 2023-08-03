import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;

@RunWith(JUnit4.class)
public class ProductTest extends BaseTest {

        @Before
        public void login(){
            driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
            driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
            driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
            driver.findElement(By.id("pass")).sendKeys("1234567");
            driver.findElement(By.id("send2")).click();
        }
        @Test
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
        public void validAddToCompare(){
            driver.findElement(By.id("search")).sendKeys("skirt");
            driver.findElement(By.cssSelector("button.button.search-button")).click();
            driver.findElement(By.cssSelector("ul.add-to-links a.link-compare")).click();

            String messageAdded=driver.findElement(By.cssSelector("li.success-msg")).getText();
            Assert.assertEquals("The product Racer Back Maxi Dress has been added to comparison list.",messageAdded);
        }
        @Test
        public void validAddToWishlist() {
            driver.findElement(By.id("search")).sendKeys("dress");
            driver.findElement(By.cssSelector("[title=\"Search\"]")).click();
            driver.findElement(By.cssSelector(".link-wishlist")).click();
            String addedMessage = driver.findElement(By.cssSelector("li.success-msg span")).getText();
            Assert.assertEquals("Ana - Dress -Blue-M has been added to your wishlist. Click here to continue shopping.",addedMessage);
        }
}
