import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderPageTest extends BaseTest{

    private final By button;
    private final String name;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String phoneNumber;
    private final String date;
    private final String comment;

    public OrderPageTest(By button, String name, String lastName, String address, String metroStation, String phoneNumber, String date, String comment) {
        this.button  = button;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getPersonalData() {
        return new Object[][]{
                {By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']"), "Мария", "Брошкина", "ул. Морковок", "Сокол", "12345678911", "05.08.2025", "Привезите самый быстрый!"},
                {By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']"), "Иван", "Расческин", "ул. Помидорок", "Рижская", "82345678911", "09.10.2026", "Привезите самый медленный!"},
        };
    }

    @Test
    public void orderTest() {
        homePage.openHomePage();
        homePage.clickButtonOrder(button);
        orderPage1.enterInputName(name);
        orderPage1.clickInputLastName(lastName);
        orderPage1.clickInputAddress(address);
        orderPage1.clickInputMetroStation(metroStation);
        orderPage1.clickDropDownListMetroStation();
        orderPage1.clickInputPhoneNumber(phoneNumber);
        orderPage1.clickButtonNext();
        orderPage2.enterInputDate(date);
        orderPage2.clickColourBlack();
        orderPage2.enterInputComment(comment);
        orderPage2.clickInputTerm();
        orderPage2.clickDropDownListTerm();
        orderPage2.clickButtonOrder3();
        popUpOrder.clickButtonYes();
        WebElement popUpElement = popUpOrder.getPopUp();
        assertTrue("Ошибка оформления заказа", popUpElement.isDisplayed());
    }
}