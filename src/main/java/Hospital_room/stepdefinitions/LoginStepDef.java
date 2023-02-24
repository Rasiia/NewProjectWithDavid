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

    @Given("user enters correct credentials")
    public void user_enters_correct_credentials() {
        nhsMainPage.enterUsernamePassword(ConfigReader.readProperty("username"),
                ConfigReader.readProperty("password"));
    }

    @When("User enters username and invalid password")
    public void user_enters_username_and_invalid_password() {
        nhsMainPage.enterUsernamePassword(ConfigReader.readProperty("user"),
                ConfigReader.readProperty("pass"));
    }

    @Then("User cannot login")
    public void user_cannot_login() {
        nhsMainPage.successSignIn();
    }

    @When("User enters username and blank password")
    public void user_enters_username_and_blank_password() {

    }

    @Then("User cannot login and receives error message")
    public void user_cannot_login_and_receives_error_message() {

    }
}



