import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class BuyClothes extends Scenario {

    @Test
    public void womenTshirtShouldBeBought() {

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.womenSectionLink.click();

        WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
        womenCategoryPage.findClotheElementByTitle("Printed Chiffon Dress").click();

        ProductPage productPage = new ProductPage(driver);
        productPage.exclusiveButton.click();
        productPage.waitForElementVsibility(productPage.layerCard);

        LayerPage layerPage = new LayerPage(driver);
        layerPage.processToCheckOutButton.click();

        OtherPage otherPage = new OtherPage(driver);
        otherPage.processToCheckOutButton.click();
        otherPage.processToCheckOutButton.click();
        otherPage.agreeChceckBox.click();
        otherPage.processToCheckOutButton.click();
        otherPage.payByBankWireLink.click();
        otherPage.processToCheckOutButton.click();

        assertTrue(otherPage.strongText.getText().equals("Your order on My Store is complete."));

    }

}
