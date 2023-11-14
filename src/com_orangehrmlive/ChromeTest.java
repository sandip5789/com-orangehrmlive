package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Forgot your password?’ link.
 * 7. Print the current url.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email to email field.
 * 11. Enter the password to password field.
 * 12. Click on Login Button.
 * 13. Close the browser.
 * Created by Sandip Patel
 */

public class ChromeTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // 1 Set up Chrome browser
        WebDriver driver = new ChromeDriver();
        // 2 Open Url
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 3 Print the title of the page
        System.out.println("The tile of the page : " + driver.getTitle());
        // 4 Print the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        // 5 Print the page source
        System.out.println("The page source : " + driver.getPageSource());
        // 6 Click on the 'Forgot your password?' link
        // by using cssSelector tag.class so tag is optional .class
        driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).click();
        // 7 Print the current Url
        System.out.println("The current Url :" + driver.getCurrentUrl());
       // 8 Navigate back to the login page
       driver.navigate().back();
       // 9 Refresh the page
        driver.navigate().refresh();
        // 10 Enter the email to email field / username
        driver.findElement(By.name("username")).sendKeys("prime123@gmail.com");
        // 11 Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("prime123");
        // 12 Click on Login Button
        driver.findElement(By.cssSelector(".oxd-button")).click();
        // 13 Close the browser
        driver.quit();
    }
}
