package uk.co.wickes.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.wickes.utility.Utility;

public class BuildingAndMaterial extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public BuildingAndMaterial() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Roof Felt']")
    WebElement roofFelt;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Roof Felt')]")
    WebElement textRoofFelt;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Skyguard 4ft - 10ft Garden Building Roof Kit')]")
    WebElement roofKit;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Skyguard 4ft - 10ft Garden Building Roof Kit')]")
    WebElement verifySkyGuard


    public void clickOnRoofFelt() {
        clickOnElement(roofFelt);
    }

    public String verifyText() {
        return getTextFromElement(textRoofFelt);
    }

    public void clickOnRoofKit() {
        mouseHoverToElementAndClick(roofKit);
    }
public void

}
