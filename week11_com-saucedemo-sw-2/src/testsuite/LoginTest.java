package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {

    String baseURL = "https://www.saucedemo.com/"; //declare base URL

    @Before
    public void startUp() {
        openBrowser(baseURL); //open browser
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //enter email id in to email field
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user"); //send keys to email field

        //enter password into password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce"); //send keys to password field

        //click on login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click(); //click on login button

        //verify 'Products' text
        WebElement errorMsg = driver.findElement(By.className("title"));
        String actualText = errorMsg.getText(); //get actual message
        String expectedText = "Products"; //declare expected message
        String.valueOf(actualText.matches(expectedText)); //partial match text
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //enter email id in to email field
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user"); //send keys to email field

        //enter password into password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce"); //send keys to password field

        //click on login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click(); //click on login button

        //find multiple elements by className
        List<WebElement> products = driver.findElements(By.className("inventory_item_name"));
        int numOfProducts = products.size(); //get actual value of products
        int expNumOfProducts = 6; //expected number of products
        Integer.compare(numOfProducts,expNumOfProducts); //match both variables to pass the test
    }

    @After
    public void shutDown() {
        closeBrowser(); //close browser
    }
}
