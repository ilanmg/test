package ArtlistRegression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.PlaySongsFromHomepage;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.browser.Screen.XLARGE;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, Browsers.FIREFOX })


public class playPauseSong extends SeleniumTestWrapper {

    WebDriver driver = getDriver();

    StartPage startPage = PageFactory.initElements(driver, StartPage.class); 
    SiteHeader siteHeader = PageFactory.initElements(driver, SiteHeader.class);
    PlaySongsFromHomepage playSongs = PageFactory.initElements(driver, PlaySongsFromHomepage.class); 


    @BeforeTest
    public void setup() throws InterruptedException {
        startPage.open();
    }


    @Test(description = "this test should play songs and pausing them")
    public void playPauseSong() throws InterruptedException {
        Thread.sleep(7000);
        playSongs.clickToPlayFirstSongOnList();
        Thread.sleep(3000);

        playSongs.clickCanvasSongWave();
        Thread.sleep(3000);

        playSongs.clickToPauseFirstSongOnList();
        Thread.sleep(3000);

        playSongs.clickToPlayFirstSongOnList();
        Thread.sleep(5000);

        playSongs.clickVolumeSpeaker();
        Thread.sleep(3000);

        playSongs.clickTheVolumeSpeakerForTheSecondTime();  
        Thread.sleep(3000);
        Assert.assertEquals(true, siteHeader.startBtnIsDisplayed());


    }
}