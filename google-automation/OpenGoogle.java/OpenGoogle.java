package com.achieved;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    public static void main(String[] args) {
        // Tell Java where the ChromeDriver is located
    	
System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
        // Start a new Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");
//locate search box and type search query
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("SeleniumWebdriver");
        searchBox.submit();
        System.out.println( "page title is:" +  driver.getTitle()
                );
    

        // Close the browser
        driver.quit();
    }
}

