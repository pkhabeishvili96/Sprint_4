import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

public class BaseTest {
    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);
    OrderPage1 orderPage1 = new OrderPage1(driver);
    OrderPage2 orderPage2 = new OrderPage2(driver);
    PopUpOrder popUpOrder = new PopUpOrder(driver);
    PopUpSuccessfulOrder popUpSuccessfulOrder = new PopUpSuccessfulOrder(driver);

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}