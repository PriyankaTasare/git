package BrowsweActomationAssignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.ArrayList;
import java.util.Set;

public class Assignment4 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable


        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Go to the test URL
        driver.get("https://netbanking.hdfcbank.com/netbanking/");

        // Get the title of the page
        String title1 = driver.getTitle();
        System.out.println("Page Title (0th window): " + title1);

        driver.switchTo().frame("login_page");

        driver.findElement(By.xpath("//*[@id=\"nortonimg1\"]/div[2]/span[2]/a")).click();
        driver.getWindowHandle();

        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        System.out.println("Page title is : " + driver.getTitle());



        // Close the 1th window
        driver.close();

     // TC-9 after switching get the title of page
        driver.switchTo().window(mainWindowHandle);
        System.out.println("Page title is : " + driver.getTitle());

        // Close the 0th window
        driver.quit();


    }
}
