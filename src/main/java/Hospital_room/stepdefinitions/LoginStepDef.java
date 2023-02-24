package Hospital_room.stepdefinitions;
import Hospital_room.pages.LoginPage;
import Hospital_room.pages.MainPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
public class LoginStepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage nhsMainPage = new LoginPage(driver);
    MainPage mainPage = new MainPage(driver);

    @Given("User navigates to the NHS website")
    public void user_navigates_to_the_NHS_website() {
        driver.get(ConfigReader.readProperty("urlNHS"));
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        nhsMainPage.enterUsernamePassword(ConfigReader.readProperty("username"),
                ConfigReader.readProperty("password"));
    }

    @Then("User click Sign in button")
    public void user_click_Sign_in_button() {
        nhsMainPage.successSignIn();
    }

    @Then("User verifies the title is NHS Patient")
    public void user_verifies_the_title_is_NHS_Patient() {
        mainPage.verifyTitleOfThePage(driver, "NHS  patients");
    }

}


