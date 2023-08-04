package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id ="firstname")
    private WebElement firstNameField;

    @FindBy(id ="lastname")
    private WebElement lastNameField;

    @FindBy(id ="email_address")
    private WebElement emailAddressField;

    @FindBy(id ="password")
    private WebElement passwordField;

    @FindBy(id ="confirmation")
    private WebElement confirmPasswordField;

    @FindBy(css =".buttons-set [title=\"Register\"]")
    private WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstNameField(String first_name){
        firstNameField.sendKeys(first_name);
    }
    public void setLastNameField(String last_name){
        lastNameField.sendKeys(last_name);
    }
    public void setEmailAddressField(String email){
        emailAddressField.sendKeys(email);
    }
    public void setPasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void setConfirmPasswordFieldField(String confirmPassword){
        confirmPasswordField.sendKeys(confirmPassword);
    }
    public void clickRegisterButton(){
        registerButton.click();
    }
}
