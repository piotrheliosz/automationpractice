package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Sign in")
    public
    WebElement singInLink;

    public void sendEmail(String email) {
        Page.driver.findElement(By.id("email")).sendKeys(email);
    }

    public void sendPassword(String password) {
        Page.driver.findElement(By.id("passwd")).sendKeys(password);
    }

    public void singIn() {
        Page.driver.findElement(By.id("SubmitLogin")).click();
    }
}
