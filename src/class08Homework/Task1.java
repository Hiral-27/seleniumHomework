package class08Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/*
Task 01-
1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
username=Admin
password=Hum@nhrm123
2. click on PIM option
3. from the table select Any  value of id and click the checkbox associated with it
make sure that ur code is dynamic i.e
changing the id doesn't affect the logic or xpath
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();

        List<WebElement> column=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i < column.size(); i++) {
            String id = column.get(i).getText();

            if (id.equalsIgnoreCase("46415522")) {
                System.out.println(id);
                System.out.println("Index for Id row is : "+(i+1));
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" +(i+1)+"]/td[1]")).click();
            }
        }


    }
}
