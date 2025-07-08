package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage2 {
    private WebDriver driver;

    public OrderPage2(WebDriver driver) {
        this.driver = driver;
    }

    // Форма заказа "Про аренду": поле "*Когда привезти самокат"
    private By inputDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // Форма заказа "Про аренду": поле "*Срок аренды"
    private By inputTerm = By.xpath(".//div[@class='Dropdown-placeholder']");
    // Форма заказа "Про аренду": поле "*Срок аренды" - выпадающий список
    private By dropDownListTerm = By.xpath(".//div[text()='пятеро суток']");
    // Форма заказа "Про аренду": чекбокс "*Цвет самоката" - чёрный жемчуг
    private By colourBlack = By.xpath(".//input[@id='grey']");
    // Форма заказа "Про аренду": поле "*Комментарий для курьера"
    private By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Форма заказа "Про аренду": кнопка "Заказать"
    private By buttonOrder3 = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");

    public void enterInputDate(String date) {
        driver.findElement(inputDate).sendKeys(date);
        driver.findElement(inputDate).click();
    }

    public void clickInputTerm() {
        driver.findElement(inputTerm).click();
    }

    public void clickDropDownListTerm() {
        driver.findElement(dropDownListTerm).click();
    }

    public void clickColourBlack() {
        driver.findElement(colourBlack).click();
    }

    public void enterInputComment(String comment) {
        driver.findElement(inputComment).sendKeys(comment);
        driver.findElement(inputComment).click();
    }

    public void clickButtonOrder3() {
        driver.findElement(buttonOrder3).click();
    }
}