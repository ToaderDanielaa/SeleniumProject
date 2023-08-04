package Test;

import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class BaseTest {
    protected WebDriver driver;
    protected HomePage homepage;
    protected LoginPage loginPage;
    protected AccountPage accountPage;
    protected RegisterPage registerPage;
    protected LogoutPage logoutPage;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        registerPage=new RegisterPage(driver);
        logoutPage=new LogoutPage(driver);
        homepage.open();
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}
