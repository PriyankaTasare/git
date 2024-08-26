package AdvanceUserInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {
    public static void main(String[] args) {


        // Initialize the Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Open the test URL
            driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");

            // Step 3: Drag the slider up to 50%
            WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

            // Get the width of the slider
            int width = slider.getSize().getWidth();

            // Calculate the target location (50% of the width)
            int xOffset = (int) (width * 0.5);

            // Create an Actions object
            Actions actions = new Actions(driver);

            // Drag the slider to the calculated location
            actions.dragAndDropBy(slider, xOffset - slider.getLocation().getX(), 0).perform();

            // Step 4: Close the browser
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
            // Ensure the browser is closed even if an exception occurs
            driver.quit();
        }
    }

}
