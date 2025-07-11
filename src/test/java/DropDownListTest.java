import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
import static page.HomePage.*;

@RunWith(Parameterized.class)
public class DropDownListTest extends BaseTest {

    private final By arrow;
    private final By text;

    public DropDownListTest(By arrow, By text) {
        this.arrow = arrow;
        this.text = text;
    }

    @Parameterized.Parameters
    public static Object[][] getDropDownList() {
        return new Object[][]{
                {arrow1, text1},
                {arrow2, text2},
                {arrow3, text3},
                {arrow4, text4},
                {arrow5, text5},
                {arrow6, text6},
                {arrow7, text7},
                {arrow8, text8},
        };
    }

    @Test
    public void openDropDownListTest() {
        homePage.openHomePage();
        homePage.clickArrow(arrow);
        WebElement textElement = homePage.getText(text);
        assertTrue("Соответствующий текст не открывается", textElement.isDisplayed());
    }
}