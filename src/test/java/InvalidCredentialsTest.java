import PageObjects.BasePage;
import PageObjects.FaceBookSignUpAndLoginPage;
import PageObjects.GoogleSearchPage;
import PageObjects.GoogleSearchResultPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Assert.assertEquals("The email or phone number you’ve entered doesn’t match any account. Sign up for an account.", alertMessageText);
    }

}
