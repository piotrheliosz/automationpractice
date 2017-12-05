import org.junit.Test;

import java.util.UUID;

import static junit.framework.TestCase.assertTrue;

public class AddNewAddress extends Scenario {

    @Test
    public void newAddressShouldBeAdded() {

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.goToMyAccountSection("My addresses");

        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        int numberOfAddressesBefore = myAddressesPage.getNumberOfAddedAddresses();
        System.out.println("numberOfAddressesBefore: " + numberOfAddressesBefore);
        myAddressesPage.addNewAddressButton.click();
        myAddressesPage.firstNameInput.sendKeys("firstName");
        myAddressesPage.lastNameInput.sendKeys("lastName");
        myAddressesPage.addressInput.sendKeys("myAddress");
        myAddressesPage.cityInput.sendKeys("myCity");
        myAddressesPage.zipCodeInput.sendKeys("33333");
        myAddressesPage.setStateSelect("Puerto Rico");
        myAddressesPage.homePhoneNumeberInput.sendKeys("123456");
        myAddressesPage.myAddressInput.clear();
        myAddressesPage.myAddressInput.sendKeys(UUID.randomUUID().toString().replaceAll("-", ""));
        myAddressesPage.saveButton.click();
        int numberOfAddressesAfter = myAddressesPage.getNumberOfAddedAddresses();
        System.out.println("numberOfAddressesAfter: " + numberOfAddressesAfter);

        assertTrue(numberOfAddressesBefore < numberOfAddressesAfter);

    }

}
