package pages;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }




    public void validatePage(Eyes eyes, WebDriver driver){

        eyes.open(driver,"Techtorial", BrowserUtils.getMethodName());
        eyes.setForceFullPageScreenshot(true);
        eyes.setMatchLevel(MatchLevel.EXACT);// it will compare pixel to pixel
        eyes.setMatchLevel(MatchLevel.STRICT);// it will compare the screenshot where as human eyes
        eyes.setMatchLevel(MatchLevel.CONTENT);// It will almost same with Strict except it will not compare the color
        eyes.setMatchLevel(MatchLevel.LAYOUT);
        // We can use this match level for dynamic content but layout is same all the time.
        eyes.checkWindow();
        eyes.close();

    }

    public void validateLogo(Eyes eyes, WebDriver driver){
        String methodName=new Throwable().getStackTrace()[0].getMethodName();
        eyes.open(driver, "Techtorial", methodName);
        eyes.checkElement(By.xpath("//div[@class='logo']"));
        eyes.close();
    }


}
