package class01Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        /*
        Task 1:
        * 1. launch the browser
        * 2. navigate to amazon web site
        * 3. print out the title and the url in the console
        * 4. close the browser
         */

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String URL= driver.getCurrentUrl();
        System.out.println(URL);
        String title= driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
