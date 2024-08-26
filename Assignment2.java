package AdvanceUserInteractions;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
    public static void main(String[] args) {


        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Launch Chrome browser
            driver.manage().window().maximize();

            // Step 2: Open test URL
            driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");

            // Step 3: Double click on Double-Click Me to see Alert Button to generate Alert
            WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
            Actions action = new Actions(driver);
            action.doubleClick(doubleClickButton).perform();



            // Step 4: Accept Alert
            Alert alert = driver.switchTo().alert();
            alert.accept();

            // Add a wait if necessary
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close browser
           // driver.quit();
        }
    }

}
