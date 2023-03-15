package class07Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task01 {
    public static void main(String[] args) {
        // 1. tell your project where the webdriver is located & to connect your class with the WEBDRIVER
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // 2. create an instance of the webdriver
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // 3. open website
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        // 4. Click on the button
        driver.findElement(By.xpath("//button[@id='alert']")).click();

        // 5. Add Explicit Wait
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());

        // 6. Switch to alert and accept it
        driver.switchTo().alert().accept();
    }
}
