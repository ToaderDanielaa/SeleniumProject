import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCompare {
    public void validAddToCompare(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3magento.dev.evozon.com/");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("ion@creanga.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();

        driver.findElement(By.id("search")).sendKeys("skirt");
        driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div.main > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > ul > li:nth-child(2) > a")).click();

        String messageAdded=driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div.main > div.col-wrapper > div.col-main > ul > li > ul > li > span")).getText();
        if(messageAdded.equalsIgnoreCase("The product Racer Back Maxi Dress has been added to comparison list."))
            System.out.println("Succes!");
        else
            System.out.println("!Succes");
        driver.close();
    }
}
