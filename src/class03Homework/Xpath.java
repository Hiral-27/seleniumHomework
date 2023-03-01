package class03Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
use xpath to complete this
goto http://practice.syntaxtechs.net/basic-first-form-demo.php
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the
web applications around the world.
enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL
 */
public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//button[contains(@onclick,'showInput()')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("20");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("30");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[text()= 'Get Total']")).click();
        String totalValue = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();

        System.out.println("Total value of a + b = " + totalValue);

        Thread.sleep(3000);
        driver.quit();

    }
}