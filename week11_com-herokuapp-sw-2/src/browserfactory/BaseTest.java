package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver; //declare driver variable

    //declare constructor with parameter for the base URL
    public void openBrowser(String baseURL) {
        ChromeOptions options = new ChromeOptions(); //setting Webdriver
        driver = new ChromeDriver(options); //create a driver object
        driver.get(baseURL);//launch the URL
        driver.manage().window().maximize();//maximise browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //implicit time to driver
    }

    //declare instance method to close the browser after test is completed
    public void closeBrowser() {
        driver.quit(); //close browser
    }
}
