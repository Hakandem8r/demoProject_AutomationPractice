package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.security.PublicKey;

public class parent {
    WebDriver driver;
    WebDriverWait wait;

    public parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 15);
    }

    public void clickFuntion(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        //scrollToElement();
        element.clear();
        element.sendKeys(value);
    }

    public void selectElementFromDropdown(WebElement dropdown, String element){
        Select slc=new Select(dropdown);
        slc.selectByVisibleText(element);
    }


    public void Assertion(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));

        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My Message= " + actual.getText());
    }
}
