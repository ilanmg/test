package selenium.pageobjects.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class Modals extends Pages {

    public Modals(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "pricing-modal")
    public WebElement pricingModal;



    public boolean modalIsVisibile(WebElement element, boolean waitForElement) {
        if(waitForElement)
            waitForElement(element, 10);
        return isElementPresent(element) && element.isDisplayed();
    }

    public WebElement closeModal(WebElement element) throws InterruptedException {
        waitForElement(element, 10);
        WebElement closeBtn  = element.findElement(By.cssSelector("button.close"));
        waitForElement(closeBtn, 10);
        closeBtn.click();
        return element;
    }




}
