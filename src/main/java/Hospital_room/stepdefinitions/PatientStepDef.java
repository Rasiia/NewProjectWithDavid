package Hospital_room.stepdefinitions;
import Hospital_room.pages.LoginPage;
import Hospital_room.pages.PatientsPage;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
public class PatientStepDef {

    WebDriver driver = DriverHelper.getDriver();
    PatientsPage patientsPage = new PatientsPage(driver);
     LoginPage loginPage=new LoginPage(driver) ;

    @Given("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        loginPage.successSignIn();
    }
    @When("user should be able to see {int} cards with numbers the information of Patients with rooms")
    public void user_should_be_able_to_see_cards_with_numbers_the_information_of_Patients_with_rooms(Integer int1) {

    }

    @Then("user able to see the headers with Information no, Patients with rooms,Room,Score")
    public void user_able_to_see_the_headers_with_Information_no_Patients_with_rooms_Room_Score() {
        patientsPage.VerifyText("Score", "Room", "PatientsWithRooms", "no");
    }
}