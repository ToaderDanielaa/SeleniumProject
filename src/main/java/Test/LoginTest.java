package Test;

import org.junit.Assert;
import org.junit.Test;
import Utils.Constants;


public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertEquals("Hello, " + Constants.USER_NAME + "!", accountPage.getWelcomeText());

    }
}
