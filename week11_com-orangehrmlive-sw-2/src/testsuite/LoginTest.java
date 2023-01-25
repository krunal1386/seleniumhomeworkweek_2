package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseURL = "https://opensource-demo.orangehrmlive.com/"; //declare base URL

    @Before
    public void startUp() {
        openBrowser(baseURL); //open browser
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //enter email id in to email field
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        usernameField.sendKeys("Admin"); //send keys to email field

        //enter password into password field
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("admin123"); //send keys to password field

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click(); //click on login button

        //click on user dropdown button on top right of page
        WebElement userDropDown = driver.findElement(By.className("oxd-userdropdown-name"));
        userDropDown.click(); //click on user dropdown button

        //find 'Logout' element
        WebElement logOutLink = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        String actualText = logOutLink.getText(); //get actual message
        String expectedText = "Logout"; //declare expected message
        String.valueOf(actualText.matches(expectedText)); //partial match text
    }

    @After
    public void shutDown() {
        closeBrowser(); //close browser
    }
}
