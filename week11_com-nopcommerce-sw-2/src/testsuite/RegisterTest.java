package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/"; //declare base URL

    @Before
    public void startUp() {
        openBrowser(baseURL); //open browser
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement registerLink = driver.findElement(By.className("ico-register")); //find Register link
        registerLink.click(); //click on Register link

        //verify the text 'Register'
        WebElement compText = driver.findElement(By.xpath("//div[@class='page-title']" +
                "//h1[text()='Register']"));
        String actualText = compText.getText(); //get actual message
        String expectedText = "Register"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        WebElement registerLink = driver.findElement(By.className("ico-register")); //find Register link
        registerLink.click(); //click on Register link

        //click on male button
        WebElement maleButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        maleButton.click(); //click on male button from gender

        //enter First name into first name field
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Krunal"); //send keys to First Name field

        //enter Last name into first name field
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("Patel"); //send keys to Last Name field

        //choose birthday from dropdown
        WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
        Select selectDay = new Select(dayDropDown);
        selectDay.selectByValue("20"); // select by value

        //choose birthday from dropdown
        WebElement monthDropDown = driver.findElement(By.name("DateOfBirthMonth"));
        Select selectMonth = new Select(monthDropDown);
        selectMonth.selectByValue("5"); // select by value

        //choose birthday from dropdown
        WebElement yearDropDown = driver.findElement(By.name("DateOfBirthYear"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByValue("1990"); // select by value

        //enter email address into email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("krunalpatel13@gmail.com"); //send keys to email field

        //enter password into password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("kr12345"); //send keys to password field

        //enter password into password field
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.sendKeys("kr12345"); //send keys to password field

        //find Register button
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click(); //click on Register button

        //verify the text 'Your registration completed'
        WebElement regCompleteText = driver.findElement(By.xpath("//div[@class='result']"));
        String actualText = regCompleteText.getText(); //get actual message
        String expectedText = "Your registration completed"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @After
    public void shutDown() {
        closeBrowser(); //close browser
    }

    }

