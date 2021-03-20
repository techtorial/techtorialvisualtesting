package steps;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeSteps {

    protected WebDriver driver;

    @BeforeStep
    public void setup(Scenario scenario){

    }

    @Given("the user navigate to techtorial")
    public void the_user_navigate_to_techtorial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.techtorialacademy.com/about-us");
    }

}
