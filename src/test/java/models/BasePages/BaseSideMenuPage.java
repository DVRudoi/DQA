package models.BasePages;

import models.ElementsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BaseSideMenuPage extends BasePage {
    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement btnTextBox;
    @FindBy(xpath = "//span[text()='Check Box']")
    private WebElement btnCheckBox;
    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement btnWebTables;

    public BaseSideMenuPage(WebDriver driver) {
        super(driver);
    }

    public ElementsPage clickTextBox() {
        btnTextBox.click();

        return new ElementsPage(getDriver());
    }

    public ElementsPage clickCheckBox() {
        btnCheckBox.click();

        return new ElementsPage(getDriver());
    }

    public ElementsPage clickWebTables() {
        btnWebTables.click();

        return new ElementsPage(getDriver());
    }

}
