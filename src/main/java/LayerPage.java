import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LayerPage extends Page {

    @FindBy(xpath = "//*[@id='layer_cart']//a[@title='Proceed to checkout']")
    public WebElement processToCheckOutButton;


    public LayerPage(WebDriver driver) {
        super(driver);
    }
}
