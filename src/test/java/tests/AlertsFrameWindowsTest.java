package tests;

import base.BaseTest;
import models.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsFrameWindowsTest extends BaseTest {
    @Test
    public void testAlert() {
        String actualResult = new HomePage(getDriver())
                .goAlertsFrameWindows()
                .clickAlertsSideMenu()
                .clickButtonSeeAlert()
                .getTextAlert();

        Assert.assertEquals(actualResult, "You clicked a button");
    }

    @Test
    public void testFrames() {
        String actualResult = new HomePage(getDriver())
                .goAlertsFrameWindows()
                .clickFramesSideMenu()
                .switchToIframe()
                .getTextIframe();

        Assert.assertEquals(actualResult, "This is a sample page");
    }

}