package Test;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Before
    public void navigateToRegisterPage(){
        homepage.clickAccountLink();
        homepage.clickRegisterLink();
    }

    @Test
    public void validRegisterTest(){
    Faker faker= new Faker();
    String firstName=faker.name().firstName();
    String lastName=faker.name().lastName();
    String email=faker.internet().emailAddress();
    String password=faker.internet().password();

    registerPage.setFirstNameField(firstName);
    registerPage.setLastNameField(lastName);
    registerPage.setEmailAddressField(email);
    registerPage.setPasswordField(password);
    registerPage.setConfirmPasswordFieldField(password);
    registerPage.clickRegisterButton();
    Assert.assertEquals("Hello, "+ firstName+" "+lastName+"!",accountPage.getWelcomeText());
    }

}
