package uk.co.wickes;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import uk.co.wickes.propertyreader.PropertyReader;
import uk.co.wickes.utility.Utility;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {

   @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
