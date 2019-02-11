package selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.After;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import selenium.configurations.TestConfig;
import selenium.driver.WebDriverConfig;
import selenium.utils.WebDriverProvider;
import selenium.utils.annotations.DisableCookies;
import selenium.utils.annotations.RepeatRule;
import selenium.utils.annotations.UserAgent;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;


public abstract class SeleniumTestWrapper<WinHandle> {

    // Config
    protected static final TestConfig testConfig = new TestConfig();
    private final WebDriverConfig webDriverConfig = new WebDriverConfig();
    protected final WebDriverProvider webDriverProvider = new WebDriverProvider(this.webDriverConfig);

    @Rule
    public RepeatRule repeatRule = new RepeatRule();
    private Object driver;

    protected WebDriver getDriver() {
        return this.webDriverProvider.getDriver(); 
    }

    //protected void maximize() {
       // this.getDriver().manage().window().maximize();
  //  }

    /**
     * test class annotations
     */
    @BeforeMethod
    public void setUserAgent() {

        UserAgent userAgent = this.getClass().getAnnotation(UserAgent.class);
        if (userAgent != null) {
            webDriverProvider.useUserAgent(userAgent.value());
        }
    }

    public void switchWindowHandeler(String winHandle) {
        this.getDriver().switchTo().window(winHandle);
    }

    @BeforeMethod
    public void disableCookies() {
        DisableCookies cookies = this.getClass().getAnnotation(DisableCookies.class);
        if (cookies != null) {
            webDriverProvider.disableCookies(true);
        }
    }

    @BeforeMethod
    public void browser() throws Exception {
        Browser browser = this.getClass().getAnnotation(Browser.class);
        if (browser != null) {
            if (browser.require().length > 0 && browser.skip().length == 0) {
                String browsers = concatinateBrowsers(browser.require());
                assumeTrue("only execute test against " + browsers, browsers.contains(testConfig.getBrowser()));
            }

            if (browser.skip().length > 0 && browser.require().length == 0) {
                String browsers = concatinateBrowsers(browser.skip());
                assumeFalse("skip test against " + browsers, browsers.contains(testConfig.getBrowser()));
            }
        }
    }

    private String concatinateBrowsers(Browsers[] browsers) {
        String concatinatedBrowsers = "";
        for (Browsers browser : browsers) concatinatedBrowsers += browser.getValue() + " & ";
        return concatinatedBrowsers.substring(0, concatinatedBrowsers.lastIndexOf("&"));
    }

    @BeforeMethod
    public void browserDimension() {
        BrowserDimension browserDimension = this.getClass().getAnnotation(BrowserDimension.class);
        if (browserDimension != null) {
            getDriver().manage().window().setSize(browserDimension.value().dimension);
        }
    }
   // @AfterMethod
   // public void teardown() {
      //  if (driver != null) {
      //  	getDriver().quit();
       // }
  //  }

    

    @AfterMethod
      public void closeBrowser() {
        getDriver().quit();
    }
    
    public void closeBrowserAfterClass() {
        System.out.println("after Class: closeBrowserAfterClass");
        if (getDriver() != null) {
            getDriver().quit();
        }
   }

    @AfterMethod
    public void cleanup() {
        getDriver().quit();
    }
 
    
}
