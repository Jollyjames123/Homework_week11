package homework_junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question4 extends BaseClass{
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatUserCanVerifyText() {

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        String expectedText = "Welcome Paul";
        String actualText = driver.findElement(By.xpath("//a[@id='welcome']")).getText();

        if (expectedText.equals(actualText)) {
            System.out.println("Result PASS - Text is matching");
        } else {
            System.out.println("Result FAIL - Text is not matching");
        }
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

        String expectedText1 = "LOGIN Panel";
        WebElement text = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
        String actualText1 = text.getText();
        Assert.assertEquals(expectedText1, actualText1);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
    }
