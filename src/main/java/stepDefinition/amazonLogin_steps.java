package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonLogin_steps {
    @Given("go to Amazon website")
    public void goToAmazonWebsite() {
        System.out.println("The website is visited");
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        System.out.println("Login button is clicked");
    }

    @And("input a name")
    public void inputAName() {
        System.out.println("A name is given");
    }

    @And("input a password")
    public void inputAPassword() {
        System.out.println("A password is given");
    }

    @When("clicked on submit button")
    public void clickedOnSubmitButton() {
        System.out.println("Submit button is clicked");
    }

    @Then("verify the success message")
    public void verifyTheSuccessMessage() {
        System.out.println("Success message is verified");
    }
}
