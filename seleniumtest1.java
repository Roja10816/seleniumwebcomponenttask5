package com.selenium.seleniumm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class seleniumtest1 {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver (change the path to your local path)
        //System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the window
            driver.manage().window().maximize();

            // Navigate to the URL with the date picker
            driver.get("http://jqueryui.com/datepicker/");

            // Switch to the iframe that contains the date picker
            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

            // Find the datepicker input field and click it to open the datepicker
            WebElement dateInput = driver.findElement(By.id("datepicker"));
            dateInput.click();

            // Select the date "22" from the date picker
            WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
            dateToSelect.click();

            // Print the selected date in the console (the selected date will appear in the input field)
            System.out.println("Selected Date: " + dateInput.getAttribute("value"));

        } catch (Exception e) {
            e.printStackTrace();
        } 
            // Close the browser window
          
        }
    }










