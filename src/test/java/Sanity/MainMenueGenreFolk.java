package Sanity;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.MainMenue;
import selenium.pageobjects.StartPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

import static selenium.utils.annotations.browser.Browsers.*;
import static selenium.utils.browser.Screen.XLARGE;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })
public class MainMenueGenreFolk extends SeleniumTestWrapper {

    StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
    MainMenue mainMenue = PageFactory.initElements(getDriver(), MainMenue.class); 
    
    @BeforeTest
    public void setup() {
        startPage.open();   
    }
    
    @Test(groups ={"Artlist"}, description= "the script should click main menue Genre Folk")
    public void MainMenueGenreFolk() throws InterruptedException {

        mainMenue.clickOnmainMenuGenre();
        Thread.sleep(2000);
        mainMenue.clickOnmainMenuGenreFolk();
        Thread.sleep(2000);
        mainMenue.closeMainMenueInput();
    }
}
