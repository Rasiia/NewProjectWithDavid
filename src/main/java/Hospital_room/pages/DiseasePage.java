package Hospital_room.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DiseasePage {

    public DiseasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/app/systemsettings']")
    WebElement systemSetting;
    @FindBy(xpath = "//input[@name='diseaseName']")
    WebElement DiseaseName;
    @FindBy(xpath = "//input[@name='diseaseScore']")
    WebElement DiseaseScore;
    @FindBy(xpath = "//input[@value='Add disease']")
    WebElement addDisease;
    @FindBy(xpath = "//input[@value='Delete rooms']")
    WebElement deleteDisease;


    public void enter(String name) throws InterruptedException {
        Thread.sleep(1000);
        systemSetting.click();
    }

    public void enterU(String name, String score) throws InterruptedException {
        Thread.sleep(1000);
        this.DiseaseName.sendKeys("pain");
        Thread.sleep(1000);
        this.DiseaseScore.sendKeys("2");
    }

    public void enter() throws InterruptedException {
        Thread.sleep(1000);
        addDisease.click();
    }

    public void name() throws InterruptedException {
        Thread.sleep(1000);
         deleteDisease.click();
    }
}