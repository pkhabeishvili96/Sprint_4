package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpOrder {
    private WebDriver driver;

    public PopUpOrder(WebDriver driver) {
        this.driver = driver;
    }

    // Всплывающее окно "Хотите оформить заказ?": кнопка "Да"
    private By buttonYes = By.xpath(".//button[text()='Да']");

    // Всплывающее окно "Заказ оформлен"
    private By popUp = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

    public WebElement getPopUp() {
        return driver.findElement(popUp);
    }

    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }
}
