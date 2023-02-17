package Hospital_room.tests;

import Hospital_room.pages.MainPage;
import org.junit.Assert;


public class MainTest extends TestBase {


    public void validateUrlAndHeader() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "http://www.techtorialacademy.link/app");

    }
}
