package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpSuccessfulOrder {
    private WebDriver driver;

    public PopUpSuccessfulOrder(WebDriver driver) {
        this.driver = driver;
    }

    // Всплывающее окно "Заказ оформлен"
    private By popUp = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

    public WebElement getPopUp() {
        return driver.findElement(popUp);
    }
}
