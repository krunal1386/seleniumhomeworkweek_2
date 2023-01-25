package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest{

    String baseURL = "https://opensource-demo.orangehrmlive.com/"; //declare base URL

    @Before
    public void startUp() {
        openBrowser(baseURL); //open browser
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on forgot password
        WebElement forgotLink = driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p " +
                "orangehrm-login-forgot-header']"));
        forgotLink.click(); //click on forgot password

        //find 'Reset Password' text on page
        WebElement resetPass = driver.findElement(By.xpath("//h6[contains(text(),'')]"));
        String actualText = resetPass.getText(); //get actual message
        String expectedText = "Reset Password"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @After
    public void shutDown() {
        closeBrowser(); //close browser
    }
}