package Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class DriverHelper {
    // public static Webdriver driver;
   public static WebDriver driver;

    //private constructor
    public DriverHelper() {

    }

    public static WebDriver getDriver() {

        if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
            //  String browser="chrome";
            switch (ConfigReader.readProperty("browser")) {

                case "chrome":
                    ChromeOptions co= new ChromeOptions();
                    co.addArguments("--remote-allow-origins=*");
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(co);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }
}
