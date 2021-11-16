package homework_junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Navigate to google https://www.google.com/
 * In Google search type "demo nopCommerce store" and click search
 * Click on the link "nopCommerce demo store"
 * Click on Computers and Verify that the user successfully navigated to the Computers page.
 * Navigate to google https://www.google.com/
 * In Google search type "demo nopCommerce store" and click search
 * Click on the link "nopCommerce demo store"
 * Click on Electronics and Verify that the user successfully navigated to the Electronics page.
 * Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
 */

public class Question1 extends BaseClass {
    String baseUrl = "https:www.google.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatUserCanNavigateToElectronics() {
        //Agreeing cookies and data information
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        //Click on the link "nopCommerce demo store"
        driver.findElement(By.xpath("//div[@class='TbwUpd NJjxre']//cite[@class='iUh30 tjvcx'and @role='text' and contains(text(),'https://demo.nopcommerce.com')]")).click();
        //Verifying that the user successfully navigate on the page.
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics ')]")).click();
        //Saving expected message as a String
        String expectedMessage = "Electronics";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = message.getText();//Converting WebElement into String
        Assert.assertEquals(expectedMessage, actualMessage);//Verifying using the assertEquals method
    }

    @Test
    public void verifyThatUserCanNavigateToApparelsPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Apparel")).click();
        String expectedMessage3 = "Apparel";
        WebElement message3 = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage3 = message3.getText();
        Assert.assertEquals(expectedMessage3, actualMessage3);
    }


    @Test
    public void verifyThatUserCanNavigateToDigitalDownloadsPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedMessage4 = "Digital downloads";
        WebElement message4 = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage4 = message4.getText();
        Assert.assertEquals(expectedMessage4, actualMessage4);

    }

    @Test
    public void verifyThatUserCanNavigateToBooksPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Books")).click();
        String expectedMessage5 = "Books";
        WebElement message5 = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage5 = message5.getText();
        Assert.assertEquals(expectedMessage5, actualMessage5);

    }

    @Test
    public void verifyThatUserCanNavigateToJewelleryPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedMessage6 = "Jewelry";
        WebElement message6 = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage6 = message6.getText();
        Assert.assertEquals(expectedMessage6, actualMessage6);

    }

    @Test
    public void verifyThatUserCanNavigateToGiftCardsPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedMessage = "Gift Cards";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = message.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}