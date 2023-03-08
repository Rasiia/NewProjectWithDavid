package Hospital_room.pages;

import Utils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLoginPage {
    public NewLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href='/app/systemsettings']")
    WebElement systemSetting;

    @FindBy(xpath = "//input[@placeholder='Enter username...']")
    WebElement name;

    @FindBy(xpath = "//input[@placeholder='Enter password...']")
    WebElement passport;

    @FindBy(xpath = "//button[. ='Add user']")
    WebElement addUser;

   public void systemset(){
       systemSetting.click();
   }

   public void name(String name,String password) throws InterruptedException {
       Thread.sleep(2000);
    this.name.sendKeys("amina");
       Thread.sleep(2000);
    this. passport.sendKeys("amina");
    this.addUser.click();
   }

   public void addUser() throws InterruptedException {
       Thread.sleep(2000);
      this.systemSetting.click();
   }

    }

