package Hospital_room.stepdefinitions;
import Hospital_room.pages.DashboardPage;
import Hospital_room.pages.LoginPage;
import Hospital_room.pages.MainPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
public class DashboardStepDef {

    WebDriver driver = DriverHelper.getDriver();
    DashboardPage dashboardPage = new DashboardPage(driver);
    LoginPage nhsMainPage = new LoginPage(driver);


    @When("User is successfully logged in")
    public void user_is_successfully_logged_in() {
        nhsMainPage.successSignIn();

    }

    @Then("User should be able to see {int} cards with numbers the information of Patients with rooms")
    public void user_should_be_able_to_see_cards_with_numbers_the_information_of_Patients_with_rooms(Integer int1) {

    }
    @Then("waiting Free rooms")
    public void waiting_Free_rooms() {
    }

    @Then("User validates the Free rooms Patients with rooms waiting free rooms")
    public void user_validates_the_Free_rooms_Patients_with_rooms_waiting_free_rooms() {
        dashboardPage.verifyText("Patients with rooms", "Patients waiting", "Free rooms");

    }


}