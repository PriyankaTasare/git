package BrowsweActomationAssignment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;

public class Assignment1 {
    public static void main(String[] args) {
        // TC-1: Launch Chrome browser

        WebDriver driver = new ChromeDriver();

        // TC-2: Go to test URL
        driver.get("https://netbanking.hdfcbank.com/netbanking/");

        // TC-3: Maximize the browser window
        driver.manage().window().maximize();
         // TC-4 get the title of page
        System.out.println("Page title is : " + driver.getTitle());

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

        driver.switchTo().window(mainWindowHandle);
        System.out.println("Page title is : " + driver.getTitle());


        // TC-10: Close all windows of the browser
        driver.quit();
    }
}
