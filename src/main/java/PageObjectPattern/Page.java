package PageObjectPattern;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Page {

    static WebDriver driver;

    Page(WebDriver driver) {
        Page.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='exclusive']")
    public
    WebElement exclusiveButton;

    public void waitForElementVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.pollingEvery(200, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementInvisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.pollingEvery(200, TimeUnit.MICROSECONDS)
                .until(ExpectedConditions.invisibilityOf(element));
    }
}
