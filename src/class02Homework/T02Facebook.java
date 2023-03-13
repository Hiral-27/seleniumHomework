package class02Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02Facebook {
    /*
    Task 2:
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
    TIP for HW2:
    just fill in text boxes or button, no need to deal with other webElements
    also u will need a Thread.sleep after clicking on create new account
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Taylor");
        driver.findElement(By.name("lastname")).sendKeys("Swift");
        driver.findElement(By.name("reg_email__")).sendKeys("Taylor@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Taylor@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Taylor123");
        driver.findElement(By.name("birthday_day")).sendKeys("13");
        driver.findElement(By.name("birthday_month")).sendKeys("12");
        driver.findElement(By.name("birthday_year")).sendKeys("1989");
       // driver.findElement(By.className("_8idr img")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
