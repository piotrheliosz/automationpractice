import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {

    WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\automationpractice\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.singInLink.click();
        loginPage.sendEmail("ruca2@fnzm.net");
        loginPage.sendPassword("qwerty");
        loginPage.singIn();

    }

    @After
    public void tearDown() {
        driver.close();
    }

}