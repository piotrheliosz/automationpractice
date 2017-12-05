import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Page {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='block_top_menu']//li/a[@title='Women']")
    public WebElement womenSectionLink;

    public void goToMyAccountSection(String sectionText) {
        driver.findElement(By.xpath("//*[@id='center_column']//span[text()='" + sectionText + "']")).click();
    }

}
