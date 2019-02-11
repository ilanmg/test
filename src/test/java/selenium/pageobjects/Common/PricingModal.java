package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import selenium.Pages;


public class PricingModal extends Pages {

    public PricingModal(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.price-btn.topsign.trial-pricing-top.for-new")
    private WebElement clickPricingBtn;
    
    @FindBy(css = "#pricing-modal button.pricing-subscribe-now")
    private WebElement subscribeNowBtn;

    @FindBy(css = ".payment-creditcard input[name=\"payMethodJoinUs\"]")
    private WebElement visaRadioBtn;

    @FindBy(css ="#bluesnap-hosted-iframe-ccn")
    private WebElement visaCardIframe;
    
    @FindBy(id ="ccn")
    private WebElement cardHolderNumberinput;
    
    @FindBy(css ="#bluesnap-hosted-iframe-ccn")
    private WebElement visaCardIframeExit;
    
    @FindBy(css = "#bluesnap-hosted-iframe-exp")
    private WebElement monthYearIframe;
           
    @FindBy(css = "#month")
    private WebElement visaMonthInput;

    @FindBy(css = "#year")
    private WebElement visayear;
    
    @FindBy(css ="#bluesnap-hosted-iframe-cvv")
    private WebElement cvvIframe;
    
    @FindBy(css = "#cvv")
    private WebElement setCVVnumber;
    
    @FindBy(css = "input#bluesnap-area-name-JoinUs")//
    private WebElement cardHolderNameinput;

    @FindBy(name=("bluesnap-hosted-iframe-ccn"))
    private WebElement SwitchToIframe;
    
    @FindBy(css = "#btnRegUserFree-JoinUs")
    private WebElement clickLastStepToSubscribe;

  
    
    
    
  
    public WebElement clickOnPricingBtn() {
        waitForElement(clickPricingBtn, 10);
        clickPricingBtn.click();
        return clickPricingBtn;
    }
    
    public WebElement clickSubscribeNow() {
        waitForElement(subscribeNowBtn, 10);
        subscribeNowBtn.click();
        return subscribeNowBtn;
    }
     
    public WebElement clickVisaRadioBtn() {
        waitForElement(visaRadioBtn, 10);
        visaRadioBtn.click();
        return visaRadioBtn;
    }
    public WebElement switchToVisaIframe() {
        waitForElement(visaCardIframe, 30);
        this.driver.switchTo().frame(visaCardIframe);
         return visaCardIframe;
     }
    
    public WebElement setVisaCardNumber(String cardNumber) {
        waitForElement(cardHolderNumberinput, 10);
        cardHolderNumberinput.sendKeys(cardNumber);
        return cardHolderNumberinput;
    }
    
    public WebElement exitVisaIframe() {
        waitForElement(visaCardIframeExit, 10);
        this.driver.switchTo().defaultContent();
         return visaCardIframeExit;
     }
    
    public WebElement switchToMonthYearIframe() {
        waitForElement(monthYearIframe, 10);
        this.driver.switchTo().frame(monthYearIframe);
         return monthYearIframe;
     }
    
    public WebElement setVisaMonth(String MonthNumber) {
        waitForElement(visaMonthInput, 10);
        visaMonthInput.sendKeys(MonthNumber);
        return visaMonthInput;
    }

    public WebElement setVisaYear(String YearNumber) {
        waitForElement(visayear, 10);
        visayear.sendKeys(YearNumber);
        return visayear;
    }
    public WebElement switchToCVVIframe() {
        waitForElement(cvvIframe, 10);
        this.driver.switchTo().frame(cvvIframe);
         return cvvIframe;
     }
      
    public WebElement setCVVnumber(String CVVNumber) {
        waitForElement(setCVVnumber, 10);
        setCVVnumber.sendKeys(CVVNumber);
        return setCVVnumber;
    }
      
    public WebElement setCardHolderName(String holderCard) {
        waitForElement(cardHolderNameinput, 10);
        cardHolderNameinput.sendKeys(holderCard);
        return cardHolderNameinput;
    }

    public WebElement clickLastStepToSubscribe() {
        waitForElement(clickLastStepToSubscribe, 10);
        clickLastStepToSubscribe.click();
        return clickLastStepToSubscribe;
    }

	
}


