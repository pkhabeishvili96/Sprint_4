import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

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
                {By.id("accordion__heading-0"), By.xpath(".//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']")},
                {By.id("accordion__heading-1"), By.xpath(".//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']")},
                {By.id("accordion__heading-2"), By.xpath(".//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']")},
                {By.id("accordion__heading-3"), By.xpath(".//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']")},
                {By.id("accordion__heading-4"), By.xpath(".//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']")},
                {By.id("accordion__heading-5"), By.xpath(".//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']")},
                {By.id("accordion__heading-6"), By.xpath(".//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']")},
                {By.id("accordion__heading-7"), By.xpath(".//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']")},
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