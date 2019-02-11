
package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

import java.util.Set;

public class MainMenue extends Pages {

    public MainMenue (WebDriver driver) {
        super(driver);
    }

   //Mood
    @FindBy(css ="nav.main-menu li.Mood > a") 
    private WebElement mainMenueMoodInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='5']")
    private WebElement UpliftingInput;
    
    @FindBy(css = "#tagslist > li > a.remove-tag-link")
    private WebElement closeInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='6']")
    private WebElement PowerfulInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='7']")
    private WebElement HappyInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='8']")
    private WebElement CarefreeInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='9']")
    private WebElement LoveInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='35']")
    private WebElement PlayfulInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='78']")
    private WebElement HopefulInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='10']")
    private WebElement PeacefulInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='12']")
    private WebElement SeriousInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='13']")
    private WebElement DramaticInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='14']")
    private WebElement AngryInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='15']")
    private WebElement TenseInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='16']")  
    private WebElement SadInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='79']")
    private WebElement ScaryAndDarkInput;



    //videoTheme
    @FindBy(css = ".menu > .VideoTheme > .toggle-sub")
    private WebElement videoThemeInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='17']")
    private WebElement videoThemeBusinessInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='18']")
    private WebElement videoThemeTechnologyInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='19']")
    private WebElement videoThemeTimeLapseInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='20']")
    private WebElement videoThemeFoodInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='21']")
    private WebElement videoThemeEducationInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='21']")
    private WebElement videoThemePeopleInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='74']")
    private WebElement videoThemeWeddingsInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='84']")
    private WebElement videoThemeVlogInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='23']")
    private WebElement videoThemeRoadTripInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='75']")
    private WebElement videoThemeTravelInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='24']")
    private WebElement videoThemeSportsAndFitnessInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='25']")
    private WebElement videoThemeLifestyleInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='26']")
    private WebElement videoThemeBuildingAndCityInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='27']")
    private WebElement videoThemeNightlifeInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='28']")
    private WebElement videoThemeFashionInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='29']")
    private WebElement videoThemeScienceInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='30']")
    private WebElement videoThemeMedicalInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='31']")
    private WebElement videoThemeIndustryInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='32']")
    private WebElement videoThemeAerialsInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='33']")
    private WebElement videoThemeLandscapeInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='34']")
    private WebElement videoThemeNatureInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='36']")
    private WebElement videoThemeSlowMotionInput;


    
    //Genre
    @FindBy(css = ".menu > .Genre > .toggle-sub")
    private WebElement mainMenuGenreInput;
   
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='87']")
    private WebElement mainMenuGenreHolidayInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='64']")
    private WebElement mainMenuGenreElectronicInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='69']")
    private WebElement mainMenuGenrePopInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='85']")
    private WebElement mainMenuGenreHipHopInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='59']")
    private WebElement mainMenuGenreSoulAndRnBInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='59']")
    private WebElement mainMenuGenreCinematicInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='66']")
    private WebElement mainMenuGenreIndieInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='70']")
    private WebElement mainMenuGenreSingerSongwriterInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='65']")
    private WebElement mainMenuGenreAcousticInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='71']")
    private WebElement mainMenuGenreFolkInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='68']")
    private WebElement mainMenuGenreRockInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='58']")
    private WebElement mainMenuGenreBluesInput;




    public WebElement clickOnMainMenueMood() {
        waitForElement(mainMenueMoodInput, 10);
        mainMenueMoodInput.click();
        return mainMenueMoodInput;
    }
   public WebElement clickOnMainMenueUplifting() {
        waitForElement(UpliftingInput, 20);
        UpliftingInput.click();
        return UpliftingInput;
    }
   public WebElement closeMainMenueInput() {
       waitForElement(closeInput, 10);
       closeInput.click();
       return closeInput;
   }
   public WebElement clickOnMainMenuePowerful() {
       waitForElement(PowerfulInput, 10);
       PowerfulInput.click();
       return PowerfulInput;
   }
 
  public WebElement clickOnMainMenueHappy() {
      waitForElement(HappyInput, 10);
      HappyInput.click();
      return HappyInput;
  }
  
  public WebElement clickOnMainMenueCarefree() {
      waitForElement(CarefreeInput, 10);
      CarefreeInput.click();
      return CarefreeInput;
  }
  public WebElement clickOnMainMenueLove() {
      waitForElement(LoveInput, 10);
      LoveInput.click();
      return LoveInput;
  }
  public WebElement clickOnMainMenuePlayful() {
      waitForElement(PlayfulInput, 10);
      PlayfulInput.click();
      return PlayfulInput;
  }
  
  public WebElement clickOnMainMenueHopeful() {
      waitForElement(HopefulInput, 10);
      HopefulInput.click();
      return HopefulInput;
  }
  
  public WebElement clickOnMainMenuePeaceful() {
      waitForElement(PeacefulInput, 10);
      PeacefulInput.click();
      return PeacefulInput;
  }
  
  public WebElement clickOnMainMenueSerious() {
      waitForElement(SeriousInput, 10);
      SeriousInput.click();
      return SeriousInput;
  }
  
  public WebElement clickOnMainMenueDramatic() {
      waitForElement(DramaticInput, 10);
      DramaticInput.click();
      return DramaticInput;
  }
  
  public WebElement clickOnMainMenueAngry() {
      waitForElement(AngryInput, 10);
      AngryInput.click();
      return AngryInput;
  }
  
  public WebElement clickOnMainMenueTense() {
      waitForElement(TenseInput, 10);
      TenseInput.click();
      return TenseInput;
  }

  public WebElement clickOnMainMenueSad() {
      waitForElement(SadInput, 10);
      SadInput.click();
      return SadInput;
  }


  //videoTheme
    public WebElement clickOnvideoTheme() {
        waitForElement(videoThemeInput, 10);
        videoThemeInput.click();
        return videoThemeInput;
    }

    public WebElement clickOnvideoThemeBusiness() {
        waitForElement(videoThemeBusinessInput, 10);
        videoThemeBusinessInput.click();
        return videoThemeBusinessInput;
    }

    public WebElement clickOnvideoThemeTechnology() {
        waitForElement(videoThemeTechnologyInput, 10);
        videoThemeTechnologyInput.click();
        return videoThemeTechnologyInput;
    }

    public WebElement clickOnvideoThemeTimeLapse() {
        waitForElement(videoThemeTimeLapseInput, 10);
        videoThemeTimeLapseInput.click();
        return videoThemeTimeLapseInput;
    }
    public WebElement clickOnvideoThemeFood() {
        waitForElement(videoThemeFoodInput, 20);
        videoThemeFoodInput.click();
        return videoThemeFoodInput;
    }

    public WebElement clickOnvideoThemeEducation() {
        waitForElement(videoThemeEducationInput, 10);
        videoThemeEducationInput.click();
        return videoThemeEducationInput;
    }

    public WebElement clickOnvideoThemePeople() {
        waitForElement(videoThemePeopleInput, 10);
        videoThemePeopleInput.click();
        return videoThemePeopleInput;
    }
    public WebElement clickOnvideoThemeWeddings() {
        waitForElement(videoThemeWeddingsInput, 10);
        videoThemeWeddingsInput.click();
        return videoThemeWeddingsInput;
    }

    public WebElement clickOnvideoThemeVlog() {
        waitForElement(videoThemeVlogInput, 10);
        videoThemeVlogInput.click();
        return videoThemeVlogInput;
    }
    public WebElement clickOnvideoThemeRoadTrip() {
        waitForElement(videoThemeRoadTripInput, 10);
        videoThemeRoadTripInput.click();
        return videoThemeRoadTripInput;
    }
    public WebElement clickOnvideoThemeTravel() {
        waitForElement(videoThemeTravelInput, 10);
        videoThemeTravelInput.click();
        return videoThemeTravelInput;
    }

    public WebElement clickOnvideoThemeSportsAndFitness() {
        waitForElement(videoThemeSportsAndFitnessInput, 10);
        videoThemeSportsAndFitnessInput.click();
        return videoThemeSportsAndFitnessInput;
    }
    public WebElement clickOnvideoThemeLifestyle() {
        waitForElement(videoThemeLifestyleInput, 20);
        videoThemeLifestyleInput.click();
        return videoThemeLifestyleInput;
    }

    public WebElement clickOnvideoThemeBuildingAndCity() {
        waitForElement(videoThemeBuildingAndCityInput, 20);
        videoThemeBuildingAndCityInput.click();
        return videoThemeBuildingAndCityInput;
    }

    public WebElement clickOnvideoThemeNightlife() {
        waitForElement(videoThemeNightlifeInput, 20);
        videoThemeNightlifeInput.click();
        return videoThemeNightlifeInput;
    }

    public WebElement clickOnvideoThemeFashion() {
        waitForElement(videoThemeFashionInput, 20);
        videoThemeFashionInput.click();
        return videoThemeFashionInput;
    }

    public WebElement clickOnvideoThemeScience() {
        waitForElement(videoThemeScienceInput, 20);
        videoThemeScienceInput.click();
        return videoThemeScienceInput;
    }

    public WebElement clickOnvideoThemeMedical() {
        waitForElement(videoThemeMedicalInput, 10);
        videoThemeMedicalInput.click();
        return videoThemeMedicalInput;
    }

    public WebElement clickOnvideoThemeIndustry() {
        waitForElement(videoThemeIndustryInput, 10);
        videoThemeIndustryInput.click();
        return videoThemeIndustryInput;
    }

    public WebElement clickOnvideoThemeAerials() {
        waitForElement(videoThemeAerialsInput, 20);
        videoThemeAerialsInput.click();
        return videoThemeAerialsInput;
    }
    public WebElement clickOnvideoThemeLandscape() {
        waitForElement(videoThemeLandscapeInput, 20);
        videoThemeLandscapeInput.click();
        return videoThemeLandscapeInput;
    }

    public WebElement clickOnvideoThemeNature() {
        waitForElement(videoThemeNatureInput, 20);
        videoThemeNatureInput.click();
        return videoThemeNatureInput;
    }

    public WebElement clickOnvideoThemeSlowMotion() {
        waitForElement(videoThemeSlowMotionInput, 20);
        videoThemeSlowMotionInput.click(); 
        return videoThemeSlowMotionInput;
    }

    
    //Genre
    public WebElement clickOnmainMenuGenre() {
        waitForElement(mainMenuGenreInput, 20);
        mainMenuGenreInput.click(); 
        return mainMenuGenreInput;
    }
    
    public WebElement clickOnmainMenuGenreHoliday() {
        waitForElement(mainMenuGenreHolidayInput, 20);
        mainMenuGenreHolidayInput.click(); 
        return mainMenuGenreHolidayInput;
    } 
     
    public WebElement clickOnmainMenuGenreElectronic() {
        waitForElement(mainMenuGenreElectronicInput, 20);
        mainMenuGenreElectronicInput.click(); 
        return mainMenuGenreElectronicInput;
    }

    public WebElement clickOnmainMenuGenrePop() {
        waitForElement(mainMenuGenrePopInput, 20);
        mainMenuGenrePopInput.click();
        return mainMenuGenrePopInput;
    }

    public WebElement clickOnmainMenuGenreHipHop() {
        waitForElement(mainMenuGenreHipHopInput, 20);
        mainMenuGenreHipHopInput.click();
        return mainMenuGenreHipHopInput;
    }

    public WebElement clickOnmainMenuGenreCinematic() {
        waitForElement(mainMenuGenreCinematicInput, 20);
        mainMenuGenreCinematicInput.click();
        return mainMenuGenreCinematicInput;
    }
    public WebElement clickOnmainMenuGenreSoulAndRnB() {
        waitForElement(mainMenuGenreCinematicInput, 20);
        mainMenuGenreCinematicInput.click();
        return mainMenuGenreCinematicInput;
    }
    public WebElement clickOnmainMenuGenreIndie() {
        waitForElement(mainMenuGenreIndieInput, 20);
        mainMenuGenreIndieInput.click();
        return mainMenuGenreIndieInput;
    }

    public WebElement clickOnmainMenuGenreSingerSongwriter() {
        waitForElement(mainMenuGenreSingerSongwriterInput, 20);
        mainMenuGenreSingerSongwriterInput.click();
        return mainMenuGenreSingerSongwriterInput;
    }

    public WebElement clickOnmainMenuGenreAcoustic() {
        waitForElement(mainMenuGenreAcousticInput, 20);
        mainMenuGenreAcousticInput.click();
        return mainMenuGenreAcousticInput;
    }
    public WebElement clickOnmainMenuGenreFolk() {
        waitForElement(mainMenuGenreFolkInput, 20);
        mainMenuGenreFolkInput.click();
        return mainMenuGenreFolkInput;
    }

    public WebElement clickOnmainMenuGenreRock() {
        waitForElement(mainMenuGenreRockInput, 20);
        mainMenuGenreRockInput.click();
        return mainMenuGenreRockInput;
    }

    public WebElement clickOnmainMenuGenreBlues() {
        waitForElement(mainMenuGenreBluesInput, 20);
        mainMenuGenreBluesInput.click();
        return mainMenuGenreBluesInput;
    }

 }
