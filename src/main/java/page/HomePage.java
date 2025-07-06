package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Кнопка "Заказать" вверху страницы
    private By buttonOrder1 = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    // Кнопка "Заказать" внизу страницы
    private By buttonOrder2 = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Сколько это стоит? И как оплатить?"
    private By arrow1 = By.id("accordion__heading-0");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Хочу сразу несколько самокатов! Так можно?"
    private By arrow2 = By.id("accordion__heading-1");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Как рассчитывается время аренды?"
    private By arrow3 = By.id("accordion__heading-2");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Можно ли заказать самокат прямо на сегодня?"
    private By arrow4 = By.id("accordion__heading-3");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Можно ли продлить заказ или вернуть самокат раньше?"
    private By arrow5 = By.id("accordion__heading-4");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Вы привозите зарядку вместе с самокатом?"
    private By arrow6 = By.id("accordion__heading-5");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Можно ли отменить заказ?"
    private By arrow7 = By.id("accordion__heading-6");
    // Выпадающий список в разделе "Вопросы о важном": стрелочка "Я жизу за МКАДом, привезёте?"
    private By arrow8 = By.id("accordion__heading-7");

    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Сколько это стоит? И как оплатить?"
    private By text1 = By.xpath(".//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Хочу сразу несколько самокатов! Так можно?"
    private By text2 = By.xpath(".//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Как рассчитывается время аренды?"
    private By text3 = By.xpath(".//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Можно ли заказать самокат прямо на сегодня?"
    private By text4 = By.xpath(".//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Можно ли продлить заказ или вернуть самокат раньше?"
    private By text5 = By.xpath(".//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Вы привозите зарядку вместе с самокатом?"
    private By text6 = By.xpath(".//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Можно ли отменить заказ?"
    private By text7 = By.xpath(".//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    // Выпадающий список в разделе "Вопросы о важном": текст стрелочки "Я жизу за МКАДом, привезёте?"
    private By text8 = By.xpath(".//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");

    public void openHomePage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public WebElement getArrow1() {
        return driver.findElement(arrow1);
    }

    public void clickArrow1() {
        driver.findElement(arrow1).click();
    }

    public WebElement getText1() {
        return driver.findElement(text1);
    }

    public WebElement getArrow2() {
        return driver.findElement(arrow2);
    }

    public void clickArrow2() {
        driver.findElement(arrow2).click();
    }

    public WebElement getText2() {
        return driver.findElement(text2);
    }

    public WebElement getArrow3() {
        return driver.findElement(arrow3);
    }

    public void clickArrow3() {
        driver.findElement(arrow3).click();
    }

    public WebElement getText3() {
        return driver.findElement(text3);
    }

    public WebElement getArrow4() {
        return driver.findElement(arrow4);
    }

    public void clickArrow4() {
        driver.findElement(arrow4).click();
    }

    public WebElement getText4() {
        return driver.findElement(text4);
    }

    public WebElement getArrow5() {
        return driver.findElement(arrow5);
    }

    public void clickArrow5() {
        driver.findElement(arrow5).click();
    }

    public WebElement getText5() {
        return driver.findElement(text5);
    }

    public WebElement getArrow6() {
        return driver.findElement(arrow6);
    }

    public void clickArrow6() {
        driver.findElement(arrow6).click();
    }

    public WebElement getText6() {
        return driver.findElement(text6);
    }

    public WebElement getArrow7() {
        return driver.findElement(arrow7);
    }

    public void clickArrow7() {
        driver.findElement(arrow7).click();
    }

    public WebElement getText7() {
        return driver.findElement(text7);
    }

    public WebElement getArrow8() {
        return driver.findElement(arrow8);
    }

    public void clickArrow8() {
        driver.findElement(arrow8).click();
    }

    public WebElement getText8() {
        return driver.findElement(text8);
    }

    public void clickButtonOrder1() {
        driver.findElement(buttonOrder1).click();
    }

    public void clickButtonOrder2() {
        driver.findElement(buttonOrder2).click();
    }

    public WebElement getButtonOrder2() {
        return driver.findElement(buttonOrder2);
    }
}
