import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OtherPage extends Page {
    public OtherPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='center_column']//*[@title='Proceed to checkout' or @type='submit']")
    public WebElement processToCheckOutButton;

    @FindBy(xpath = "//*[@id='uniform-cgv']//input")
    public WebElement agreeChceckBox;

    @FindBy(xpath = "//*[@id='HOOK_PAYMENT']//a[contains(@title, 'Pay by bank wire')]")
    public WebElement payByBankWireLink;

    @FindBy(xpath = "//*[@id='center_column']//strong")
    public WebElement strongText;
}
