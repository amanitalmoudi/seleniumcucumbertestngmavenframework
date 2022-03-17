package com.testautomation.StepDef;
	



import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testautomation.Utility.PropertiesFileReader;

import cucumber.api.java.en.*;





public class YoutubeSearchStepDef {
	public static WebDriver driver;
	PropertiesFileReader obj= new PropertiesFileReader();  
    
	@Given("^Open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{   
		Properties properties=obj.getProperty();   
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PFE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(properties.getProperty("browser.baseURL"));
		Thread.sleep(3000);	 	   
	}

	@When("^Enter search creteria$")
	public void enter_search_creteria() throws Throwable 
	{
		driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys("FIS");
	//driver.findElement(By.id("search")).sendKeys("FIS");		
	
		Thread.sleep(2000);	 	    
	}

	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable 
	{   driver.findElement(By.xpath("")).click();
		//driver.findElement(By.cssSelector("search-icon-legacy")).click();	
		Thread.sleep(3000);	 	
		driver.quit();
	}
	

}
