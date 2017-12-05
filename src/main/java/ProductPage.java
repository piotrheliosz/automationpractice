import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends Page {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "layer_cart")
    public WebElement layerCard;

    @FindBy(id = "quantity_wanted")
    public WebElement quantityInput;

    @FindBy(id = "group_1")
    public WebElement selectSize;

    @FindBy(id = "wishlist_button")
    public WebElement wishlistButton;

    @FindBy(xpath = "//*[@id='product']//p[text()='Added to your wishlist.']")
    public WebElement addedToWishListStatement;

    @FindBy(xpath = "//*[@id='product']//a[@title='Close']")
    public WebElement closeStatementLink;

    @FindBy(id = "our_price_display")
    public WebElement ourPrice;

    @FindBy(id = "old_price_display")
    public WebElement oldPrice;

    @FindBy(id = "reduction_percent_display")
    public WebElement reductionPercent;

    @FindBy(xpath = "//*[@id='layer_cart']//h2/i")
    public WebElement successIcon;


    public void setSize(String size) {
        Select select = new Select(selectSize);
        select.selectByVisibleText(size);
    }

    public double getOurPrice() {
        return Double.parseDouble(ourPrice.getText().replaceAll("\\W", ""))/100;
    }


    public double getOldPrice() {
        return Double.parseDouble(oldPrice.getText().replaceAll("\\W", ""))/100;
    }

    public double getReductionPercent() {
        return Double.parseDouble(reductionPercent.getText().replaceAll("\\W", ""))/100;
    }
}
