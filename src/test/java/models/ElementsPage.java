package models;

import base.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ElementsPage extends BasePage {
    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header']")
    private WebElement namePage;
    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement btnTextBox;
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

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public String getNamePage() {

        return namePage.getText();
    }

    public ElementsPage clickTextBox() {
        btnTextBox.click();

        return this;
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

    public String getErrorEmailCssValue(){
        TestUtils.scrollToElement(getDriver(), inputEmail);
        return inputEmail.getCssValue("border");
    }
}
