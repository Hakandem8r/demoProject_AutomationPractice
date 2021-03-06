package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;


    public static WebDriver getDriver(){
        if (driver == null){
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           driver.manage().deleteAllCookies();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }
}
