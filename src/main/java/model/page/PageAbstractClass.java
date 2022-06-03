package model.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;
import static org.testng.Assert.assertEquals;


public abstract class PageAbstractClass {

    private final WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void clickFunction(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
        sendKeysElement.sendKeys(Keys.ENTER);
    }

    public void selectElementFromDropdown(WebElement dropdown, String element) {
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }

    public void Assertion(List<WebElement> actual, int expected) {
        assertEquals(actual.size(), expected);
        System.out.println("size --->>>" + actual.size());
    }
}



