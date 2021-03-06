package Steps;

import PageObjectPattern.MyAccountPage;
import PageObjectPattern.ProductPage;
import PageObjectPattern.WomenCategoryPage;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

public class WishListTest extends Scenario {

    @Test
    public void productShouldBeAddedToWishList() {

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.goToMyAccountSection("Women");

        WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
        womenCategoryPage.findElementByTitle("Printed Chiffon Dress").click();

        ProductPage productPage = new ProductPage(driver);
        productPage.wishlistButton.click();

        productPage.waitForElementVisibility(productPage.addedToWishListStatement);
        assertTrue(productPage.addedToWishListStatement.isDisplayed());

        productPage.waitForElementVisibility(productPage.closeStatementLink);
        productPage.closeStatementLink.click();


    }

}
