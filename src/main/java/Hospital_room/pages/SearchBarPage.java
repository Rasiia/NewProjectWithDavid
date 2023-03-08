package Hospital_room.pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchBarPage {

    public SearchBarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//input[@placeholder='Search patient in room...']")
        WebElement SearchPatient;
    @FindBy(xpath ="//input[@placeholder='Search room...']")
    WebElement SearchRoom;

    public void Name(String SearchPatient) throws InterruptedException {
        Thread.sleep(2000);
       this.SearchPatient.sendKeys(SearchPatient);
        Thread.sleep(2000);
    }

     public void Number(String SearchRoom) throws InterruptedException {
         Thread.sleep(2000);
        this.SearchRoom.sendKeys(SearchRoom);
}
    public void validate(String SearchRoom, String SearchPatient){
    Assert.assertEquals(SearchRoom,SearchRoom);
        Assert.assertEquals(SearchPatient,SearchPatient);
}

    }







