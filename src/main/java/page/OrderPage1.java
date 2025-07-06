package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage1 {

    private WebDriver driver;

    public OrderPage1(WebDriver driver) {
        this.driver = driver;
    }

    // Заголовок формы заказа "Для кого самокат"
    private By heading = By.xpath(".//div[@class='Order_Header__BZXOb']");
    // Форма заказа "Для кого самокат": поле "*Имя"
    private By inputName = By.xpath(".//input[@placeholder='* Имя']");
    // Форма заказа "Для кого самокат": поле "*Фамилия"
    private By inputLastName = By.xpath(".//input[@placeholder='* Фамилия']");
    // Форма заказа "Для кого самокат": поле "*Адрес: куда привезти заказ"
    private By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Форма заказа "Для кого самокат": поле "*Станция метро"
    private By inputMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");
    // Форма заказа "Для кого самокат": поле "*Станция метро" - выпадающий список
    private By dropDownListMetroStation = By.xpath(".//div[@class='select-search__select']");
    // Форма заказа "Для кого самокат": поле "*Телефон: на него позвонит курьер"
    private By inputPhoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Форма заказа "Для кого самокат": кнопка "Далее"
    private By buttonNext = By.xpath(".//button[text()='Далее']");

    public WebElement getHeading() {
        return driver.findElement(heading);
    }

    public void clickInputName() {
        driver.findElement(inputName).click();
    }

    public void clickInputLastName() {
        driver.findElement(inputLastName).click();
    }

    public void clickInputAddress() {
        driver.findElement(inputAddress).click();
    }

    public void clickInputMetroStation() {
        driver.findElement(inputMetroStation).click();
    }

    public void clickDropDownListMetroStation() {
        driver.findElement(dropDownListMetroStation).click();
    }

    public void clickInputPhoneNumber() {
        driver.findElement(inputPhoneNumber).click();
    }

    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }

    public void enterInputName(String name) {
        driver.findElement(inputName).sendKeys(name);
    }

    public void enterInputLastName(String lastName) {
        driver.findElement(inputLastName).sendKeys(lastName);
    }

    public void enterInputAddress(String address) {
        driver.findElement(inputAddress).sendKeys(address);
    }

    public void enterInputMetroStation(String metroStation) {
        driver.findElement(inputMetroStation).sendKeys(metroStation);
    }

    public void enterInputPhoneNumber(String phoneNumber) {
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
    }
}