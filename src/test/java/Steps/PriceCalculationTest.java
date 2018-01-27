package Steps;

import PageObjectPattern.MyAccountPage;
import PageObjectPattern.ProductPage;
import PageObjectPattern.WomenCategoryPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class PriceCalculationTest extends Scenario {

    @DataProvider(name = "test1")
    public static Object[] clotheName() {
        return new Object[][]{{"Printed Chiffon Dress"}, {"Printed Summer Dress"}};
    }

    @Test(dataProvider = "test1")
    public void reductionShouldBeCalculated(String clotheTitle) {

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.womenSectionLink.click();

        WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
        womenCategoryPage.findElementByTitle(clotheTitle).click();

        ProductPage productPage = new ProductPage(driver);
        double ourPrice = productPage.getOurPriceDisplay();
        double oldPrice = productPage.getOldPriceDisplay();
        double reductionPercent = productPage.getReductionPercentDisplay() * 100;
        double reduction = Math.round((oldPrice * reductionPercent) / 100);

        System.out.println("ourPriceDisplay: " + ourPrice + " | oldPriceDisplay: " + oldPrice
                + " | reductionPercentDisplay: " + reductionPercent + " | reduction: " + reduction);

        assertEquals(ourPrice, (oldPrice - reduction));

    }
}
