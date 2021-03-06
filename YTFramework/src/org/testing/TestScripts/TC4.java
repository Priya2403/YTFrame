package org.testing.TestScripts;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 {

	public ChromeDriver  driver;
	@BeforeMethod
	public  void OpenBrowser(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//Code to Switch off the browser notification
			//Create prefs map to store all preferences
			HashMap<String, Object> prefs = new HashMap<String, Object>();		
			//Put this into prefs map to switch off browser notification
			prefs.put("profile.default_content_setting_values.notifications", 2);	
			//Create chrome options to set this prefs
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			
			driver = new ChromeDriver(options);
			driver.navigate().to("https://www.youtube.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}	

 @Test
	public  void loginPlayAndSubsc(){
				
	 driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("priya24.abc@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		try {			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcpriya24");
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcpriya24");
		}	
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		List<WebElement> ls= driver.findElements(By.id("video-title"));
		ls.get(0).click();
		WebElement Subs= driver.findElement(By.cssSelector("yt-formatted-string[name='style-scope ytd-subscribe-button-renderer']"));
		Subs.click();		
				
				
			}
 /*@AfterMethod	// Browser close
		public  void Close(){
			
		driver.close();	
	}*/
}
