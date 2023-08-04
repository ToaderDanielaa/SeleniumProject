package Test;

import Utils.Constants;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogoutTest extends BaseTest{
    @Before
    public void navigateToLogin(){
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
    }
    @Test
    public void validLogoutTest(){
        homepage.clickAccountLink();
        homepage.clickLogoutLink();
        Assert.assertEquals("YOU ARE NOW LOGGED OUT", logoutPage.getLogoutMessage());
    }
}
