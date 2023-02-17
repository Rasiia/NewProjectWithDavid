package Hospital_room.tests;
import Hospital_room.pages.LoginPage;
import Utils.BrowserUtils;
import Utils.ConfigReader;
import Utils.DriverHelper;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    public void setUp() {

        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("urlNHS"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    public void tearDown(){
        BrowserUtils.getScreenShot(driver,"Hospital_room");
        driver.quit();
    }
}
