package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    private String googleURL = "http://google.com";

    @FindBy(css = "[maxlength]")
    private WebElement googleSearchField;

    @FindBy(xpath = "/html//form[@id='tsf']//div[@class='A8SBwf']/div[@class='FPdoLc tfB0Bf']/center/input[@name='btnK']")
    private WebElement doSearchButton;

    @FindBy(xpath = "/html//img[@id='hplogo']")
    private WebElement googleLogo;

    public GoogleSearchPage inputSearch(String searchFor) {
        googleSearchField.sendKeys(searchFor);
        return this;
    }

    public GoogleSearchResultPage doSearch() {
        googleLogo.click();
        doSearchButton.click();
        return new GoogleSearchResultPage(driver);
    }

    public GoogleSearchPage openWebPage() {
        driver.get(googleURL);
        return this;
    }
}
