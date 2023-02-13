package Hospital_room.tests;
import Hospital_room.pages.LoginPage;
import Hospital_room.pages.MainPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test()
    public void Validate() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        MainPage  mainPage = new MainPage(driver);
        mainPage.actualHeader();


    }
}