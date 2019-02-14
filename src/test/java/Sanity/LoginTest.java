package Sanity;

import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.annotations.browser.Browsers.PHANTOMJS;
import static selenium.utils.browser.Screen.XLARGE;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.Common.LoginPage;
import selenium.pageobjects.Common.SiteHeader;

import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })
public class LoginTest extends SeleniumTestWrapper {

	WebDriver driver = getDriver();
    StartPage startPage = PageFactory.initElements(driver, StartPage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    SiteHeader siteHeader = PageFactory.initElements(driver, SiteHeader.class);


    @BeforeTest
    public void setup() throws InterruptedException {
        startPage.open();
    }
    @Test(groups ={"Sanity"}, description= "the script should perform a login by giving the Email, Pass, and click the login button")
    public void log__in() throws InterruptedException {
    	
        loginPage.clickSignInBtn();
        loginPage.setEmail("ilanmg@artlist.io");
        loginPage.setPassword("Tomido1212*");
        loginPage.clickLoginBtn();
        Thread.sleep(5000);
        //Assert.assertEquals(true, siteHeader.getLicenseBtn());
       
    }
}
