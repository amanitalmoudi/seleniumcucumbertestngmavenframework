package com.testautomation.TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		
		// browser type and chromedrover.exe path as parameters
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PFE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com/");  
		  driver.quit();  
		}
		}

