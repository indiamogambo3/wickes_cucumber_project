package uk.co.wickes.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.wickes.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Building Materials')]")
    WebElement buildingAndMaterial;


    public void clickOnBuildingAndMaterial() {
        log.info("click on Building and material link" + buildingAndMaterial.toString());
        mouseHoverToElementAndClick(buildingAndMaterial);
    }
}
