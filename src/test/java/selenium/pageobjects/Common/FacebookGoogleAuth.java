package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

import java.util.Set;

public class FacebookGoogleAuth extends Pages {

    public FacebookGoogleAuth (WebDriver driver) {
        super(driver); 
    }

    @FindBy(css = ".card.signin-card")
    private WebElement googleAllreadyAssign;
    
    @FindBy(css = "#header_block")
    private WebElement FaceBookAllreadyAssign;

    //Google incognito
    
    @FindBy(css = "#identifierId")
    private WebElement googleEmailIncognitoInput;
    
    @FindBy(css = "#identifierNext > content > span")
    private WebElement googleNextIncognitoBtn;
    
    @FindBy(xpath = "//input[@name='password']") 
    private WebElement googlePasswordIncognitoInput;
    
    @FindBy(css = "#passwordNext > content > span")
    private WebElement googleLastNextIncognitoBtnInput;

    @FindBy(css = "#passwordNext > content")
    private WebElement clickGoogleOtherAccountIncognitoBtnInput;
    

    //Google
    @FindBy(css = "input[type=\"Email\"]")
    private WebElement googleEmailOrPhoneInput;

    @FindBy(css = "input#next")
    private WebElement googleNextBtn;
   
    @FindBy(xpath ="//*[@id=\"Passwd\"]" )
    private WebElement googlePasswordInput;
    
    @FindBy(css ="#signIn")
    private WebElement googleLoginBtn;


    //Facebook
    @FindBy(css = "#m_login_email")
    private WebElement setFacebookLoginEmail;
    
    @FindBy(css = "#login_form > ul > li:nth-child(2) > div > input")
    private WebElement setFacebookPassword;
    
    @FindBy(css = "#login_form > ul > li:nth-child(3) > input")
    private WebElement clickFacebookLoginBtnInput;
    
    //Facebook incognito
    @FindBy(css = "#email")
    private WebElement FacebookLoginEmailInput;

    @FindBy(css ="#pass")
    private WebElement FacebookPasswordIncognitoInput;

    @FindBy(css = "#loginbutton")
    private WebElement FacebookIncognitoLoginBtnInput;



    public boolean isGoogleAllreadyAssign(){
        return isElementPresent(googleAllreadyAssign);
    }

    public boolean isFaceBookAllreadyAssign(){
        return isElementPresent(FaceBookAllreadyAssign);
    }
   
   
    public void switchToGoogleForm() {

        String[] popUpWindows  = driver.getWindowHandles().toArray(new String[0]);
        this.driver.switchTo().window(popUpWindows[1]);

     }
    public void switchToFaceBookForm() {

        String[] popUpWindows  = driver.getWindowHandles().toArray(new String[0]); 
        this.driver.switchTo().window(popUpWindows[1]);

     }
     
    //Google incognito
    
    
    
    public WebElement clickGoogleOtherAccountIncognitoBtn() {
        waitForElement(clickGoogleOtherAccountIncognitoBtnInput, 30);
        clickGoogleOtherAccountIncognitoBtnInput.click();
        return clickGoogleOtherAccountIncognitoBtnInput;
    }
    public WebElement setGoogleEmailOrPhoneIncognito(String email) {
        waitForElement(googleEmailOrPhoneInput, 30);
        googleEmailOrPhoneInput.sendKeys(email);
        return googleEmailOrPhoneInput;
    }
    
    public WebElement clickOnGoogleNextIncognitoBtn() {
        waitForElement(googleNextIncognitoBtn, 30);
        googleNextIncognitoBtn.click();
        return googleNextIncognitoBtn;
    }
    
    public WebElement setGoogleIncognitoPassword(String password) {
        waitForElement(googlePasswordIncognitoInput, 20);
        googlePasswordIncognitoInput.sendKeys(password);
        return googlePasswordIncognitoInput; 
    }
    
    public WebElement clickOnGoogleLastNextIncognitoBtn() {
        waitForElement(googleLastNextIncognitoBtnInput, 20);
        googleLastNextIncognitoBtnInput.click();
        return googleLastNextIncognitoBtnInput;
    }
 

  //Facebook incognito
    public WebElement setFacebookIncognitoEmail(String email) {
        waitForElement(FacebookLoginEmailInput, 30);
        FacebookLoginEmailInput.sendKeys(email);
        return FacebookLoginEmailInput;
    }
    public WebElement setFacebookIncognitoPassword(String password) {
        waitForElement(FacebookPasswordIncognitoInput, 30);
        FacebookPasswordIncognitoInput.sendKeys(password);
        return FacebookPasswordIncognitoInput;
    }

    public WebElement clickFacebookIncognitoLoginBtn() {
        waitForElement(FacebookIncognitoLoginBtnInput, 20);
        FacebookIncognitoLoginBtnInput.click();
        return FacebookIncognitoLoginBtnInput;
    }




    //Google
    public WebElement setGoogleEmailOrPhone(String email) {
        waitForElement(googleEmailOrPhoneInput, 30);
        googleEmailOrPhoneInput.sendKeys(email);
        return googleEmailOrPhoneInput;
    }

    public WebElement clickOnGoogleNextBtn() {
        if(this.isGoogleAllreadyAssign()){
            waitForElement(googleNextBtn, 10);
            googleNextBtn.click();
            return googleNextBtn;
        }
        else{
            waitForElement(googleNextIncognitoBtn, 10);
            googleNextIncognitoBtn.click();
            return googleNextIncognitoBtn;
        }

    }
    
    public void switchToArtlist(String url) {
        switchWindow(url);
    }
    
    public WebElement setGooglePassword(String password) {
        waitForElement(googlePasswordInput, 10);
        googlePasswordInput.sendKeys(password);
        return googlePasswordInput;
    }
    
    public WebElement clickOnGoogleLoginBtn() {
        waitForElement(googleLoginBtn, 10);
        googleLoginBtn.click();
        return googleLoginBtn;
    }
   
    public WebElement   clickOnFaceBookNextBtn() {
        if(this.isFaceBookAllreadyAssign()){
            waitForElement(clickFacebookLoginBtnInput, 10);
            clickFacebookLoginBtnInput.click();
            return clickFacebookLoginBtnInput;
        }
        else{
            waitForElement(googleNextIncognitoBtn, 10);
            googleNextIncognitoBtn.click();
            return googleNextIncognitoBtn;
        }

    }
 
    //Facebook
    public WebElement setFacebookmailOrPhone(String email) {
        waitForElement(setFacebookLoginEmail, 10);
        setFacebookLoginEmail.sendKeys(email);
        return setFacebookLoginEmail;
    }
    public WebElement setFacebookPassword(String password) {
        waitForElement(setFacebookPassword, 10);
        setFacebookPassword.sendKeys(password);
        return setFacebookPassword;
    }
    
    public WebElement clickOnFacebookLoginBtn() {
        waitForElement(clickFacebookLoginBtnInput, 10);
        clickFacebookLoginBtnInput.click();
        return clickFacebookLoginBtnInput;

    }
  

    }
