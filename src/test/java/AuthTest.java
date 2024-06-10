import PageObject.FinancePage;
import PageObject.OrderPage;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.After;
import org.junit.Test;
import  org.junit.Before;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AuthTest {
     WebDriver driver;


    // предусловия выполняется перед каждым тестом:
    // открывает хром/ оптимизирует размер окна/ожидание
    @Before
    public void setUp(){
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    // первый тест авторизует клиента/принимает куки/переход в мои заказы/проверка по основным фильтрам
    @Test
    public void firstTest() { //тест мои заказы
        driver.get("https://lk.ews.ru/");
        OrderPage orderPage=new OrderPage(driver);
        orderPage.orders();
    }
    //второй тест авторизует клиента/принимает куки/переходит в раздел финансы/
    @Test
    public void secondTest(){ //тест финансы
        driver.get("https://lk.ews.ru/");
        FinancePage financePage=new FinancePage(driver);
        financePage.finance();
    }


    //постусловие -  после каждого теста закрывает хром
    @After
    public void tearDown()
    {
    driver.quit();
    }

}
