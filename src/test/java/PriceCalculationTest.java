import org.junit.Test;

import java.text.DecimalFormat;

import static org.testng.AssertJUnit.assertEquals;

public class PriceCalculationTest extends Scenario {

    @Test
    public void priceShouldBeCalculated() {

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.womenSectionLink.click();

        WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
        womenCategoryPage.findClotheElementByTitle("Printed Summer Dress").click();

        ProductPage productPage = new ProductPage(driver);
        double outPrice = productPage.getOurPrice();
        double oldPrice = productPage.getOldPrice();
        double reductionPercent = productPage.getReductionPercent();

        System.out.println("outPrice: " + outPrice + " oldPrice: " + oldPrice + " reductionPercent: " + reductionPercent);

        DecimalFormat decimalFormat = new DecimalFormat("#,##");
        double reduction = (oldPrice * reductionPercent);
        reduction = Double.valueOf(decimalFormat.format(reduction));
        System.out.println("reduction: " + reduction);

        //TODO fix double reduction round
        assertEquals(outPrice, (oldPrice - reduction));

    }
}
