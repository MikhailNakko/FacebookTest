package PageObjects;

import Helpers.Waiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class FacebookLoginPage extends BasePage{
    public FacebookLoginPage(WebDriver driver) {
        super(driver);
    }

    public BasePage openWebPage() {
        return null;
    }

    @FindBy(css = "div[role='alert']")
    private WebElement wrongCredentialsAlert;

    public String getAlertText(){
        Waiter.waitUntilAlertIsPresent();
        return wrongCredentialsAlert.getText();
    }
}
