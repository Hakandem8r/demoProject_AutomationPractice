package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjectModel.contactUs;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class contactUs_steps {

    WebDriver driver;

    contactUs contactUs=new contactUs();

    @Given("navigate to website")
    public void navigateToWebsite() {

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("click on contact us button")
    public void clickOnContactUsButton() {
        contactUs.findElementAndClickFunction("contactUsBtn");
    }

    @And("select Subject Heading")
    public void selectSubjectHeading() {
        contactUs.selectFromDropdown();
    }

    @And("type the email")
    public void typeTheEmail() {
        contactUs.findElementAndSendKeysFunction("emailInput","hd@gmail.com");
    }

    @And("type Order reference")
    public void typeOrderReference() {
        contactUs.findElementAndSendKeysFunction("orderReference", "order987");
    }

    @And("type a message")
    public void typeAMessage() {
        contactUs.findElementAndSendKeysFunction("messageBox","Order processes was successful");
    }

    @When("click on send button")
    public void clickOnSendButton() {
        contactUs.findElementAndClickFunction("sendBtn");
    }

    @Then("verify success message")
    public void verifySuccessMessage() {
        contactUs.assertMyMessage();
    }
}
