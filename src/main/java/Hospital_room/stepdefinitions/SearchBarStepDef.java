package Hospital_room.stepdefinitions;
import Hospital_room.pages.SearchBarPage;
import Utils.DriverHelper;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
public class SearchBarStepDef {


    WebDriver driver = DriverHelper.getDriver();
   SearchBarPage searchBarPage = new SearchBarPage(driver);
    @Then("user should see in dashboard page you can search rooms with name")
    public void user_should_see_in_dashboard_page_you_can_search_rooms_with_name() throws InterruptedException {
        searchBarPage.Name("David");
    }

    @Then("user should able to see search patients in room with their number or name")
    public void user_should_able_to_see_search_patients_in_room_with_their_number_or_name() throws InterruptedException {
      searchBarPage.Number("54");
    }

    @Then("validate all search functions are working for rooms and patients in room")
    public void validate_all_search_functions_are_working_for_rooms_and_patients_in_room() {
     searchBarPage.validate("SearchRoom","SearchPatient");

    }
}