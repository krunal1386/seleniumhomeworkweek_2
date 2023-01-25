package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/"; //declare base URL

    @Before
    public void startUp() {
        openBrowser(baseURL); //open browser
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement compTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']" +
                "//a[text()='Computers ']")); //find Computers Tab on Top Menu Tabs
        compTab.click(); //click on Computers Tab

        //verify the title 'Computers'
        WebElement compText = driver.findElement(By.xpath("//div[@class='page-title']" +
                "//h1[text()='Computers']"));
        String actualText = compText.getText(); //get actual message
        String expectedText = "Computers"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement elecTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']" +
                "//a[text()='Electronics ']")); //find Electronics Tab on Top Menu Tabs
        elecTab.click(); //click on Electronics Tab

        //verify the title 'Electronics'
        WebElement compText = driver.findElement(By.xpath("//div[@class='page-title']" +
                "//h1[text()='Electronics']"));
        String actualText = compText.getText(); //get actual message
        String expectedText = "Electronics"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement elecTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']" +
                "//a[text()='Apparel ']")); //find Apparel Tab on Top Menu Tabs
        elecTab.click(); //click on Apparel Tab

        //verify the title 'Apparel'
        WebElement compText = driver.findElement(By.xpath("//div[@class='page-title']" +
                "//h1[text()='Apparel']"));
        String actualText = compText.getText(); //get actual message
        String expectedText = "Apparel"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement digitalDownTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']" +
                "//a[text()='Digital downloads ']")); //find Digital downloads Tab on Top Menu Tabs
        digitalDownTab.click(); //click on Digital downloads Tab

        //verify the title 'Digital downloads'
        WebElement compText = driver.findElement(By.xpath("//div[@class='page-title']" +
                "//h1[text()='Digital downloads']"));
        String actualText = compText.getText(); //get actual message
        String expectedText = "Digital downloads"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement booksTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']" +
                "//a[text()='Books ']")); //find Books Tab on Top Menu Tabs
        booksTab.click(); //click on Books Tab

        //verify the title 'Books'
        WebElement compText = driver.findElement(By.xpath("//div[@class='page-title']" +
                "//h1[text()='Books']"));
        String actualText = compText.getText(); //get actual message
        String expectedText = "Books"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement jewelryTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']" +
                "//a[text()='Jewelry ']")); //find Jewelry Tab on Top Menu Tabs
        jewelryTab.click(); //click on Jewelry Tab

        //verify the title 'Jewelry'
        WebElement compText = driver.findElement(By.xpath("//div[@class='page-title']" +
                "//h1[text()='Jewelry']"));
        String actualText = compText.getText(); //get actual message
        String expectedText = "Jewelry"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement giftCardsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']" +
                "//a[text()='Gift Cards ']")); //find Gift Cards Tab on Top Menu Tabs
        giftCardsTab.click(); //click on Gift Cards Tab

        //verify the title 'Gift Cards'
        WebElement compText = driver.findElement(By.xpath("//div[@class='page-title']" +
                "//h1[text()='Gift Cards']"));
        String actualText = compText.getText(); //get actual message
        String expectedText = "Gift Cards"; //declare expected message
        Assert.assertEquals(expectedText, actualText); //match text for test to pass
    }

    @After
    public void shutDown() {
        closeBrowser(); //close browser
    }
}


