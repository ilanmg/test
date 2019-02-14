package Sanity;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.LoginPage;
import selenium.pageobjects.Common.SearchHeader;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

import static selenium.utils.annotations.browser.Browsers.*;
import static selenium.utils.browser.Screen.XLARGE;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })


public class ArtlistSearch extends SeleniumTestWrapper {

    StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
    SearchHeader searchHeader = PageFactory.initElements(getDriver(), SearchHeader.class);
    SiteHeader siteHeader = PageFactory.initElements(getDriver(), SiteHeader.class);
    LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);

    @BeforeTest
    public void setup() { 
        startPage.open(); 
    }

    @Test(groups ={"sanity"},  description= "the script is searching for a letter, then picks up the first result")
    public void search() throws InterruptedException {
    	
        searchHeader.clickTriggerIcon();
        searchHeader.clickSearchIcon().sendKeys("b");
        searchHeader.clickFirstResult();
        Thread.sleep(2000);
        searchHeader.removeResult();
        Thread.sleep(2000);
        Assert.assertEquals(true, siteHeader.startBtnIsDisplayed());
    }
}