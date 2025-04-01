package com.selenium.seleniumm;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.WebElement;

	public class DragAndDropAutomation {

	    public static void main(String[] args) {
	        // Set the path to your chromedriver (adjust the path to your actual chromedriver location)
	        //System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");

	        // Initialize the WebDriver (ChromeDriver)
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Maximize the window
	            driver.manage().window().maximize();

	            // Step 1: Navigate to the URL
	            driver.get("https://jqueryui.com/droppable/");

	            // Step 2: Switch to the iframe that contains the droppable area
	            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

	            // Step 3: Find the source element (drag me to my target) and the target element (drop here)
	            WebElement sourceElement = driver.findElement(By.id("draggable"));
	            WebElement targetElement = driver.findElement(By.id("droppable"));

	            // Step 4: Perform the drag and drop operation
	            Actions actions = new Actions(driver);
	            actions.dragAndDrop(sourceElement, targetElement).build().perform();

	            // Step 5: Verify the success by checking the color of the target element's CSS property
	            String targetElementColor = targetElement.getCssValue("background-color");
	            System.out.println("Target Element's Background Color: " + targetElementColor);

	            // Step 6: Verify the text of the target element has changed to "Dropped!"
	            String targetElementText = targetElement.getText();
	            System.out.println("Target Element's Text: " + targetElementText);

	            // Validate if the drop was successful
	            if (targetElementText.equals("Dropped!")) {
	                System.out.println("Test Passed: The element has been successfully dropped!");
	            } else {
	                System.out.println("Test Failed: The element has not been dropped successfully.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	          
	        }
	    }
	}



