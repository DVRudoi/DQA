package models;

import models.BasePages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractionsPage extends BasePage {
    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header']")
    private WebElement mainHeader;
    @FindBy(xpath = "//span[text()='Droppable']")
    private WebElement btnSideMenuDroppable;
    @FindBy(id = "droppableExample-tab-accept")
    private WebElement tabAccept;
    @FindBy(xpath = "//div[@id='droppableExample-tabpane-accept']//div[@id='acceptable']")
    private WebElement dragBox;
    @FindBy(xpath = "//div[@id='droppableExample-tabpane-accept']//div[@id='droppable']")
    private WebElement dropBox;
    @FindBy(xpath = "//div[@class='drop-box ui-droppable ui-state-highlight']/p")
    private WebElement titleDropBox;

    public InteractionsPage(WebDriver driver) {
        super(driver);
    }

    public String getMainHeader() {
        return mainHeader.getText();
    }

    public InteractionsPage clickDroppableSideMenu() {
        btnSideMenuDroppable.click();

        return this;
    }

    public InteractionsPage selectTabAccept() {
        tabAccept.click();

        return this;
    }

    public InteractionsPage dragAndDropElement() {
        getActions()
                .dragAndDrop(dragBox, dropBox)
                .perform();

        return this;
    }

    public String getTextDropBox() {
        return titleDropBox.getText();
    }

}
