import Helpers.DriverManager;
import PageObjects.BasePage;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    @After
    public void closeChrome(){
        DriverManager.killDriver();
    }
}
