package Hospital_room.pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPatientPage {
    public SearchPatientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@value='Schizophrenia']")
    WebElement disease;

    @FindBy(xpath = "//input[@value='Add patient']")
    WebElement addbutton;


    @FindBy(xpath = "//input[@aria-controls='patients-waiting']")
    WebElement patientWaiting;


    public void search() throws InterruptedException {
        disease.click();
        Thread.sleep(2000);
    }

    public void search2() throws InterruptedException {
        Thread.sleep(2000);
        addbutton.click();
    }

    public void Name() throws InterruptedException {
        patientWaiting.sendKeys("Abc");
        Thread.sleep(2000);
        this.patientWaiting.clear();

    }

    public void LastName() throws InterruptedException {
        Thread.sleep(2000);
        patientWaiting.sendKeys("abc");
        this.patientWaiting.clear();

    }
    public void fullName() throws InterruptedException {
        Thread.sleep(2000);
        patientWaiting.sendKeys("Abc","abc");
        this.patientWaiting.clear();

    }
    public void Number() throws InterruptedException {
        Thread.sleep(2000);
        patientWaiting.sendKeys("45");
    }


public void validateSearchPatientWaiting(String patientWaiting){
    Assert.assertEquals(patientWaiting,patientWaiting);
}

    }
