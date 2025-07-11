package page;
import org.openqa.selenium.WebDriver;

public class Constants {

    private WebDriver driver;

    public Constants(WebDriver driver) {
        this.driver = driver;
    }

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
}
