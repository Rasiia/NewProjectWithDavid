package Hospital_room.stepdefinitions;
import Hospital_room.pages.AddpatientPage;
import Hospital_room.pages.DiseasePage;
import Hospital_room.pages.LoginPage;
import Hospital_room.pages.SearchPatientPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class SearchPatientStepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage nhsMainPage = new LoginPage(driver);
    AddpatientPage addpatientPage = new AddpatientPage(driver);
    SearchPatientPage searchPatientPage = new SearchPatientPage(driver);
      DiseasePage diseasePage = new DiseasePage(driver);

    @Given("user navigates to the NHS website")
    public void user_navigates_to_the_nhs_website() {
        driver.get(ConfigReader.readProperty("urlNHS"));
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        nhsMainPage.enterUsernamePassword(ConfigReader.readProperty("username"), ConfigReader.readProperty("password"));
    }

    @When("User is successfully logged IN")
    public void user_is_successfully_logged_in() {
         nhsMainPage.successSignIn();
    }

    @Then("user should be able add a new patient to the NHS system")
    public void user_should_be_able_add_a_new_patient_to_the_nhs_system() throws InterruptedException {
        addpatientPage.AddButton();
    }


    @Then("user should see dashboard and with new patient is registered under patient waiting list")
    public void user_should_see_dashboard_and_with_new_patient_is_registered_under_patient_waiting_list() throws InterruptedException {
    addpatientPage.provideInformation("Abc","abc","45","24/03/2018","Female");
     searchPatientPage.search();
     searchPatientPage.search2();


    }

    @Then("user should use the search bar to search patient with their first name,last name,full name")
    public void user_should_use_the_search_bar_to_search_patient_with_their_first_name_last_name_full_name() throws InterruptedException {
    searchPatientPage.Name();
    searchPatientPage.LastName();
    searchPatientPage.fullName();
    }

    @Then("user should search bar to see patients with their hospital number")
    public void user_should_search_bar_to_see_patients_with_their_hospital_number() throws InterruptedException {
     searchPatientPage.Number();
    }

    @Then("User validate all search bar functions are working")
    public void user_validate_all_search_bar_functions_are_working() {
     searchPatientPage.validateSearchPatientWaiting(" patientWaiting");

    }
}
