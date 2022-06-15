package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarkAndSpencerHomePage {
    WebDriver driver;
    @FindBy(id = "navigation-dummySearch")
    public WebElement MandSTextBox;

@FindBy(id = "navigation-dummySearch")
public WebElement MarandSpencersearchBox;

@FindBy(className = "navigation-search-bar--submit   navigation-btn__blackicon--search")
public WebElement searchIcon;




    public MarkAndSpencerHomePage( WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }
public void clickMandSText()
{
    MandSTextBox.click();
}
    public void enterSearchText(String text)
    {
        MarandSpencersearchBox.sendKeys(text);
    }
    public void clickonSearchIcon()
    {
        searchIcon.submit();
    }
}
