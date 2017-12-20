import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.UUID;

public class MyAddressesPage extends Page {
    public MyAddressesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "submitAddress")
    WebElement saveButton;

    @FindBy(xpath = "//*[@id='center_column']//a[@title='Add an address']")
    private WebElement addNewAddressButton;

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "address1")
    private WebElement addressInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "postcode")
    private WebElement zipCodeInput;

    @FindBy(id = "phone")
    private WebElement homePhoneNumeberInput;

    @FindBy(id = "alias")
    private WebElement myAddressInput;

    @FindBy(id = "id_state")
    private WebElement countrySelect;

    private void setStateSelect(String country) {
        Select select = new Select(countrySelect);
        select.selectByVisibleText(country);
    }

    void fillAllFieldsOfMyNewAddress() {
        addNewAddressButton.click();
        firstNameInput.sendKeys("firstName");
        lastNameInput.sendKeys("lastName");
        addressInput.sendKeys("myAddress");
        cityInput.sendKeys("myCity");
        zipCodeInput.sendKeys("33333");
        setStateSelect("Puerto Rico");
        homePhoneNumeberInput.sendKeys("123456");
        myAddressInput.clear();
        myAddressInput.sendKeys(UUID.randomUUID().toString().replaceAll("-", ""));
    }

    int getNumberOfAddedAddresses() {
        return driver.findElements(By.xpath("//*[@id='center_column']//div[@class='col-xs-12 col-sm-6 address']")).size();
    }

}
