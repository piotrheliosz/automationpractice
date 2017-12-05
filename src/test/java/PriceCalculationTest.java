import org.junit.Test;

import java.text.DecimalFormat;

import static org.testng.AssertJUnit.assertEquals;

public class PriceCalculationTest extends Scenario {

    @Test
    public void priceShouldBeCalculated() {

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.womenSectionLink.click();

        WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
        womenCategoryPage.findElementByTitle("Printed Summer Dress").click();

        ProductPage productPage = new ProductPage(driver);
        double ourPrice = productPage.getOurPrice() * 100;
        double oldPrice = productPage.getOldPrice() * 100;
        double reductionPercent = productPage.getReductionPercent() * 100;
        double reduction = (oldPrice * reductionPercent)/100;

        assertEquals(ourPrice, (oldPrice - Math.round(reduction)));

    }
}
