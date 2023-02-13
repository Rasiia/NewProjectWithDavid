package Hospital_room.tests;
import Hospital_room.pages.LoginPage;
import Utils.BrowserUtils;
import Utils.ConfigReader;
import Utils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;
    @BeforeMethod
    public void setUp() {

        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("urlNHS"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @AfterMethod
    public void tearDown(){
        BrowserUtils.getScreenShot(driver,"Hospital_room");
        driver.quit();
    }
}
