package BrowsweActomationAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignemt5 {
    public static void main(String[] args) {
        // Initialize the Chrome browser
        WebDriver driver = new ChromeDriver();


        // Maximize the browser window
        driver.manage().window().maximize();

        // TC-2: Navigate to Google
        driver.get("https://www.google.com");

        // TC-4: Get the URL of the page
        String currentURL = driver.getCurrentUrl();
        System.out.println("TC-4: URL of the page is: " + currentURL);

        // TC-5: Navigate to Selenium
        driver.get("https://www.selenium.dev/");

        // TC-6: Get the URL of the page
        currentURL = driver.getCurrentUrl();
        System.out.println("TC-6: URL of the page is: " + currentURL);

        // TC-7: Navigate back to Google
        driver.navigate().back();

        // TC-8: Get the URL of the page
        currentURL = driver.getCurrentUrl();
        System.out.println("TC-8: URL of the page is: " + currentURL);

        // TC-9: Navigate forward to Selenium
        driver.navigate().forward();

        // TC-10: Get the URL of the page
        currentURL = driver.getCurrentUrl();
        System.out.println("TC-10: URL of the page is: " + currentURL);

        // TC-11: Refresh the current page
        driver.navigate().refresh();

        // TC-12: Get the URL of the page
        currentURL = driver.getCurrentUrl();
        System.out.println("TC-12: URL of the page is: " + currentURL);

        // Close the browser
        driver.quit();
    }
}
