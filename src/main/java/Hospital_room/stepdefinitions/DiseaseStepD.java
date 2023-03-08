package Hospital_room.stepdefinitions;
import Hospital_room.pages.DashboardPage;
import Hospital_room.pages.DiseasePage;
import Hospital_room.pages.LoginPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
public class DiseaseStepD {

    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage= new LoginPage(driver);
    LoginPage nhsMainPage = new LoginPage(driver);
    DiseasePage diseasePage = new DiseasePage(driver);
    @Given("User navigates to the NHS")
    public void user_navigates_to_the_NHS() {
        driver.get(ConfigReader.readProperty("urlNHS"));
    }

    @When("User enters correct credentials")
    public void user_enters_correct_credentials() {
        nhsMainPage.enterUsernamePassword(ConfigReader.readProperty("username"), ConfigReader.readProperty("password"));
    }

    @When("User  successfully logged in")
    public void user_successfully_logged_in() {
        nhsMainPage.successSignIn();
    }

    @When("the user clicks the system setting the user should be able to add the disease with name adn score")
    public void the_user_clicks_the_system_setting_the_user_should_be_able_to_add_the_disease_with_name_adn_score() throws InterruptedException {
     diseasePage.enter("pain");
    }

    @When("all the diseases the system will be displayed in a table by default order of disease name")
    public void all_the_diseases_the_system_will_be_displayed_in_a_table_by_default_order_of_disease_name() throws InterruptedException {
    diseasePage.enterU("pain","5");
    }

    @When("user will be able to delete the created diseases")
    public void user_will_be_able_to_delete_the_created_diseases() throws InterruptedException {
    diseasePage.name();
    }


}
