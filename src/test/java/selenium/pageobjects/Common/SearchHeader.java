package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class SearchHeader extends Pages {

    public SearchHeader(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#txtSearch")
    private WebElement searchInput;

    @FindBy(xpath="//a[contains(text(),'Business (Category)')]")
    private WebElement resultInput;
    
    @FindBy(css="#autoCompleteBox > ul > li > a")
    private WebElement resultLeadsToArtlistPage;

    @FindBy(className="tag-link")
    private WebElement closeResultInput;

    @FindBy(css="#tagslist > li > a.remove-tag-link")
    private WebElement removeResultInput;

    @FindBy(xpath="//div[@class='trigger']")
    private WebElement triggerInput;

    @FindBy(css="div.trigger")
    private WebElement closingTriggerInput;

    @FindBy(css=".tob-bar-container i.search-icon")
    
    private WebElement searcByMagnifier;

    @FindBy(css = "#artistpage > div > div.cover-area > div > div.cover-content > div > div.info > span")
    private WebElement GetArtlistPage;

    public WebElement clickTriggerIcon() {
        waitForElement(triggerInput, 10);
        triggerInput.click();
        return triggerInput;
    }

    public WebElement clickSearchIcon() {
        waitForElement(searchInput, 20);
        searchInput.click();
        return searchInput;
    }

        public WebElement clickFirstResult() {
        waitForElement(resultInput, 10);
        resultInput.click();
        return resultInput;
    }

    public WebElement clickCloseResult() {
        waitForElement(closeResultInput, 10);
        closeResultInput.click();
        return closeResultInput;
    }

    public WebElement clickResultToGetArtlistPage(){
        waitForElement(resultLeadsToArtlistPage, 20);
        resultLeadsToArtlistPage.click();
        return resultLeadsToArtlistPage;
    }
    
   

    public WebElement closeResult() {
        waitForElement(closeResultInput, 10);
        closeResultInput.click();
        return closeResultInput;
    }

    public WebElement removeResult() {
        waitForElement(removeResultInput, 10);
        removeResultInput.click();
        return removeResultInput;
    }

    public WebElement closeTriggerIcon() {
        waitForElement(closingTriggerInput, 10);
        closingTriggerInput.click();
        return closingTriggerInput;
    }

    public WebElement clickMagnifier() {
        waitForElement(searcByMagnifier, 10);
        searcByMagnifier.click();
        return searcByMagnifier;
    }
    
    public boolean GetArtlistPageIsDisplayed() {
        return isElementVisible(GetArtlistPage);
    }
    
}