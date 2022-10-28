package tests;

import base.BaseTest;
import models.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{"Elements"},
                {"Forms"},
                {"Alerts, Frame & Windows"},
                {"Widgets"},
                {"Interactions"},
                {"Book Store"}};
    }

    @Test(dataProvider = "data-provider")
    public void testCheckCardBody(String str) {
        String actualText = new HomePage(getDriver())
                .clickCardBody(str)
                .getMainHeader();

        Assert.assertEquals(actualText, str);
    }

    @Test
    public void testCheckBtnElements() {
        String actualText = new HomePage(getDriver())
                .goElements()
                .getMainHeader();

        Assert.assertEquals(actualText, "Elements");
    }

    @Test
    public void testCheckBtnForms() {
        String actualText = new HomePage(getDriver())
                .goForms()
                .getMainHeader();

        Assert.assertEquals(actualText, "Forms");
    }

    @Test
    public void testCheckBtnAlertsFrameWindows() {
        String actualText = new HomePage(getDriver())
                .goAlertsFrameWindows()
                .getMainHeader();

        Assert.assertEquals(actualText, "Alerts, Frame & Windows");
    }

    @Test
    public void testCheckBtnWidgets() {
        String actualText = new HomePage(getDriver())
                .goWidgets()
                .getMainHeader();

        Assert.assertEquals(actualText, "Widgets");
    }

    @Test
    public void testCheckBtnInteractions() {
        String actualText = new HomePage(getDriver())
                .goInteractions()
                .getMainHeader();

        Assert.assertEquals(actualText, "Interactions");
    }

    @Test
    public void testCheckBtnBookStoreApplication() {
        String actualText = new HomePage(getDriver())
                .goBookStoreApplication()
                .getMainHeader();

        Assert.assertEquals(actualText, "Book Store");
    }

}
