import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Sign in")
    WebElement singInLink;

    void sendEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    void sendPassword(String password) {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    void singIn() {
        driver.findElement(By.id("SubmitLogin")).click();
    }
}
