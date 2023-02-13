package Hospital_room.pages;
import Utils.BrowserUtils;
import Utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//input[@id='inputEmail']")
    WebElement Name;

    @FindBy(xpath = "//input[@id='inputPassword']")
    WebElement pass;

    @FindBy(xpath ="//button[@type='submit']")
    WebElement SignIn;

    public void login(){
      Name.sendKeys(ConfigReader.readProperty("username"));
      pass.sendKeys(ConfigReader.readProperty("password"));
        SignIn.click();
    }


}
