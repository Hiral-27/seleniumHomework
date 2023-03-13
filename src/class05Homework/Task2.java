package class05Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
HW2
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page
 */
public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Switching to the iframe
        WebElement frame1= driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        driver.switchTo().frame(frame1);

        // Clearing the existing text from the iframe
        WebElement textBox= driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.clear();

        // Writing new text--> Hello World!
        textBox.sendKeys("Hello World!");

        // Switch back to the main page
        driver.switchTo().defaultContent();



    }

}
