import PageObject.StartPage;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Test;
import  org.junit.Before;
import  org.junit.After;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;

public class AuthTest {
     WebDriver driver;


    @Before
    public void setUp(){
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://lk.ews.ru/");
    }
    @Test
    public void firstTest(){
        StartPage startPage=new StartPage(driver);
        startPage.auth();

    }

    @After
    public void tearDown()
    {
    driver.quit();
    }

}
