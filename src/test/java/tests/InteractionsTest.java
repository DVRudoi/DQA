package tests;

import base.BaseTest;
import models.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractionsTest extends BaseTest {
    @Test
    public void testDroppable() {
        String actualResult = new HomePage(getDriver())
                .goInteractions()
                .clickDroppableSideMenu()
                .selectTabAccept()
                .dragAndDropElement()
                .getTextDropBox();

        Assert.assertEquals(actualResult, "Dropped!");
    }

}
