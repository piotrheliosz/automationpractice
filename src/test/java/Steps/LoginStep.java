package Steps;

import PageObjectPattern.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginStep {

    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("^Navigate to login page$")
    public void navigateToLoginPage() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver.manage().window().setPosition(new Point(1920, 1));
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
    }


    @And("^Pass \"([^\"]*)\" and \"([^\"]*)\"$")
    public void passAnd(String username, String password) throws Throwable {
        System.out.println("I pass username and password");
        loginPage.singInLink.click();
        loginPage.sendEmail(username);
        loginPage.sendPassword(password);
    }

    @And("^Pass username and password following$")
    public void passUsernameAndPasswordFollowing(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        System.out.println(data.get(1).get(1));
        System.out.println(data.get(1).get(2));

    }

    @And("^Click on login button$")
    public void clickOnLoginButton() throws Throwable {
        System.out.println("I click on login button");
        loginPage.singIn();
    }

    @Then("^Should be login with my user$")
    public void shouldBeLoginWithMyUser() throws Throwable {
        System.out.println("I should be login with my user");
        ;
    }

    @And("^Browser is closed$")
    public void browserIsClosed() throws Throwable {
        driver.close();
    }
}
