package step_definiton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.page.AutomationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class AutomationPageSteps {

    private WebDriver driver;

    AutomationPage autoPage = new AutomationPage();

    @Given("navigate to website")
    public void navigate_to_website() {
        driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("https://obss.com.tr/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        try {
            driver.findElement(By.id("cookieAcceptance")).click();
        } catch (Exception ex) {
            // todo
        }
        //if(!driver.findElements(By.id("cookieAcceptance")).isEmpty()) {
        //    driver.findElement(By.id("cookieAcceptance")).click();
        //}
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
        autoPage.assertMyMessage();
    }


    @When("click on first result")
    public void clickOnFirstResult() {
        autoPage.clickOnFirstSearchResult();
    }
}
