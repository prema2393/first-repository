package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizonTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.smshorizon.in/");
		driver.manage().window().maximize();
		
		WebElement here = driver.findElement(By.xpath("//a[@rel='nofollow']"));
		here.click();
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Prema");
		
		WebElement mobile = driver.findElement(By.id("mobile"));
		mobile.sendKeys("8754145432");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("prema.smsp56@gmail.com");
		
		WebElement free = driver.findElement(By.name("submit"));
		free.click();
		
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("Rahma");
	    
	    WebElement acti = driver.findElement(By.name("submit"));
	    acti.click();
	    
	    driver.close();
	
	
	
	
	
	}
	
	

}
