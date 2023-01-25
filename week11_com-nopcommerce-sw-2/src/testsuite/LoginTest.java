package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/"; //declare base URL

    @Before
    public void startUp() {
        openBrowser(baseURL); //
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginInLink = driver.findElement(By.className("ico-login")); //find log in element on page
        loginInLink.click(); //click on link

        //verify welcome message
        WebElement welcomeMsg = driver.findElement(By.xpath("//h1[contains(text()," +
                "'Welcome, Please Sign In!')]"));
        String actualText = welcomeMsg.getText(); //declare actual message
        String expectedText = "Welcome, Please Sign In!"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @Test
    public void usershouldLoginSuccessfullyWithValidCredentials() {
        //click on login link
        WebElement loginInLink = driver.findElement(By.className("ico-login")); //find log in element on page
        loginInLink.click(); //click on login link

        //enter email id in to email field
        WebElement emailIdField = driver.findElement(By.id("Email"));
        emailIdField.sendKeys("krunalpatel13@gmail.com"); //send keys to email field

        //enter password into password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("kr12345"); //send keys to password field

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click(); //click on login button

        WebElement logOutLink = driver.findElement(By.className("ico-logout")); //find 'Log out' element
        String actualText = logOutLink.getText(); //get actual message
        String expectedText = "Log out"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }
        @Test
        public void verifyTheErrorMessage() {
            //click on login link
            WebElement loginInLink = driver.findElement(By.className("ico-login")); //find log in element on page
            loginInLink.click(); //click on login link

            //enter email id in to email field
            WebElement emailIdField = driver.findElement(By.id("Email"));
            emailIdField.sendKeys("krunalpatel13@gmail.com"); //send keys to email field

            //enter password into password field
            WebElement passwordField = driver.findElement(By.name("Password"));
            passwordField.sendKeys("kr1234"); //send keys to password field

            //click on login button
            WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
            loginButton.click(); //click on login button

            WebElement errorMsg = driver.findElement(By.xpath("//div[@class=" +
                    "'message-error validation-summary-errors']")); //find error message on page
            String actualText = errorMsg.getText(); //get actual message
            String expectedText = String.valueOf(actualText.matches("Login was unsuccessful"));
    }
    @After
    public void shutDown() {
        closeBrowser(); //close browser
    }

}
