package model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

public class AutomationPage extends PageAbstractClass {

    WebDriver driver;
    final String automationPageUrl = "https://obss.com.tr/en/yetkinlikler/yetenekler/yazilim-testi-otomasyonu/";

    @FindBy(css = "article.search-post")
    private List<WebElement> rows;

    @FindBy(xpath = "//*[@id=\"search-icon\"]")
    private WebElement searchIcon;

    @FindBy(id = "search-box")
    private WebElement searchTextArea;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/article[1]/h2/a")
    private WebElement firstSearchResult;

    @FindBy(xpath = "/html/body/div[5]")
    private WebElement pageFooter;



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

    public void assertSearchResults() {
        assertionSearchResults(rows, 8);
    }

    public void clickOnFirstSearchResult() {
        clickFunction(firstSearchResult);
    }

    public void assertAutomationPageOpen() {
        String currentUrl = driver.getCurrentUrl();
        assertionAutomationPageOpened(currentUrl, automationPageUrl);
    }

    public void scrollToEndPage() {
        scrollToEnd(10000);
    }

    public void assertPageFooter(){
        assertionPageFooter(pageFooter, true);
    }
}
