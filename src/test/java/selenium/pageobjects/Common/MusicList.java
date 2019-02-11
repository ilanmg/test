package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class MusicList extends Pages {

    public MusicList(WebDriver driver) {
        super(driver);
    }

    
    @FindBy(css="i.fa.fa-play")
    private WebElement playSongInput;

   



    public WebElement clickplayIcon() {
        waitForElement(playSongInput, 10);
        playSongInput.click();
        return playSongInput;
    }

        
}


