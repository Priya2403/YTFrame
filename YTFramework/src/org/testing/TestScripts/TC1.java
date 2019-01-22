package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
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
				
	driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']")).click();
	driver.findElement(By.id("identifierId")).sendKeys("Priya24.abc@gmail.com");
	driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcpriya24");
	driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
	driver.findElement(By.xpath("//span='Trending'")).click();
				
			}
		@AfterMethod
		public  void Close(){
			
		driver.close();	
	}
}
