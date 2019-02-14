package ArtlistRegression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.LoginPage;
import selenium.pageobjects.Common.Modals;
import selenium.pageobjects.Common.SearchHeader;
import selenium.pageobjects.StartPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

import static selenium.utils.annotations.browser.Browsers.*;
import static selenium.utils.browser.Screen.XLARGE;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })
public class searchEndsUpOnArtlistPageTest extends SeleniumTestWrapper {

    StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
    LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    Modals modals = PageFactory.initElements(getDriver(), Modals.class);
    SearchHeader SearchHeader = PageFactory.initElements(getDriver(), SearchHeader.class); 

    @BeforeTest
    public void setup() {
        startPage.open(); 
    }

    @Test(groups ={"Artlist"},  description= "the script is searching for certain artist and then taks the user into the artists page")
    public void search() throws InterruptedException {
    	
        SearchHeader.clickTriggerIcon();
        SearchHeader.clickSearchIcon().sendKeys("ian post");
        Thread.sleep(5000); 
        SearchHeader.clickResultToGetArtlistPage();
        //Assert.assertEquals(false, SearchHeader.GetArtlistPageIsDisplayed()); 
       
 
    }
}
