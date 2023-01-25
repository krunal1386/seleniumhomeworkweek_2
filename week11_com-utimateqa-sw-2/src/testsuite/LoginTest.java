package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseURL = "https://courses.ultimateqa.com/"; //declare base URL

    @Before
    public void startUp() {
        openBrowser(baseURL); //open browser
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on sign in link
        WebElement signInLink = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
        signInLink.click(); //click on link

        //verify welcome message
        WebElement welcomeMsg = driver.findElement(By.className("page__heading"));
        String actualText = welcomeMsg.getText(); //get actual message
        String expectedText = "Welcome Back!"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @Test
    public void verifyTheErrorMessage() {
        //click on sign in link
        WebElement signInLink = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
        signInLink.click(); //click on link

        //enter email id in to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("nishvek10@gmail.com"); //send keys to email field

        //enter password into password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("Admin12345"); //send keys to password field

        //click on sign in button
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click(); //click on sign in button

        //verify error message
        WebElement errorMsg = driver.findElement(By.className("form-error__list-item"));
        String actualText = errorMsg.getText(); //get actual message
        String expectedText = "Invalid email or password";
        String.valueOf(actualText.matches(expectedText)); //partial match text
    }

    @After
    public void shutDown() {
        closeBrowser(); //close browser
    }
}
