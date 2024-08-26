package AdvanceUserInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        //TS1: Launch Chrome Browser

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize(); //Maximize Window
        Thread.sleep(3000);

        //TS2: Open test URL- https://www.flipkart.com/

        driver.get("https://www.flipkart.com/");
        Thread.sleep(8000);

        //TS3: If found any screen hiding actual page, close the screen -- N/A

        //TS4: Move mouse pointer towards Women

        driver.findElement(By.xpath("//span[text()='Login']")).click(); //Click on Login Button
        Thread.sleep(3000);
        WebElement lnkWomen = driver.findElement(By.xpath("//span[text()='Women']")); //Find web element Women
        Thread.sleep(3000);
        Actions hoverMouse = new Actions(driver);
        hoverMouse.moveToElement(lnkWomen).build().perform(); //Mouse over to Women web element
        lnkWomen.click();
        Thread.sleep(3000);

        //TS5: Click on Shoes

        driver.findElement(By.xpath("//a[text()='Shoes']")).click(); //Click on Shoes under Women web element
        Thread.sleep(3000);
        String actTxt = driver.findElement(By.xpath("//h1[text()=\"Sports Casual Shoes Women's Footwear\"]")).getText(); //Get text after page is loaded
        Thread.sleep(3000);
        String expTxt = "Sports Casual Shoes Women's Footwear";

        System.out.println(actTxt);

        if (actTxt.equals(expTxt)) //Compare actual text vs expected text of the label after page is laoded
        {
            System.out.println("Correct Page is loaded. Test passed");
        }
        else
        {
            System.out.println("CorrectPage is NOT loaded. Test failed");
        }

        //TS6: Close Browser
        driver.close();

    }

}


