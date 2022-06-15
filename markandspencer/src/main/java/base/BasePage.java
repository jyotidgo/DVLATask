package base;

import pageObject.HomePage;
import pageObject.MarkAndSpencerHomePage;
import utils.DriverFactory;
import utils.DriverUtilis;

public class BasePage {


    public static HomePage homePage;
    public static DriverUtilis driverUtilis;
    public static MarkAndSpencerHomePage markAndSpencerHomePage;


    public static void initPages()
    {
homePage = new HomePage(DriverFactory.driver);
driverUtilis = new DriverUtilis();
markAndSpencerHomePage = new MarkAndSpencerHomePage(DriverFactory.driver);

    }
}
