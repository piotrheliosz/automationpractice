import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Scenario {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        //System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        System.setProperty( "webdriver.firefox.marionette", "./geckodriver.exe" );

        //driver = new ChromeDriver();
        driver = new FirefoxDriver(); //ver 48.0b2

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.singInLink.click();
        loginPage.sendEmail("ruca2@fnzm.net");
        loginPage.sendPassword("qwerty");
        loginPage.singIn();

    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

}
