import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenCategoryPage extends Page {
    public WomenCategoryPage(WebDriver driver) {
        super(driver);
    }

    WebElement findElementByTitle(String clotheTitle) {
        return driver.findElement(By.xpath("//*[@id='center_column']/ul/li//a[@class='product-name' and @title='" + clotheTitle + "']"));
    }

}

