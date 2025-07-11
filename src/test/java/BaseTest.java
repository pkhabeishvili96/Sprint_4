import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

public class BaseTest {
    WebDriver driver;
    HomePage homePage;
    OrderPage1 orderPage1;
    OrderPage2 orderPage2;
    PopUpOrder popUpOrder;
    Constants constants;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        orderPage1 = new OrderPage1(driver);
        orderPage2 = new OrderPage2(driver);
        popUpOrder = new PopUpOrder(driver);
        constants = new Constants(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}