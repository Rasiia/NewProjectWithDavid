package Hospital_room.stepdefinitions;
import Hospital_room.pages.AddpatientPage;
import Hospital_room.pages.LoginPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
public class AddpatientSTEPD {
    WebDriver driver = DriverHelper.getDriver();
    AddpatientPage addpatientPage = new AddpatientPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    LoginPage nhsMainPage = new LoginPage(driver);

    @Given("user navigates to the {string}")
    public void user_navigates_to_the(String string) {
        driver.get(ConfigReader.readProperty("urlNHS"));

    }

    @When("User enters username and password {string}{string}")
    public void user_enters_username_and_password(String username, String password) {
        nhsMainPage.enterUsernamePassword(ConfigReader.readProperty("username"), ConfigReader.readProperty("password"));
    }

    @When("And User click Sign in button")
    public void and_User_click_Sign_in_button() {
        nhsMainPage.successSignIn();
    }


    @When("user click the add patient button on the left side i the page")
    public void user_click_the_add_patient_button_on_the_left_side_i_the_page() throws InterruptedException {
        addpatientPage.AddButton();
    }

    @When("user provides the information First Name,'Last Name,'Hospital no','Date of birth','Sex','Male' ,' Female'")
    public void user_provides_the_information_First_Name_Last_Name_Hospital_no_Date_of_birth_Sex_Male_Female() throws InterruptedException {
        addpatientPage.provideInformation("R", "Danii", "777", "25.02.2023", "Female");
    }


    @When("user click disease checkbox")
    public void user_click_disease_checkbox() throws InterruptedException {
        addpatientPage.AddButton();

    }

    @When("user clicks the add patient button")
    public void user_clicks_the_add_patient_button() throws InterruptedException {
        addpatientPage.AddButton();
    }

    @Then("user should be able to see patient is added to the main page under Patients waiting")
    public void user_should_be_able_to_see_patient_is_added_to_the_main_page_under_Patients_waiting() {


    }
}
