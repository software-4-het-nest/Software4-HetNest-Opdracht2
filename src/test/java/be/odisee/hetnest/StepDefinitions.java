package be.odisee.hetnest;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {
    WebDriver driver;

    @Given("^I am on the page where I can introduce a new aanbieding$")
    public void i_am_on_the_page_where_I_can_introduce_a_new_aanbieding() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to("http://localhost:8080/hetnest_war/nieuweAanbieding.html");
    }

    @When("^I enter \"([^\"]*)\" in the naam field$")
    public void i_enter_in_the_naam_field(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter \"([^\"]*)\" in the hoeveelheid field$")
    public void i_enter_in_the_hoeveelheid_field(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter \"([^\"]*)\" in the prijs field$")
    public void i_enter_in_the_prijs_field(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter \"([^\"]*)\" in the type field$")
    public void i_enter_in_the_type_field(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I press on the Save button$")
    public void i_press_on_the_Save_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the following on the screen$")
    public void i_should_see_the_following_on_the_screen(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @When("^I click the the Lijst van alle aanbiedingen link$")
    public void i_click_the_the_Lijst_van_alle_aanbiedingen_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a list containing \"([^\"]*)\"$")
    public void i_should_see_a_list_containing(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I close the browser$")
    public void i_close_the_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
