package tests;

import base.BaseTest;
import models.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    @Test
    public void testCheckBtnElements(){
        String actualText = new HomePage(getDriver())
                .goElements()
                .getNamePage();

        Assert.assertEquals(actualText, "Elements");
    }
    @Test
    public void testCheckBtnForms(){
        String actualText = new HomePage(getDriver())
                .goForms()
                .getNamePage();

        Assert.assertEquals(actualText, "Forms");
    }
    @Test
    public void testCheckBtnAlertsFrameWindows(){
        String actualText = new HomePage(getDriver())
                .goAlertsFrameWindows()
                .getNamePage();

        Assert.assertEquals(actualText, "Alerts, Frame & Windows");
    }
    @Test
    public void testCheckBtnWidgets(){
        String actualText = new HomePage(getDriver())
                .goWidgets()
                .getNamePage();

        Assert.assertEquals(actualText, "Widgets");
    }
    @Test
    public void testCheckBtnInteractions(){
        String actualText = new HomePage(getDriver())
                .goInteractions()
                .getNamePage();

        Assert.assertEquals(actualText, "Interactions");
    }
    @Test
    public void testCheckBtnBookStoreApplication(){
        String actualText = new HomePage(getDriver())
                .goBookStoreApplication()
                .getNamePage();

        Assert.assertEquals(actualText, "Book Store");
    }

}
