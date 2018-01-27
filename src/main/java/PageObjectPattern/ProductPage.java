package PageObjectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Page {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "layer_cart")
    public
    WebElement layerCard;

    @FindBy(id = "group_1")
    WebElement selectSize;

    @FindBy(id = "wishlist_button")
    public
    WebElement wishlistButton;

    @FindBy(xpath = "//*[@id='product']//p[text()='Added to your wishlist.']")
    public
    WebElement addedToWishListStatement;

    @FindBy(xpath = "//*[@id='product']//a[@title='Close']")
    public
    WebElement closeStatementLink;

    @FindBy(id = "new_comment_tab_btn")
    public
    WebElement newCommentLink;

    @FindBy(id = "comment_title")
    public
    WebElement commentTitleInput;

    @FindBy(id = "content")
    public
    WebElement commentTextArea;

    @FindBy(xpath = "//*[@id='product']//p[text()='Your comment has been added and will be available once approved by a moderator']")
    public
    WebElement commentStatement;

    @FindBy(id = "submitNewMessage")
    public
    WebElement sendNewComment;

    @FindBy(id = "our_price_display")
    private WebElement ourPriceDisplay;

    @FindBy(id = "old_price_display")
    private WebElement oldPriceDisplay;

    @FindBy(id = "reduction_percent_display")
    private WebElement reductionPercentDisplay;

    public double getOurPriceDisplay() {
        return Math.round((Double.parseDouble(ourPriceDisplay.getText().replaceAll("\\W", "")) / 100) * 100);
    }

    public double getOldPriceDisplay() {
        return (Double.parseDouble(oldPriceDisplay.getText().replaceAll("\\W", "")) / 100) * 100;
    }

    public double getReductionPercentDisplay() {
        return Double.parseDouble(reductionPercentDisplay.getText().replaceAll("\\W", "")) / 100;
    }
}
