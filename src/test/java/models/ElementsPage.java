package models;

import base.TestUtils;
import models.BasePages.BaseSideMenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ElementsPage extends BaseSideMenuPage {
    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header']")
    private WebElement mainHeader;
    @FindBy(id = "userName")
    private WebElement inputFullName;
    @FindBy(id = "userEmail")
    private WebElement inputEmail;
    @FindBy(id = "currentAddress")
    private WebElement inputCurrentAddress;
    @FindBy(id = "permanentAddress")
    private WebElement inputPermanentAddress;
    @FindBy(id = "submit")
    private WebElement btnSubmit;
    @FindBy(xpath = "//div/p")
    private List<WebElement> resultText;
    @FindBy(xpath = "//span[@class='rct-checkbox']/*")
    private List<WebElement> listBox;
    @FindBy(xpath = "//div[@id='result']/span")
    private List<WebElement> result;
    @FindBy(xpath = "//select[@aria-label='rows per page']")
    private WebElement selectAmountRows;
    @FindBy(xpath = "//div[@class='rt-tr-group']")
    private List<WebElement> amountRows;

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public String getMainHeader() {
        return mainHeader.getText();
    }

    public ElementsPage setFullName(String str) {
        inputFullName.sendKeys(str);

        return this;
    }

    public ElementsPage setEmail(String str) {
        inputEmail.sendKeys(str);

        return this;
    }

    public ElementsPage setCurrentAddress(String str) {
        inputCurrentAddress.sendKeys(str);

        return this;
    }

    public ElementsPage setPermanentAddress(String str) {
        inputPermanentAddress.sendKeys(str);

        return this;
    }

    public ElementsPage clickSubmit() {
        TestUtils.scrollToElement(getDriver(), btnSubmit);
        btnSubmit.click();

        return this;
    }

    public List<String> getResultText() {
        List<String> list = new ArrayList<>();
        for (WebElement webElement : resultText) {
            list.add(webElement.getText());
        }

        return list;
    }

    public String getErrorEmailCssValue() {
        TestUtils.scrollToElement(getDriver(), inputEmail);
        return inputEmail.getCssValue("border");
    }

    public ElementsPage clickMainCheckBox() {
        getDriver().findElement(By.xpath("//span[@class='rct-checkbox']/*")).click();

        return this;
    }

    public List<String> getText() {
        List<String> el = new ArrayList<>();
        for (WebElement str : listBox) {
            el.add(str.getAttribute("class"));
        }

        return el;
    }

    public List<String> getResult() {
        List<String> list = new ArrayList<>();
        for (WebElement str : result) {
            list.add(str.getText());
        }

        return list;
    }

    public enum EnumRowsTable {
        rows5(By.xpath("//select[@aria-label='rows per page']/option[@value='5']"), 5),
        rows10(By.xpath("//select[@aria-label='rows per page']/option[@value='10']"), 10),
        rows20(By.xpath("//select[@aria-label='rows per page']/option[@value='20']"), 20),
        rows25(By.xpath("//select[@aria-label='rows per page']/option[@value='25']"), 25),
        rows50(By.xpath("//select[@aria-label='rows per page']/option[@value='50']"), 50),
        rows100(By.xpath("//select[@aria-label='rows per page']/option[@value='100']"), 100);

        private final By locator;
        public final int amountRows;
        EnumRowsTable(By locator, int amountRows) {
            this.locator = locator;
            this.amountRows = amountRows;
        }

        public By getAmountRows() {
            return locator;
        }

        public int getExpectedAmountRows() {
            return amountRows;
        }

    }

    public ElementsPage changeSizeTable() {
        selectAmountRows.click();

        return this;
    }

    public ElementsPage select(By rows) {
        getDriver().findElement(rows).click();

        return this;
    }

    public int countRowsInTab() {
        return amountRows.size();
    }
}