package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class contactUs extends parent{

    WebElement myElement;
    WebDriver driver;


    public contactUs() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this); //a keyword for FindBy's
    }

    @FindBy(xpath = "//a[text()='Contact us']")
    private WebElement contactUsBtn;

    @FindBy(id = "id_contact")
    private WebElement subjectHeadingDropdown;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(name = "id_order")
    private WebElement orderReference;

    @FindBy(id = "message")
    private WebElement messageBox;

    @FindBy(id = "submitMessage")
    private WebElement sendBtn;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement verifyMessage;



    public void findElementAndClickFunction(String ElementName){

        switch (ElementName){
            case "contactUsBtn" : myElement = contactUsBtn; break;
            case "sendBtn" : myElement = sendBtn; break;

        }
        clickFuntion(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value){
        switch (ElementName){
            case "emailInput" : myElement = emailInput; break;
            case "orderReference" : myElement = orderReference; break;
            case "messageBox" : myElement = messageBox; break;
        }
        sendKeysFunction(myElement,value);

    }

    public void selectFromDropdown(){
        selectElementFromDropdown(subjectHeadingDropdown,"Webmaster");
    }

    public void assertMyMessage(){
        Assertion(verifyMessage,"Your message has been successfully sent to our team.");
    }
}
