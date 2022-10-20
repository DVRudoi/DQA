package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    private WebDriver driver;
    private ChromeOptions options;
    protected WebDriver getDriver() {
        return driver;
    }

    protected void getWeb (){
        getDriver().get("https://demoqa.com/");
    }

    @BeforeClass
    protected void before () {
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.addArguments("--window-size=1360,768");
        options.addArguments("--window-position=0,0");
    }

    @BeforeMethod
    protected void beforeTest(){
        driver = new ChromeDriver(options);
//        getDriver().manage().window().maximize(); //if need to maximize window;
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        getWeb();
    }

    @AfterMethod
    protected void afterTest() {
        getDriver().quit();
    }

}
