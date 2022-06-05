package model.page;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.sql.SQLOutput;
import java.util.List;

public class AutomationPage extends PageAbstractClass {

    WebDriver driver;

    @FindBy(css = "article.search-post")
    private List<WebElement> rows;

    @FindBy(xpath = "//*[@id=\"search-icon\"]")
    private WebElement searchIcon;

    @FindBy(id = "search-box")
    private WebElement searchTextArea;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/article[1]/h2/a")
    private WebElement firstSearchResult;

    public AutomationPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickOnSearchIcon() {
        clickFunction(searchIcon);
    }

    public void typeSearchingKey() {
        sendKeysFunction(searchTextArea, "Automation");
    }

    public void assertMyMessage() {
        Assertion(rows, 8);
    }

    public void clickOnFirstSearchResult() {
        clickFunction(firstSearchResult);
    }
}
