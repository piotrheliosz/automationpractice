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

    @FindBy(xpath = "//*[@id='layer_cart']//h2/i")
    public WebElement successIcon;

    public void setSize(String size) {
        Select select = new Select(selectSize);
        select.selectByVisibleText(size);
    }

}
