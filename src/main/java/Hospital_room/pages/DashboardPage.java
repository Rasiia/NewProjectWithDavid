package Hospital_room.pages;
import Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DashboardPage {

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='patients-with-rooms-live']")
    WebElement patientsWithRooms;
    @FindBy(xpath = "//div[@id='patients-waiting-live']")
    WebElement patientsWaiting;
    @FindBy(xpath = "//div[@id='free-rooms-live']")
    WebElement freeRooms;


    public void WithRoom() {
     patientsWithRooms.isDisplayed();
     patientsWaiting.isDisplayed();
    }
    public void freerooms(){
       freeRooms.isDisplayed();
    }
    public void verifyText(String patientWithRoom, String waitingPatients, String freeRoom) {
        Assert.assertEquals(patientsWithRooms.getText(), patientWithRoom);
        Assert.assertEquals(patientsWaiting.getText(), waitingPatients);
        Assert.assertEquals(freeRooms.getText(), freeRoom);


    }
}