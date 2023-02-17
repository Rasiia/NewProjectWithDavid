package Hospital_room.stepdefinitions;
import Hospital_room.pages.DashboardPage;
import Hospital_room.pages.LoginPage;
import Hospital_room.pages.MainPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
public class DashboardStepDef {

    WebDriver driver = DriverHelper.getDriver();
    DashboardPage dashboardPage =new DashboardPage(driver);

    @When("User is successfully logged in")
    public void user_is_successfully_logged_in() {

    }

    @Then("User should be able to see {int} cards with numbers the information of Patients with rooms")
    public void user_should_be_able_to_see_cards_with_numbers_the_information_of_Patients_with_rooms(Integer int1) {

    }

    @Then("waiting Free rooms")
    public void waiting_Free_rooms() {
        dashboardPage.verifyText("Patients with rooms", "Patients waiting", "Free rooms");

    }


    }


