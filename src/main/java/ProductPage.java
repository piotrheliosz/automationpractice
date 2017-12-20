import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Page {
    ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "layer_cart")
    WebElement layerCard;

    @FindBy(id = "group_1")
    WebElement selectSize;

    @FindBy(id = "wishlist_button")
    WebElement wishlistButton;

    @FindBy(xpath = "//*[@id='product']//p[text()='Added to your wishlist.']")
    WebElement addedToWishListStatement;

    @FindBy(xpath = "//*[@id='product']//a[@title='Close']")
    WebElement closeStatementLink;

    @FindBy(id = "new_comment_tab_btn")
    WebElement newCommentLink;

    @FindBy(id = "comment_title")
    WebElement commentTitleInput;

    @FindBy(id = "content")
    WebElement commentTextArea;

    @FindBy(xpath = "//*[@id='product']//p[text()='Your comment has been added and will be available once approved by a moderator']")
    WebElement commentStatement;

    @FindBy(id = "submitNewMessage")
    WebElement sendNewComment;

    @FindBy(id = "our_price_display")
    private WebElement ourPriceDisplay;

    @FindBy(id = "old_price_display")
    private WebElement oldPriceDisplay;

    @FindBy(id = "reduction_percent_display")
    private WebElement reductionPercentDisplay;

    double getOurPriceDisplay() {
        return Math.round((Double.parseDouble(ourPriceDisplay.getText().replaceAll("\\W", "")) / 100) * 100);
    }

    double getOldPriceDisplay() {
        return (Double.parseDouble(oldPriceDisplay.getText().replaceAll("\\W", "")) / 100) * 100;
    }

    double getReductionPercentDisplay() {
        return Double.parseDouble(reductionPercentDisplay.getText().replaceAll("\\W", "")) / 100;
    }
}
