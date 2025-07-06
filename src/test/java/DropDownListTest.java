import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

public class DropDownListTest extends BaseTest {

    @Test
    public void openDropDownListTest1() {
        homePage.openHomePage();
        WebElement arrowElement1 = homePage.getArrow1();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arrowElement1);
        homePage.clickArrow1();
        WebElement textElement1 = homePage.getText1();
        assertTrue("Соответствующий текст-1 не открывается", textElement1.isDisplayed());
    }

    @Test
    public void openDropDownListTest2() {
        homePage.openHomePage();
        WebElement arrowElement2 = homePage.getArrow2();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arrowElement2);
        homePage.clickArrow2();
        WebElement textElement2 = homePage.getText2();
        assertTrue("Соответствующий текст-2 не открывается", textElement2.isDisplayed());
    }

    @Test
    public void openDropDownListTest3() {
        homePage.openHomePage();
        WebElement arrowElement3 = homePage.getArrow3();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arrowElement3);
        homePage.clickArrow3();
        WebElement textElement3 = homePage.getText3();
        assertTrue("Соответствующий текст-3 не открывается", textElement3.isDisplayed());
    }

    @Test
    public void openDropDownListTest4() {
        homePage.openHomePage();
        WebElement arrowElement4 = homePage.getArrow4();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arrowElement4);
        homePage.clickArrow4();
        WebElement textElement4 = homePage.getText4();
        assertTrue("Соответствующий текст-4 не открывается", textElement4.isDisplayed());
    }

    @Test
    public void openDropDownListTest5() {
        homePage.openHomePage();
        WebElement arrowElement5 = homePage.getArrow5();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arrowElement5);
        homePage.clickArrow5();
        WebElement textElement5 = homePage.getText5();
        assertTrue("Соответствующий текст-5 не открывается", textElement5.isDisplayed());
    }

    @Test
    public void openDropDownListTest6() {
        homePage.openHomePage();
        WebElement arrowElement6 = homePage.getArrow6();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arrowElement6);
        homePage.clickArrow6();
        WebElement textElement6 = homePage.getText6();
        assertTrue("Соответствующий текст-6 не открывается", textElement6.isDisplayed());
    }

    @Test
    public void openDropDownListTest7() {
        homePage.openHomePage();
        WebElement arrowElement7 = homePage.getArrow7();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arrowElement7);
        homePage.clickArrow7();
        WebElement textElement7 = homePage.getText7();
        assertTrue("Соответствующий текст-7 не открывается", textElement7.isDisplayed());
    }

    @Test
    public void openDropDownListTest8() {
        homePage.openHomePage();
        WebElement arrowElement8 = homePage.getArrow8();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arrowElement8);
        homePage.clickArrow8();
        WebElement textElement8 = homePage.getText8();
        assertTrue("Соответствующий текст-8 не открывается", textElement8.isDisplayed());
    }
}