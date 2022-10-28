package models;

import base.TestUtils;
import models.BasePages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class HomePage extends BasePage {
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement btnElements;
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement btnForms;
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement btnAlertsFrameWindows;
    @FindBy(xpath = "//h5[text()='Widgets']")
    private WebElement btnWidgets;
    @FindBy(xpath = "//h5[text()='Interactions']")
    private WebElement btnInteractions;
    @FindBy(xpath = "//h5[text()='Book Store Application']")
    private WebElement btnBookStoreApplication;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ElementsPage clickCardBody(String str) {
        WebElement webElement = getDriver().findElement(By.xpath(String.format("//h5[text()[contains(.,'%s')]]", str)));
        TestUtils.scrollToElement(getDriver(), webElement);
        webElement.click();

        return new ElementsPage(getDriver());
    }

    public ElementsPage goElements() {
        TestUtils.scrollToElement(getDriver(), btnElements);
        btnElements.click();

        return new ElementsPage(getDriver());
    }

    public ElementsPage goForms() {
        TestUtils.scrollToElement(getDriver(), btnForms);
        btnForms.click();

        return new ElementsPage(getDriver());
    }

    public ElementsPage goAlertsFrameWindows() {
        TestUtils.scrollToElement(getDriver(), btnAlertsFrameWindows);
        btnAlertsFrameWindows.click();

        return new ElementsPage(getDriver());
    }

    public ElementsPage goWidgets() {
        TestUtils.scrollToElement(getDriver(), btnWidgets);
        btnWidgets.click();

        return new ElementsPage(getDriver());
    }

    public ElementsPage goInteractions() {
        TestUtils.scrollToElement(getDriver(), btnInteractions);
        btnInteractions.click();

        return new ElementsPage(getDriver());
    }

    public ElementsPage goBookStoreApplication() {
        TestUtils.scrollToElement(getDriver(), btnBookStoreApplication);
        btnBookStoreApplication.click();

        return new ElementsPage(getDriver());
    }

}
