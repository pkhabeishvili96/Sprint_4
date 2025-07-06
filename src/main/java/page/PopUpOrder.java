package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpOrder {
    private WebDriver driver;

    public PopUpOrder(WebDriver driver) {
        this.driver = driver;
    }

    // Всплывающее окно "Хотите оформить заказ?": кнопка "Да"
    private By buttonYes = By.xpath(".//button[text()='Да']");

    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }
}
