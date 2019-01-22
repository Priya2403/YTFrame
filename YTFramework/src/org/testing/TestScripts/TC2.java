package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 {

	public ChromeDriver  driver;
	@BeforeMethod
	public  void OpenBrowser(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.youtube.com");
			driver.manage().window().maximize();
	}	

 @Test
	public  void loginAndClick(){
				
	driver.findElement(By.xpath("//yt-formatted-string[text()='sign in']")).click();
	driver.findElement(By.id("identifierId")).sendKeys("kunwarpriya24@gmail.com");
	driver.findElement(By.className("ZFr60d CeoRYc")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Priya24@");
	driver.findElement(By.xpath("//div='passwordNext'")).click();
	driver.findElement(By.xpath("//span='Subscriptions'")).click();
				
			}
		@AfterMethod
		public  void Close(){
			
		driver.close();	
	}
}