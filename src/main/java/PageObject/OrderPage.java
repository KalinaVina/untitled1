package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    private By vzakaz = By.xpath("//span[text()='В заказ']"); //перейти в заказа кнопка
    private By numOrder = By.xpath("//a[@href='/Profile/Order/00006317-0000-0000-6481-2e0000000000']"); // перейти заказа через номер заказа
    private By repeatOrder = By.xpath("//div[@class='repeat-order']"); //повторить заказа на странице заказа
    private By addOrder = By.xpath("//a[@class='but_form btn btn-g']{2}");




    public void orders(){
        driver.findElement(inputEmail).sendKeys("romanova_lv80@mail.ru"); //заполнение логина
        driver.findElement(inputPass).sendKeys("123456"); // заполнение пароля
        driver.findElement(buttonVhod).click(); //клик вход
        driver.findElement(cookies).click(); // клик по кнопке куков
        driver.findElement(myOrders).click(); //переход в раздел мои заказы
        driver.findElement(inputNumOrder).sendKeys("3104010504"); // заполнение поле поиска заказа(валид значение)
        driver.findElement(buttomSearch).click(); // кнопочка поиска(можно enter вставить)
//        driver.findElement(numOrder).click(); //переход в сам заказа
//        driver.findElement(repeatOrder).click();
//        driver.findElement(addOrder).sendKeys(Keys.ENTER);
        driver.findElement(myOrders).click();  //переход обратно в мои заказа
        driver.findElement(onlyCorrection).click(); //кликнуть чекбокс
        driver.findElement(inputNumOrder).sendKeys("3104070398"+"\n");
        driver.findElement(myOrders).click(); //переход в раздел мои заказы
        driver.findElement(statusList).click(); //выпадающий список статуса заказа
        driver.findElement(sozdan).click(); //кликается по статусу -  создан
        driver.findElement(statusList).click(); // выпадающий список статуса заказа
        driver.findElement(luboi).click(); //выбирается статус "любой" и опять отображается весь список

    }

}
