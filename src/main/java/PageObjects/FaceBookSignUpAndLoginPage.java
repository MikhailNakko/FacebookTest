package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaceBookSignUpAndLoginPage extends BasePage {
    public FaceBookSignUpAndLoginPage(WebDriver driver) {
        super(driver);
    }

    public BasePage openWebPage() {
        return null;
    }

    @FindBy(id = "email")
    private WebElement emailLoginField;

    private WebElement pass;

    public FacebookLoginPage logIn(String email, String password){
        emailLoginField.sendKeys(email);
        pass.sendKeys(password);
        pass.submit();
        return new FacebookLoginPage(driver);
    }

}
