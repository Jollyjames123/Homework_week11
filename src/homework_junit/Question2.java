package homework_junit;

import net.bytebuddy.utility.RandomString;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

/**
 * Homework – 2
 * Navigate to website "https://demo.nopcommerce.com/"
 * Click on the register link.
 * Fill in all the fields.
 * Click on the register button.
 * Verify that the user registered successfully.
 */

public class Question2 extends BaseClass {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatUserCanRegisterSuccessfully() {

        //Click on the register link.
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        //Click on radio button
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        //Enter value in the First Name field
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("charlie");
        //Enter value in the Last Name field
        driver.findElement(By.cssSelector("#LastName")).sendKeys("chaplin");
        //Enter the date of birth
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("25");
        //Entering the month of birth
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("December");
        //Entering the year of birth
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("2000");
        //Generating Random Email
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(emailString()+ "@gmail.com");
        //Entering Company information
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Comedy");
        //Entering Password and Confirm Password
        driver.findElement(By.id("Password")).sendKeys("King999");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("King999");
        //Clicking the register button
        driver.findElement(By.cssSelector("#register-button")).click();
        //Verifying registration
        String expectedMessage = "Your registration completed";
        WebElement message = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = message.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    //RandomEmail Generation Method
    public String emailString() {

        RandomString random = new RandomString(10);
        String randomString = random.nextString();
        return randomString;

    }

    @After
    public void tearDown() {
        closeBrowser();

    }
}
