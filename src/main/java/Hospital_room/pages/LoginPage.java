package Hospital_room.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement username;
    @FindBy(xpath = "//input[@id='inputPassword']")
    WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    WebElement SignIn;

    @FindBy(xpath = "\"//button[@type='submit']\"")
    WebElement errorMessage;

    public void enterUsernamePassword(String username, String passWord) {
        this.username.sendKeys(username);
        this.password.sendKeys(passWord);
    }

    public void successSignIn() {
        SignIn.click();
    }

    public boolean getErrorMessage(String expectedMessage) {
        return this.errorMessage.getText().trim().equals(errorMessage);

    }
}