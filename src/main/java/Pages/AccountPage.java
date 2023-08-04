package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage{

    @FindBy(css = "div.welcome-msg .hello:first-child")
    private WebElement welcomeTextParagraph;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeText(){
        return welcomeTextParagraph.getText();
    }


}