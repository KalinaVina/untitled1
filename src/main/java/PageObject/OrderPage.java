package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.ENTER;


public class OrderPage {   //страница авторизации(Входа)
    private final WebDriver driver;
    public OrderPage(WebDriver driver) {
        this.driver=driver;
    }

    private By inputEmail = By.xpath("//*[@id='Email']"); //поле ввода логина
    private By inputPass = By.xpath("//*[@id='js-password']"); //поле ввода пароля
    private By buttonVhod = By.xpath("//*[@id='btnLogin']"); //кнопка входа
    private By cookies = By.xpath("//*[@id='saveGotCookieWarning']"); //кнопка куков
    private By myOrders = By.xpath("//a[@href='/Profile/Orders']"); //кнопка мои заказы (надо будет поменять на уникальный локатор)
    private By inputNumOrder = By.xpath("//*[@id='search-pl']"); //поле ввода номера заказа
    private By buttomSearch = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[1]/button/img"); //кнопочка поиска
    private  By onlyCorrection = By.xpath("//label[@for='correction-only']"); //только корректирующие заказы
    private By statusList = By.xpath("//div[@class='nice-select']"); //выпадающий список - статусов доставки
    private By sozdan = By.xpath("//li[@data-value='1']"); //статус - создан
    private By luboi = By.xpath("//li[text()='Любой']"); // статус любой




    public void orders(){
        driver.findElement(inputEmail).sendKeys("romanova_lv80@mail.ru"); //заполнение логина
        driver.findElement(inputPass).sendKeys("123456"); // заполнение пароля
        driver.findElement(buttonVhod).click(); //клик вход
        driver.findElement(cookies).click(); // клик по кнопке куков
        driver.findElement(myOrders).click(); //переход в раздел мои заказы
        driver.findElement(inputNumOrder).sendKeys("3104010504"); // заполнение поле поиска заказа(валид значение)
        driver.findElement(buttomSearch).click(); // кнопочка поиска(можно enter вставить)
        driver.findElement(myOrders).click();  //переход обратно в мои заказа
        driver.findElement(inputNumOrder).clear(); // очистить поле поиска
        driver.findElement(buttomSearch).click(); // кнопка найти(или enter)
        driver.findElement(onlyCorrection).click(); //кликнуть чекбокс
        driver.findElement(buttomSearch).click(); //кнопка найти
        driver.findElement(onlyCorrection).click(); //очистить чекбокс
        driver.findElement(buttomSearch).click();//кнопка найти
        driver.findElement(statusList).click(); //выпадающий список статуса заказа
        driver.findElement(sozdan).click(); //кликается по статусу -  создан
        driver.findElement(statusList).click(); // выпадающий список статуса заказа
        driver.findElement(luboi).click(); //выбирается статус "любой" и опять отображается весь список

    }

}
