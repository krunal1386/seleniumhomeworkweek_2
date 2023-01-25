package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseURL = "http://the-internet.herokuapp.com/login"; //declare base URL

    @Before
    public void startUp() {
        openBrowser(baseURL); //open browser
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //enter email id in to email field
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith"); //send keys to email field

        //enter password into password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!"); //send keys to password field

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='radius']"));
        loginButton.click(); //click on login button

        //find 'Secure Area' text
        WebElement errorMsg = driver.findElement(By.id("flash"));
        String actualText = errorMsg.getText(); //get actual message
        String expectedText = "secure area"; //declare expected message
        String.valueOf(actualText.matches(expectedText)); //partial match text
    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        //enter email id in to email field
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith1"); //send keys to email field

        //enter password into password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!"); //send keys to password field

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='radius']"));
        loginButton.click(); //click on login button

        //verify error message
        WebElement errorMsg = driver.findElement(By.id("flash-messages"));
        String actualText = errorMsg.getText(); //get actual message
        String expectedText = "Your username is invalid!"; //declare expected message
        String.valueOf(actualText.matches(expectedText)); //partial match text
    }

    @Test
    public void verifyThePasswordErrorMessage() {
        //enter email id in to email field
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith"); //send keys to email field

        //enter password into password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword"); //send keys to password field

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='radius']"));
        loginButton.click(); //click on login button

        //verify error message
        WebElement errorMsg = driver.findElement(By.id("flash"));
        String actualText = errorMsg.getText(); //get actual message
        String expectedText = "Your password is invalid!"; //declare expected message
        String.valueOf(actualText.matches(expectedText)); //partial match text
    }

    @After
    public void shutDown() {
        closeBrowser(); //close browser
    }
}
