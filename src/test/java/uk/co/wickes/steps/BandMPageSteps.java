package uk.co.wickes.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.wickes.pages.BandMPage;
import uk.co.wickes.pages.HomePage;

public class BandMPageSteps {
    @Given("I am on HomePage")
    public void iAmOnHomePage() {

    }

    @When("I click on BuildingAndMaterial Link")
    public void iClickOnBuildingAndMaterialLink() {
        new HomePage().clickOnBuildingAndMaterial();
    }

    @And("I click on Roof Felt")
    public void iClickOnRoofFelt() {
        new BandMPage().clickOnRoofFelt();
    }

    @And("I can see Roof Felt in Black Font")
    public void iCanSeeRoofFeltInBlackFont() {
        Assert.assertEquals(new BandMPage().verifyText(), "Roof Felt", "Unable to Verify");

    }
    @And("I select Roof Felt fourByTen Kit")
    public void iSelectRoofFeltFourByTenKit() throws InterruptedException {
        Thread.sleep(10000);
        new BandMPage().clickOnRoofKit();

    }
    @And("I can see Message in front of the page")
    public void iCanSeeMessageInFrontOfThePage() {
        Assert.assertEquals(new BandMPage().verifyTextSkyGuard(), "Skyguard 4ft - 10ft Garden Building Roof Kit", "Unable to verify");
    }

    @And("I select size {string} from the dropdown")
    public void iSelectSizeFromTheDropdown(String text) {
        new BandMPage().selectFromDropDown("7 x 7 ft");

    }

    @And("I clear the quantity")
    public void iClearTheQuantity() {
        new BandMPage().clearQuantity();
    }

    @And("I write Quantity {string}")
    public void iWriteQuantity(String value) {
        new BandMPage().addingQuantity("5");
    }


    @And("I click To AddTo Delivery Button")
    public void iClickToAddToDeliveryButton() {
        new BandMPage().clickOnAddToDeliveryButton();
    }

    @Then("I click on Basket")
    public void iClickOnBasket() {
        new BandMPage().clickOnBasket();
    }



    }
