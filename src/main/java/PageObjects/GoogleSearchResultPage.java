package PageObjects;

import Helpers.Waiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResultPage extends BasePage{


    public GoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public BasePage openWebPage() {
        return null;
    }

    @FindBy(xpath = "/html//div[@id='rso']/div[1]/div[@class='g']//a[@href='https://www.facebook.com/']")
    private WebElement facebookLink;

    public FaceBookSignUpAndLoginPage goToFacebookPage(){
        facebookLink.click();
        return new FaceBookSignUpAndLoginPage(driver);
    }
}
