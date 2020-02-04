package Helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    public static WebDriverWait wait = new WebDriverWait(DriverManager.getChromeDriver(), 10, 2000);

    public static void waitUntilElementIsVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilAlertIsPresent() {
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
