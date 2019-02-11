package selenium.pageobjects.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import selenium.Pages;


public class PlaySongsFromHomepage extends Pages {

    public PlaySongsFromHomepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

   
   
    @FindBy(css = "#song_7079 .play-pause-btn > .fa")
    private WebElement playSongBtnListInput;
    
    @FindBy(css = "#song_7079 .song-wave-canvas")
    private WebElement playOtherSongFromCanvasInput;
    
    @FindBy(css = "#song_7079 .play-pause-btn > .fa")
    private WebElement pausingSongInput;
 
    @FindBy(css = ".bottom-player .volume-speak")
    private WebElement clickVolumeSpeakerInput;
 
    @FindBy(css = ".bottom-player .volume-speak")
    private WebElement clickTheVolumeSpeakerForTheSecondTimeInput;
    
    @FindBy(css = "#song_9827 .play-pause-btn > .fa")
    private WebElement playOtherSongFromBtnListInput;
    
   
  
   
  
    public WebElement clickToPlayFirstSongOnList() {
        waitForElement(playSongBtnListInput, 30);
        playSongBtnListInput.click();
        return playSongBtnListInput; 
    }
    public WebElement clickCanvasSongWave() {
        waitForElement(playOtherSongFromCanvasInput, 10); 
        playOtherSongFromCanvasInput.click();
        return playOtherSongFromCanvasInput;  
    } 
    
    public WebElement clickToPauseFirstSongOnList() {
        waitForElement(pausingSongInput, 10);
        pausingSongInput.click();
        return pausingSongInput; 
    }
    
    public WebElement clickVolumeSpeaker() {
        waitForElement(clickTheVolumeSpeakerForTheSecondTimeInput, 20);
        clickTheVolumeSpeakerForTheSecondTimeInput.click();
        return clickTheVolumeSpeakerForTheSecondTimeInput; 
    }
    
    public WebElement clickTheVolumeSpeakerForTheSecondTime() {
        waitForElement(clickTheVolumeSpeakerForTheSecondTimeInput, 10);
        clickTheVolumeSpeakerForTheSecondTimeInput.click();
        return clickTheVolumeSpeakerForTheSecondTimeInput; 
    }
   
  
  }

