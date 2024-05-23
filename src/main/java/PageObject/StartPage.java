package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {
    private final WebDriver driver;
    public StartPage(WebDriver driver) {
        this.driver=driver;
    }

    private By inputEmail = By.xpath("//*[@id='Email']");
    private By inputPass = By.xpath("//*[@id='js-password']");
    private By buttonVhod = By.xpath("//*[@id='btnLogin']");

    public void auth(){
        driver.findElement(inputEmail).sendKeys("login");
        driver.findElement(inputPass).sendKeys("pass");
        driver.findElement(buttonVhod).click();
    }

}
