package Steps;

import PageObjectPattern.MyAccountPage;
import PageObjectPattern.MyAddressesPage;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertEquals;

public class AddNewAddress extends Scenario {

    @Test
    public void newAddressShouldBeAdded() {

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.goToMyAccountSection("My addresses");

        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        int numberOfAddressesBefore = myAddressesPage.getNumberOfAddedAddresses();
        myAddressesPage.fillAllFieldsOfMyNewAddress();
        myAddressesPage.saveButton.click();
        int numberOfAddressesAfter = myAddressesPage.getNumberOfAddedAddresses();

        assertEquals((numberOfAddressesAfter - numberOfAddressesBefore), 1);

    }

}
