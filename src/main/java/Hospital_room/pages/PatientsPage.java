package Hospital_room.pages;
import Utils.BrowserUtils;
import Utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
public class PatientsPage {
    public PatientsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = " //th[@class='sorting_desc']")
    WebElement Score;
    @FindBy(xpath = "//th[@class='sorting_asc'] ")
    WebElement Room;
    @FindBy(xpath = "//th[@class='sorting_asc'] ")
    WebElement PatientsWithRooms;
    @FindBy(xpath = "//th[@class='sorting']")
    WebElement no;


    public void VerifyText(String Room,String PatientsWithRooms,String no,String Score){

        }

    }

