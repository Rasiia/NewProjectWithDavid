package Hospital_room.stepdefinitions;

import Hospital_room.pages.NewLoginPage;
import Utils.DriverHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewLoginStepDef {
    WebDriver driver = DriverHelper.getDriver();
    NewLoginPage newLoginPage = new NewLoginPage(driver);

    @When("User clicks the system setting the user should be able to add a new user")
    public void user_clicks_the_system_setting_the_user_should_be_able_to_add_a_new_user() {
        newLoginPage.systemset();
    }

    @When("User enters new username and password")
    public void user_enters_new_username_and_password() throws InterruptedException {
        newLoginPage.name("amina", "amina");

    }

    @Then("user can add user")
    public void user_can_add_user() throws InterruptedException {
        newLoginPage.addUser();
    }

    @Then("user can see all information displayed on the dashboard page should not change after loggig in with new user")
    public void user_can_see_all_information_displayed_on_the_dashboard_page_should_not_change_after_loggig_in_with_new_user() {
    List<WebElement>allheaders= driver.findElements(By.tagName("h3"));
    for(WebElement header:allheaders){
        System.out.println(header.getText().trim());
        Assert.assertTrue(header.getText().trim().toLowerCase().contains("allheaders"));
    }

    }
}

