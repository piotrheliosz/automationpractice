import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LayerPage extends Page {
    LayerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='layer_cart']//a[@title='Proceed to checkout']")
    WebElement processToCheckOutButton;
}
