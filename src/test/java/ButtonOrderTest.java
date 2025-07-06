import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

public class ButtonOrderTest extends BaseTest {

    @Test
    public void buttonOrderTest1() {
        homePage.openHomePage();
        homePage.clickButtonOrder1();
        WebElement headingElement = orderPage1.getHeading();
        assertTrue("Форма заказа не отображается", headingElement.isDisplayed());
    }

    @Test
    public void buttonOrderTest2() {
        homePage.openHomePage();
        WebElement buttonOrderElement = homePage.getButtonOrder2();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonOrderElement);
        homePage.clickButtonOrder2();
        WebElement headingElement = orderPage1.getHeading();
        assertTrue("Форма заказа не отображается", headingElement.isDisplayed());
    }
}
