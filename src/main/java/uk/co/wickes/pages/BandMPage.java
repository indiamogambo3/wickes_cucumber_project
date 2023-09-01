package uk.co.wickes.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.wickes.utility.Utility;

public class BandMPage extends Utility {
    private static final Logger log = LogManager.getLogger(BandMPage.class.getName());

    public BandMPage() {
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
    WebElement verifySkyGuard;

    @CacheLookup
    @FindBy(xpath = "//select[@id='variant']")
    WebElement select7By7;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity-field']")
    WebElement cleanQuantity;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity-field']")
    WebElement addQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[@id='addproduct223163']//span[@class='btn__text'][normalize-space()='Add for Delivery']")
    WebElement addToButton;

    @CacheLookup
    @FindBy(xpath = "//li[@class='header-right__item']//span[@class='header-right__link-title'][normalize-space()='Basket']")
    WebElement basket;


    public void clickOnRoofFelt() {
        log.info("click on roof felt" + roofFelt.toString());
        clickOnElement(roofFelt);
    }

    public String verifyText() {
        log.info("Verify Text " + textRoofFelt.toString());

        return getTextFromElement(textRoofFelt);
    }

    public void clickOnRoofKit() throws InterruptedException {
        log.info("click on roofKit" + roofKit.toString());
        mouseHoverToElementAndClick(roofKit);
        Thread.sleep(10000);
    }

    public String verifyTextSkyGuard() {
        log.info("verify Text" + verifySkyGuard.toString());
        return getTextFromElement(verifySkyGuard);
    }

    public void selectFromDropDown(String text) {
        log.info("select from DropDown" + select7By7.toString());
        selectByVisibleTextFromDropDown(select7By7, text);
    }

    public void clearQuantity() {
        log.info("clean quantity" + cleanQuantity.toString());
        clearTextFromField(cleanQuantity);
    }

    public void addingQuantity(String value) {
        log.info("add in quantity " + addQuantity.toString());
        sendTextToElement(addQuantity, value);
    }

    public void clickOnAddToDeliveryButton() {
        log.info("click on delivery button" + addToButton.toString());
        clickOnElement(addToButton);
    }

    public void clickOnBasket() {
        log.info("click on basket" + basket.toString());
        clickOnElement(basket);
    }

}
