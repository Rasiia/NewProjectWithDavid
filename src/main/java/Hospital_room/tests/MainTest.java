package Hospital_room.tests;

import Hospital_room.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends TestBase{

    @Test
    public void validateUrlAndHeader(){
        MainPage mainPage= new MainPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"http://www.techtorialacademy.link/app");
        Assert.assertEquals(mainPage.actualHeader(),"NHS patients");
    }
}

