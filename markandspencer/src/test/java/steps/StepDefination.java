package steps;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utils.DriverFactory;

public class StepDefination {
    @Given("iam on google HomePage")
    public void iam_on_google_home_page() {
        BasePage.driverUtilis.navigatetoUrl(DriverFactory.prop.getProperty("Url"));
        BasePage.homePage.clickonAgreeBtn();

    }
    @When("i enter MarkandSpencer and click on googleSearch Button")
    public void i_enter_markand_spencer_and_click_on_google_search_button() {
BasePage.homePage.enterGoogleText(DriverFactory.prop.getProperty("SearchText"));
BasePage.homePage.clickonGoogleSearchBtn();

    }
    @When("i click on MarkandSpencer link from search result")
    public void i_click_on_markand_spencer_link_from_search_result() {
BasePage.homePage.MarkandSpencerLink.click();
    }
    @Then("i should to navigated to MarkandSpencer HomePage")
    public void i_should_to_navigated_to_markand_spencer_home_page() {
        String ActualPageTitle = BasePage.driverUtilis.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedMarkandSpencerHomePageTitle"),ActualPageTitle);

    }

    @When("i click on search text box and enter flowers")
    public void iClickOnSearchTextBoxAndEnterFlowers() {
        BasePage.driverUtilis.waitForElementVisible(By.id("navigation-dummySearch"),30);
        BasePage.markAndSpencerHomePage.clickMandSText();
        BasePage.markAndSpencerHomePage.enterSearchText(DriverFactory.prop.getProperty("MarkandSpencerSearch"));
    }

    @And("Click on Search icon")
    public void clickOnSearchIcon() {
        BasePage.markAndSpencerHomePage.clickonSearchIcon();
    }
}
