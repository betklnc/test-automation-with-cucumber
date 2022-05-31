package model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage extends PageAbstractClass {

    WebDriver driver;

    public AutomationPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"search-icon\"]")
    private WebElement searchIcon;

    public void clickOnSearchIcon() {
        clickFunction(searchIcon);
    }

}
