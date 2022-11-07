package models;

import base.TestUtils;
import models.BasePages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsFrameWindowsPage extends BasePage {
    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header']")
    private WebElement mainHeader;
    @FindBy(id = "alertButton")
    private WebElement alertButton;
    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement btnSideMenuAlerts;
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement btnSideMenuFrames;
    @FindBy(id = "frame1")
    private WebElement iframe;
    @FindBy(tagName = "h1")
    private WebElement textIframe;

    public AlertsFrameWindowsPage(WebDriver driver) {
        super(driver);
    }

    public String getMainHeader() {
        return mainHeader.getText();
    }

    public AlertsFrameWindowsPage clickAlertsSideMenu() {
        btnSideMenuAlerts.click();

        return this;
    }

    public AlertsFrameWindowsPage clickButtonSeeAlert() {
        alertButton.click();

        return this;
    }

    public String getTextAlert() {
        return TestUtils.interactionsSimpleAlert(getDriver(), getWait10());
    }

    public AlertsFrameWindowsPage clickFramesSideMenu() {
        btnSideMenuFrames.click();

        return this;
    }

    public AlertsFrameWindowsPage switchToIframe() {
        getDriver().switchTo().frame(iframe);

        return this;
    }

    public String getTextIframe() {
        return textIframe.getText();
    }
}