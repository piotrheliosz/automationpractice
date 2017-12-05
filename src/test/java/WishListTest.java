import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class WishListTest extends Scenario {

    @Test
    public void productShouldBeAddedToWishList(){

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.womenSectionLink.click();

        WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
        womenCategoryPage.findClotheElementByTitle("Printed Chiffon Dress").click();

        ProductPage productPage = new ProductPage(driver);
        productPage.wishlistButton.click();

        productPage.waitForElementVsibility(productPage.addedToWishListStatement);
        assertTrue(productPage.addedToWishListStatement.isDisplayed());

        productPage.closeStatementLink.click();


    }

}
