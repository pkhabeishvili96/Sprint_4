import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderPageTest extends BaseTest{

    private final String name;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String phoneNumber;
    private final String date;
    private final String comment;

    public OrderPageTest(String name, String lastName, String address, String metroStation, String phoneNumber, String date, String comment) {
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
                {"Мария", "Брошкина", "ул. Морковок", "Сокол", "12345678911", "05.08.2025", "Привезите самый быстрый!"},
                {"Иван", "Расческин", "ул. Помидорок", "Рижская", "82345678911", "09.10.2026", "Привезите самый медленный!"},
        };
    }

    @Test
    public void orderTest() {
        homePage.openHomePage();
        homePage.clickButtonOrder1();
        orderPage1.clickInputName();
        orderPage1.enterInputName(name);
        orderPage1.clickInputLastName();
        orderPage1.enterInputLastName(lastName);
        orderPage1.clickInputAddress();
        orderPage1.enterInputAddress(address);
        orderPage1.clickInputMetroStation();
        orderPage1.enterInputMetroStation(metroStation);
        orderPage1.clickDropDownListMetroStation();
        orderPage1.clickInputPhoneNumber();
        orderPage1.enterInputPhoneNumber(phoneNumber);
        orderPage1.clickButtonNext();
        orderPage2.clickInputDate();
        orderPage2.enterInputDate(date);
        orderPage2.clickColourBlack();
        orderPage2.clickInputComment();
        orderPage2.enterInputComment(comment);
        orderPage2.clickInputTerm();
        orderPage2.clickDropDownListTerm();
        orderPage2.clickButtonOrder3();
        popUpOrder.clickButtonYes();
        WebElement popUpElement = popUpSuccessfulOrder.getPopUp();
        assertTrue("Ошибка оформления заказа", popUpElement.isDisplayed());
    }
}