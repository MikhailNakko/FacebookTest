import PageObjects.BasePage;
import PageObjects.FaceBookSignUpAndLoginPage;
import PageObjects.GoogleSearchPage;
import PageObjects.GoogleSearchResultPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvalidCredentialsTest extends BaseTest {

    @Test
    public void negativeLoginTest() {
        String alertMessageText =
                new GoogleSearchPage(BasePage.getDriver())
                        .openWebPage()
                        .inputSearch("Facebook")
                        .doSearch()
                        .goToFacebookPage()
                        .logIn("veryverybademail", "badpass")
                        .getAlertText();
        Assert.assertEquals("The email or phone number you’ve entered doesn’t match any account. " +
                "Sign up for an account.", alertMessageText);
    }


}
