package AdvanceUserInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {

    public static void main(String[] args) {


        // Initialize the Chrome browser
        WebDriver driver = new ChromeDriver();


            // Step 2: Open the test URL
            driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");

            // Step 3: Right click on the "Double-Click Me to See Alert" button
            WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
            Actions actions = new Actions(driver);
            actions.contextClick(button).perform();

            // Step 4: Close the browser
           // driver.quit();


    }

}
