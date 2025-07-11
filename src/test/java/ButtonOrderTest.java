import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
import static page.HomePage.*;

@RunWith(Parameterized.class)
public class ButtonOrderTest extends BaseTest {

    private final By button;

    public ButtonOrderTest(By button){
        this.button = button;
    }

    @Parameterized.Parameters
    public static Object[][] getButtonOrder() {
        return new Object[][]{
                {buttonOrder1},
                {buttonOrder2},
        };
    }

    @Test
    public void buttonOrderTest() {
        homePage.openHomePage();
        homePage.clickButtonOrder(button);
        WebElement headingElement = orderPage1.getHeading();
        assertTrue("Форма заказа не отображается", headingElement.isDisplayed());
    }
}
