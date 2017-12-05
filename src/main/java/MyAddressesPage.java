import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAddressesPage extends Page{

    @FindBy (xpath = "//*[@id='center_column']//a[@title='Add an address']")
    public WebElement addNewAddressButton;

    @FindBy (id = "firstname")
    public WebElement firstNameInput;

    @FindBy (id = "lastname")
    public WebElement lastNameInput;

    @FindBy (id = "address1")
    public WebElement addressInput;

    @FindBy (id = "city")
    public WebElement cityInput;

    @FindBy (id = "postcode")
    public WebElement zipCodeInput;

    @FindBy (id = "phone")
    public WebElement homePhoneNumeberInput;

    @FindBy (id = "alias")
    public WebElement myAddressInput;

    @FindBy (id = "submitAddress")
    public WebElement saveButton;

    @FindBy(id = "id_state")
    public WebElement countrySelect;

    public MyAddressesPage(WebDriver driver) {
        super(driver);
    }

    public void setStateSelect(String country) {
        Select select = new Select(countrySelect);
        select.selectByVisibleText(country);
    }
    public int getNumberOfAddedAddresses(){
        return driver.findElements(By.xpath("//*[@id='center_column']//div[@class='col-xs-12 col-sm-6 address']")).size();
    }

}
