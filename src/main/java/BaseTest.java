import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class BaseTest {
   public WebDriver driver=new ChromeDriver();

    @Before
    public void initialize(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver.get("http://qa3magento.dev.evozon.com/");
        driver.manage().window().maximize();

    }
    @After
    public void close(){
        driver.close();
    }
}
