import PageObjects.BasePage;
import org.junit.Before;

public class BaseTest {
    @Before
    public void driverSetup(){
        BasePage.getDriver();
    }
}
