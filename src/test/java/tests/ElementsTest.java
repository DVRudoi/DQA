package tests;

import base.BaseTest;
import base.TestUtils;
import models.ElementsPage;
import models.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ElementsTest extends BaseTest {
    private static final String RANDOM_STR = TestUtils.getRandomStr(5);
    private static final String RANDOM_EMAIL = String.format("%s@gmail.com", RANDOM_STR);

    @Test
    public void testTextBox() {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add(String.format("Name:%s", RANDOM_STR));
        expectedResult.add(String.format("Email:%s", RANDOM_EMAIL));
        expectedResult.add(String.format("Current Address :%s", RANDOM_STR));
        expectedResult.add(String.format("Permananet Address :%s", RANDOM_STR));

        List<String> actualResult = new HomePage(getDriver())
                .goElements()
                .clickTextBox()
                .setFullName(RANDOM_STR)
                .setEmail(RANDOM_EMAIL)
                .setCurrentAddress(RANDOM_STR)
                .setPermanentAddress(RANDOM_STR)
                .clickSubmit()
                .getResultText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testErrorEmail() {
        String actualResult = new HomePage(getDriver())
                .goElements()
                .clickTextBox()
                .setEmail(RANDOM_STR)
                .clickSubmit()
                .getErrorEmailCssValue();

        Assert.assertTrue(actualResult.contains("rgb(255, 0, 0)"));
    }
}
