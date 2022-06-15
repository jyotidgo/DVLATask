package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage

{
    WebDriver driver;
@FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement googleSearchTextBox;
    @FindBy(id="L2AGLb")
    public WebElement IagreeButton;

@FindBy(xpath = "(//input[@value='Google Search'])[1]")
public WebElement googleSearchButton;

@FindBy(partialLinkText= "Welcome")
public WebElement MarkandSpencerLink;

    public HomePage( WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }


    public void clickonAgreeBtn(){
        IagreeButton.click();

    }
public void enterGoogleText(String text)
{
googleSearchTextBox.sendKeys(text);
}
public void clickonGoogleSearchBtn()
{
    googleSearchButton.submit();
}
public void clickonMarkandSpencerlink()
{
    MarkandSpencerLink.click();
}
}
