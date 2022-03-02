package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("prema.smsp56@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		password.sendKeys("123456");
		
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		login.click();
		
		 
		 
		 

		 
	
		
		
		
		
		
	}

}
