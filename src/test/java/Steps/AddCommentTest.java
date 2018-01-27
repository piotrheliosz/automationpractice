package Steps;

import PageObjectPattern.MyAccountPage;
import PageObjectPattern.ProductPage;
import PageObjectPattern.WomenCategoryPage;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

public class AddCommentTest extends Scenario {

    @Test
    public void commentShouldBeAdded() {

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.womenSectionLink.click();

        WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
        womenCategoryPage.findElementByTitle("Printed Chiffon Dress").click();

        ProductPage productPage = new ProductPage(driver);
        productPage.waitForElementVisibility(productPage.newCommentLink);
        productPage.newCommentLink.click();
        productPage.commentTitleInput.sendKeys("test title");
        productPage.commentTextArea.sendKeys("test comment");
        productPage.sendNewComment.click();
        productPage.waitForElementInvisibility(productPage.sendNewComment);

        assertTrue(productPage.commentStatement.isDisplayed());

    }

}
