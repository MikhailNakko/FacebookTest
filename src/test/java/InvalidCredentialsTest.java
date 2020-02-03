import PageObjects.BasePage;
import PageObjects.GoogleSearchPage;
import PageObjects.GoogleSearchResultPage;
import org.junit.Before;
import org.junit.Test;

public class InvalidCredentialsTest {

    @Test
    public void negativeLoginTest() {
        new GoogleSearchPage(BasePage.getDriver())
                .openWebPage()
                .inputSearch("Facebook")
                .doSearch();
        new GoogleSearchResultPage(BasePage.getDriver())
                .goToFacebookPage();

    }
}
