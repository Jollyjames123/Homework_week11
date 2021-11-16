package homework_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHrm {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//div[@class='textInputContainer'and @id='divUsername']")).click();
        //x-path by text(9)
        // driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        // driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();

        // xpath with starts-with
        //driver.findElement(By.xpath("//img[starts-with(@alt,'LinkedIn')]")).click();

        // xpath with contain
        // driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on Facebook')]")).click();

        // xpath with contain
        // driver.findElement(By.xpath("//img[contains(@alt,'twitter')]")).click();

        //driver.findElement(By.xpath("//a[@href='http://www.youtube.com/orangehrm']")).click();

        // xpath with and
        //driver.findElement(By.xpath("//input[@name = 'txtUsername' and @type='text']")).sendKeys("Admin");

        // xpath with or
        // driver.findElement(By.xpath("//input[@name='txtPassword' or @id='txtPassword']")).sendKeys("admin123");

        //driver.findElement(By.xpath("//input[@id='btnLogin']")).click();


    }
}
