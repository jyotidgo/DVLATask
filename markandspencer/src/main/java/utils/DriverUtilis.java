package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtilis
{
    public static void navigatetoUrl(String url)
    {
DriverFactory.driver.navigate().to(url);
    }

    public String getPageTitle()
    {
return DriverFactory.driver.getTitle();
    }
    public void waitForElementVisible(By by, long time) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
