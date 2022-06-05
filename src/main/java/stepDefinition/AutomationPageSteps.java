package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.page.AutomationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import java.time.Duration;

public class AutomationPageSteps {

    AutomationPage autoPage = new AutomationPage();

    @Given("navigate to website")
    public void navigate_to_website() {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://obss.com.tr/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        try {
            driver.findElement(By.id("cookieAcceptance")).click();
        } catch (Exception ex) {
            // do nothing if cookie pop-up doesn't display
        }
    }

    @Given("click on search icon")
    public void click_on_search_icon() {
        autoPage.clickOnSearchIcon();
    }

    @When("type Automation on search box")
    public void type_automation_on_search_box() {
        autoPage.typeSearchingKey();
    }

    @Then("verify the searching results")
    public void verify_the_searching_results() {
        autoPage.assertSearchResults();
    }

    @When("click on first result")
    public void click_On_First_Result() {
        autoPage.clickOnFirstSearchResult();
    }

    @Then("verify Testing and Automation page is opened")
    public void verify_Testing_And_Automation_Page_Is_Opened() {
        autoPage.assertAutomationPageOpen();
    }

    @When("scroll to the end")
    public void scroll_To_The_End() {
        autoPage.scrollToEndPage();
    }

    @Then("verify the page footer")
    public void verify_The_Page_Footer() {
       autoPage.assertPageFooter();
    }
    @After
    public void quitDriver() throws InterruptedException{
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
