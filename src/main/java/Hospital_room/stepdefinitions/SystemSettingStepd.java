package Hospital_room.stepdefinitions;

import Hospital_room.pages.SystemSettingPage;
import Utils.DriverHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SystemSettingStepd {
       WebDriver driver = DriverHelper.getDriver();
       SystemSettingPage systemSettingPage= new SystemSettingPage(driver);

    @When("User clicks the system setting the user should be able to add the room with the room name")
    public void user_clicks_the_system_setting_the_user_should_be_able_to_add_the_room_with_the_room_name() throws InterruptedException {
    systemSettingPage.add();
    }

    @When("all the diseases from the system will be displayed in a table by default order of room name")
    public void all_the_diseases_from_the_system_will_be_displayed_in_a_table_by_default_order_of_room_name() throws InterruptedException {
    systemSettingPage.Name();
    systemSettingPage.Room();
    }

    @Then("the user will be able to delete the created diseases")
    public void the_user_will_be_able_to_delete_the_created_diseases()  {
        systemSettingPage.lastdelete();
    }
}