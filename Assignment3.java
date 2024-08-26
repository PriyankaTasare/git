package BrowsweActomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.ArrayList;

public class Assignment3 {
    public static void main(String[] args) {


        // Initialize Firefox browser
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);

        try {
            // Step 2: Go to the test URL
            driver.get("https://netbanking.hdfcbank.com/netbanking/");

            // Step 3: Maximize the browser window
            driver.manage().window().maximize();

            // Step 4: Get the title of the page
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            // Step 5: Click on the 'Know More' link text
            driver.switchTo().frame("login_page");

            driver.findElement(By.xpath("//*[@id=\"nortonimg1\"]/div[2]/span[2]/a")).click();
            driver.getWindowHandle();

            // Step 6: Switch from 0th window to 1st window
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

            // Step 7: Get the title of the new page
            String newPageTitle = driver.getTitle();
            System.out.println("New Page Title: " + newPageTitle);

            // Step 8: Switch from 1st window to 0th window
            driver.switchTo().window(tabs.get(0));

            // Step 9: Get the title of the original page
            String originalPageTitle = driver.getTitle();
            System.out.println("Original Page Title: " + originalPageTitle);

            // Step 10: Close all windows of the browser
           driver.quit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}