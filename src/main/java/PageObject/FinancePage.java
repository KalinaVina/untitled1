package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinancePage {
    private final WebDriver driver;
    public FinancePage(WebDriver driver) {
        this.driver=driver;
    }
    private By inputEmail = By.xpath("//*[@id='Email']"); //поле ввода логина
    private By inputPass = By.xpath("//*[@id='js-password']"); //поле ввода пароля
    private By buttonVhod = By.xpath("//*[@id='btnLogin']"); //кнопка входа
    private By cookies = By.xpath("//*[@id='saveGotCookieWarning']"); //кнопка куков
    private By financePag = By.xpath("//a[@href='/Profile/Finance']"); // кнопка раздела финансы

    public void finance(){
        driver.findElement(inputEmail).sendKeys("romanova_lv80@mail.ru"); //заполнение логина
        driver.findElement(inputPass).sendKeys("123456"); // заполнение пароля
        driver.findElement(buttonVhod).click(); //клик вход
        driver.findElement(cookies).click(); // клик по кнопке куков
        driver.findElement(financePag).click(); // переход в раздел мои финансы

    }



}
