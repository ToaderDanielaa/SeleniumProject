package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{
    @FindBy(css=".category-products .item.last")
    private List<WebElement> allProduct;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean searchProductAndClick(String name){
        for( WebElement product : allProduct){
            if(product.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name))
            {
                product.findElement(By.cssSelector(".button[title=\"View Details\"]")).click();
                return true;
            }
        }
        return false;
    }
}
