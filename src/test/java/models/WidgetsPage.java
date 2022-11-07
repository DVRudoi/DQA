package models;

import models.BasePages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WidgetsPage extends BasePage {
    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header']")
    private WebElement mainHeader;
    @FindBy(xpath = "//span[text()='Tool Tips']")
    private WebElement btnSideMenuToolTips;
    @FindBy(id = "toolTipButton")
    private WebElement btnHoverMeToSee;
    @FindBy(xpath = "//div[@class='tooltip-inner']")
    private WebElement tooltipInner;
    @FindBy(xpath = "//span[text()='Progress Bar']")
    private WebElement btnSideMenuProgressBar;
    @FindBy(id = "startStopButton")
    private WebElement btnStartStop;
    @FindBy(xpath = "//div[@role='progressbar']")
    private WebElement progressBar;
    @FindBy(id = "resetButton")
    private WebElement btnReset;

    public WidgetsPage(WebDriver driver) {
        super(driver);
    }

    public String getMainHeader() {
        return mainHeader.getText();
    }

    public WidgetsPage clickToolTipsSideMenu() {
        btnSideMenuToolTips.click();

        return this;
    }

    public WidgetsPage moveToHoverMeToSee() {
        getActions()
                .moveToElement(btnHoverMeToSee)
                .perform();

        return this;
    }

    public String getTextTooltipInner() {
        return tooltipInner.getText();
    }

    public WidgetsPage clickProgressBarSideMenu() {
        btnSideMenuProgressBar.click();

        return this;
    }

    public WidgetsPage clickStart() {
        btnStartStop.click();

        return this;
    }

    public WidgetsPage waitFullLoad() {
        getWait20().until
                (ExpectedConditions
                        .attributeContains(progressBar, "aria-valuenow", "100")
                );

        return this;
    }

    public WidgetsPage clickReset() {
        getWait10().until(ExpectedConditions.visibilityOf(btnReset));
        btnReset.click();

        return this;
    }

    public String getValueProgressBar() {
        return progressBar.getAttribute("aria-valuenow");
    }

}
