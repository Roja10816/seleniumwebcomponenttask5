package com.selenium.seleniumm;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class seleniumtest {
	    public static void main(String[] args) {
	        // Set path to chromedriver (downloaded separately)
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Instantiate the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Open a URL
	        driver.get("https://www.google.com");

	        // Close the browser
	        driver.quit();
	    }
	}



