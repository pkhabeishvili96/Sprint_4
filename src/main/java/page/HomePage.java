package page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static page.Constants.*;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Кнопка "Заказать" вверху страницы
    public static By buttonOrder1 = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    // Кнопка "Заказать" внизу страницы
    public static By buttonOrder2 = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Сколько это стоит? И как оплатить?"
    public static By arrow1 = By.id("accordion__heading-0");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Хочу сразу несколько самокатов! Так можно?"
    public static By arrow2 = By.id("accordion__heading-1");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Как рассчитывается время аренды?"
    public static By arrow3 = By.id("accordion__heading-2");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Можно ли заказать самокат прямо на сегодня?"
    public static By arrow4 = By.id("accordion__heading-3");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Можно ли продлить заказ или вернуть самокат раньше?"
    public static By arrow5 = By.id("accordion__heading-4");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Вы привозите зарядку вместе с самокатом?"
    public static By arrow6 = By.id("accordion__heading-5");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Можно ли отменить заказ?"
    public static By arrow7 = By.id("accordion__heading-6");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Я жизу за МКАДом, привезёте?"
    public static By arrow8 = By.id("accordion__heading-7");

    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Сколько это стоит? И как оплатить?"
    public static By text1 = By.xpath(".//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Хочу сразу несколько самокатов! Так можно?"
    public static By text2 = By.xpath(".//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Как рассчитывается время аренды?"
    public static By text3 = By.xpath(".//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Можно ли заказать самокат прямо на сегодня?"
    public static By text4 = By.xpath(".//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Можно ли продлить заказ или вернуть самокат раньше?"
    public static By text5 = By.xpath(".//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Вы привозите зарядку вместе с самокатом?"
    public static By text6 = By.xpath(".//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Можно ли отменить заказ?"
    public static By text7 = By.xpath(".//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Я жизу за МКАДом, привезёте?"
    public static By text8 = By.xpath(".//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");

    public void openHomePage() {
        driver.get(URL);
    }

    public void clickArrow(By arrow) {
        WebElement arrowElement = driver.findElement(arrow);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arrowElement);
        driver.findElement(arrow).click();
    }

    public WebElement getText(By text) {
        return driver.findElement(text);
    }

    public void clickButtonOrder(By button) {
        WebElement buttonOrderElement = driver.findElement(button);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonOrderElement);
        driver.findElement(button).click();
    }
}
