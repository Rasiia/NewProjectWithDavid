package Hospital_room.pages;
import Utils.DriverHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddpatientPage {
    public AddpatientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[@href='/app/addpatient']")
    WebElement Add;
    @FindBy(id = "first-name")
    WebElement FirstName;
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement LastName;
    @FindBy(xpath = "//input[@name='hospitalNumber']")
    WebElement Hospital;
    @FindBy(xpath = "//input[@name='dateOfBirth']")
    WebElement Datebirth;
    @FindBy(xpath = "//label[@class='btn btn-primary']")
    WebElement Sex;
    @FindBy(xpath = " //input[@type='checkbox']")
    WebElement checkbox;

    @FindBy(xpath = "//input[@value='Add patient']")
    WebElement addpatientbutton;


    public void AddButton() throws InterruptedException {
        Thread.sleep(2000);
        Add.click();
        Thread.sleep(2000);
    }


    public void provideInformation(String FirstName, String LastName, String Hospital, String Datebirth, String Sex) throws InterruptedException {

        Thread.sleep(2000);
        this.FirstName.sendKeys(FirstName);
        Thread.sleep(2000);
        this.LastName.sendKeys(LastName);
        Thread.sleep(2000);
        this.Hospital.sendKeys(Hospital);
        Thread.sleep(2000);
        this.Datebirth.sendKeys(Datebirth);
        Thread.sleep(2000);
        this.Sex.sendKeys(Sex);
    }

    public void add() throws InterruptedException {

        Thread.sleep(2000);
        checkbox.click();
        Thread.sleep(2000);

    }
    public void clik() throws InterruptedException {
        Thread.sleep(2000);
        addpatientbutton.click();
    }
    }




