package Hospital_room.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SystemSettingPage {

    public SystemSettingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[@href='/app/systemsettings']")
    WebElement systemSetting;

    @FindBy(xpath = "//input[@name='roomName']")
    WebElement RoomName;

    @FindBy(xpath = "//input[@value='Add room']")
    WebElement AddRoom;

    @FindBy(xpath = "")
    WebElement Select;
         @FindBy(xpath = "//input[@value='Room 19']")
         WebElement click;

    @FindBy(xpath = "//input[@value='Delete rooms']")
    WebElement DeleteRoom;



    public void add()  {

    systemSetting.click();
    }
    public void Name()  {

        RoomName.sendKeys("Room 199");

    }
        public void Room ()  {
            AddRoom.click();
        }

        public void sett()  {
       click.click();
        }

        public void lastdelete()   {
        DeleteRoom.click();
        }
    }

