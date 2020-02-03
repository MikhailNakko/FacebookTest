package PageObjects;

import Helpers.DriverManager;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public WebDriver driver = getDriver();

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public abstract BasePage openWebPage();

    public static WebDriver getDriver(){
        return DriverManager.getChromeDriver();
    }

}
