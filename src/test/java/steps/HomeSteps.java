package steps;

import com.applitools.eyes.selenium.Eyes;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.ConfigReader;
import utils.Driver;

public class HomeSteps {

    protected WebDriver driver;
    protected Eyes eyes;
    protected HomePage homePage;

    @BeforeStep
    public void setup(Scenario scenario){
        eyes=new Eyes();
        eyes.setApiKey(ConfigReader.getProperty("api.key"));

    }

    @Given("the user navigate to techtorial")
    public void the_user_navigate_to_techtorial() {
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("the user validates aboutus page")
    public void theUserValidatesAboutusPage() {
        homePage=new HomePage(driver);
        homePage.validatePage(eyes,driver);

    }

    @Then("the user validates the picture")
    public void theUserValidatesThePicture() {
        homePage.validateLogo(eyes,driver);
    }



}
