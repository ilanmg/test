package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class addingToCart extends Pages {

    public addingToCart(WebDriver driver) {
        super(driver);
        
    }

    @FindBy(id = "user-login-btn")
    private WebElement signInBtn;

    @FindBy(css= "#logemail")
    private WebElement logemail;

    @FindBy(css= "#logpassword")
    private WebElement loaginPasswordInput;

    @FindBy(css= "#btnlogin")
    private WebElement loginBtn;

    @FindBy(css = "#song_9184 a.add-cart")
    private WebElement addToCartInput;

    
    public WebElement clickSignInBtn() {
        waitForElement(signInBtn, 10);
        signInBtn.click();
        return signInBtn;
    }

    public void setEmail(String email){
        waitForElement(logemail, 10);
        logemail.sendKeys(email);
    }

    public void setPassword(String password){
        waitForElement(loaginPasswordInput, 10);
        loaginPasswordInput.sendKeys(password);
    }

    public void clickLoginBtn() {
        waitForElement(loginBtn, 10);
        waitForElement(loaginPasswordInput, 10);
        loginBtn.click();
    }

    public void clickAddToCartIcon() {
    	waitForElement(addToCartInput, 10);
        waitForElement(addToCartInput, 10);
        addToCartInput.click();
    }
 

}


