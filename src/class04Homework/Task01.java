package class04Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check gain if the checkbox is Selected or not
 */
public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkBox= driver.findElement(By.cssSelector("input#isAgeSelected"));
        boolean boxSelected= checkBox.isSelected();

        System.out.println("Is check box selected? "+boxSelected);
        if(!boxSelected){
            checkBox.click();
        }
        boxSelected= checkBox.isSelected();
        System.out.println("Is check box selected? "+boxSelected);

    }
}