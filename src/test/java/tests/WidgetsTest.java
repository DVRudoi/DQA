package tests;

import base.BaseTest;
import models.HomePage;
import models.WidgetsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WidgetsTest extends BaseTest {
    @Test
    public void testTooltipInner() {
        String actualResult = new HomePage(getDriver())
                .goWidgets()
                .clickToolTipsSideMenu()
                .moveToHoverMeToSee()
                .getTextTooltipInner();

        Assert.assertEquals(actualResult, "You hovered over the Button");
    }

    @Test
    public void testProgressBar() {
         WidgetsPage newWidgetsPage = new HomePage(getDriver())
                .goWidgets()
                .clickProgressBarSideMenu()
                .clickStart()
                .waitFullLoad()
                .clickReset();

        Assert.assertEquals(newWidgetsPage.getValueProgressBar(), "0");
        Assert.assertEquals(newWidgetsPage.getTextButton(), "Start");
    }

}
