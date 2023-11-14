package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Check on Multi browser
 */

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //1 Drivers created for chrome setup
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        // 2 Open the Url into browser
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Give implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 3 Print the title of the page
        System.out.println("The title of the page : " + driver.getTitle());
        // 4 Print the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        // 5 Print the page source
        System.out.println("Print the page source : " + driver.getPageSource());
        // 6 Click on 'Forgot your password?' link
        driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).click();
        // 7 Print the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        // 8 Navigate back to the login page
        driver.navigate().back();
        // 9 Refresh the page
        driver.navigate().refresh();
        // 10 Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("prime123@gmail.com");
        // 11 Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("prime123");
        // 12 Click on the Login Button
        driver.findElement(By.cssSelector(".oxd-button")).click();
        // 13 Close the browser
        driver.quit();
    }
}
