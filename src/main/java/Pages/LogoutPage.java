package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage{
    protected String logoutMessage;

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public String getLogoutMessage(){
        return logoutMessage=driver.findElement(By.cssSelector(".page-title")).getText();
    }
}
