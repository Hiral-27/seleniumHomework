package class07Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task04 {
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

        driver.findElement(By.xpath("//button[@id='enable-button']")).click();

        WebDriverWait wait= new WebDriverWait(driver, 20);
        WebElement button= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='disable']")));
        System.out.println(button.isDisplayed());
    }
}
