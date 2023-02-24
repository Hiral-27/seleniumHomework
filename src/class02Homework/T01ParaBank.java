package class02Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01ParaBank {
    /*
    Task 1:
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Selena");
        driver.findElement(By.id("customer.lastName")).sendKeys("Gomez");
        driver.findElement(By.name("customer.address.street")).sendKeys("Grand Prairie, Texas");
        driver.findElement(By.name("customer.address.city")).sendKeys("Grand Prairie");
        driver.findElement(By.id("customer.address.state")).sendKeys("Texas");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("750050");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("1234567890");
        driver.findElement(By.name("customer.ssn")).sendKeys("9876543210");
        driver.findElement(By.id("customer.username")).sendKeys("Selena@gmail.com");
        driver.findElement(By.id("customer.password")).sendKeys("Selena123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Selena123");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.quit();



    }
}
