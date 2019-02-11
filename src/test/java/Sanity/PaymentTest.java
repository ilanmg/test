package Sanity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.PricingModal;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

import java.util.concurrent.TimeUnit;

import static selenium.utils.annotations.browser.Browsers.*;
import static selenium.utils.browser.Screen.XLARGE;

//import selenium.pageobjects.Common.PricingPaymentModal;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })


public class PaymentTest extends SeleniumTestWrapper {

    WebDriver driver = getDriver();

    StartPage startPage = PageFactory.initElements(driver, StartPage.class);
    SiteHeader siteHeader = PageFactory.initElements(driver, SiteHeader.class);
    PricingModal pricingModal = PageFactory.initElements(driver, PricingModal.class);  

    @BeforeTest
    public void setup() throws InterruptedException { 
        startPage.open();
     }

   
	@Test(groups ={"Artlist"}, description = "this test should enter a valid card and should be succeeded")
    public void PaymentTestSuccess() throws InterruptedException {

        siteHeader.clickOnPricingBtn();
        Thread.sleep(5000);
        pricingModal.clickSubscribeNow();
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        pricingModal.clickVisaRadioBtn();
        
        pricingModal.switchToVisaIframe();
       
        pricingModal.setVisaCardNumber("4263982640269299");
        driver.switchTo().defaultContent();
        
        
       pricingModal.switchToMonthYearIframe();
      
       
       pricingModal.setVisaMonth("04");
       pricingModal.setVisaYear("23");
       driver.switchTo().defaultContent();
     
       
       pricingModal.switchToCVVIframe();
       pricingModal.setCVVnumber("837");
       
  
       driver.switchTo().defaultContent();
       
       pricingModal.setCardHolderName("ilan amgar");
        
        Thread.sleep(3000);
             
       pricingModal.clickLastStepToSubscribe();
       //Assert.assertEquals(true, siteHeader.getLicenseBtn());
       
    }
}

