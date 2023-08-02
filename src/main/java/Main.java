import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

       // LoginTest loginTest = new LoginTest();
        // loginTest.validLoginTest();
       // RegisterTest registerTest=new RegisterTest();
       // registerTest.validRegisterTest();
       // AddToWishlist addToWishlist=new AddToWishlist();
       // addToWishlist.validAddToWishlist();
        //AddToCompare addToCompare=new AddToCompare();
       // addToCompare.validAddToCompare();
       // AddToCart addToCart=new AddToCart();
       // addToCart.validAddToCart();
       // LogoutTest logoutTest=new LogoutTest();
       // logoutTest.validLogout();
        ChangePassword changePassword=new ChangePassword();
        changePassword.validChangePassword();

    }
}
