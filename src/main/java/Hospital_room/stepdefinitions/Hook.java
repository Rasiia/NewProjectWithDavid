package Hospital_room.stepdefinitions;

import Utils.BrowserUtils;
import Utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
public class Hook {
    public WebDriver driver;

    @Before
    public void setup(){
        driver = DriverHelper.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
   @After
    public void tearDown(){
        BrowserUtils.getScreenShot(driver,"Hospital_room");
        driver.quit();

}


    }

